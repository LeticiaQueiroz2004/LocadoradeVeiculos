);
CREATE DATABASE locadora_de_veiculos;
USE locadora_de_veiculos;

CREATE TABLE Usuarios(
         id_usuario INT PRIMARY KEY AUTO_INCREMENT,
         email VARCHAR(30) UNIQUE,
         senha VARCHAR(20),
);


CREATE TABLE Cliente(
        id_cliente INT PRIMARY KEY AUTO_INCREMENT,
        cpf VARCHAR(14) UNIQUE,
        nome VARCHAR(50),
        telefone VARCHAR(17),
        nascimento DATE,
        endereço VARCHAR(50),
        email VARCHAR(30),
        fk_usuario INT,
        FOREIGN KEY(fk_usuario) REFERENCES Usuarios(id_usuario)
);


CREATE TABLE Car(
        id_veiculo INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(20),
        image VARCHAR(400),
        placa VARCHAR(7) UNIQUE,
        cor VARCHAR (20),
        vl_diaria DECIMAL(15,2),
        qtd_portas INT,
        qtd_acentos INT,
        KM_rodados INT
);


CREATE TABLE Pagamento(
          id_pagamento INT PRIMARY KEY AUTO_INCREMENT,
          descriçao VARCHAR(50),
);


CREATE TABLE aluguel(
        id_aluguel INT PRIMARY KEY AUTO_INCREMENT,
        nmr_vendedor VARCHAR(10),
        dat_retirada DATE,
        dat_devoluçao DATE,
        vlr_total DECIMAL(15,2),
        vlr_taxa DECIMAL(15,2),
        pagamento INT,
        fk_id_pagamento INT,
        fk_veiculo INT,
        fk_cliente INT,
        FOREIGN KEY(fk_id_pagamento) REFERENCES  pagamento(id_pagamento),
        FOREIGN KEY(fk_veiculo) REFERENCES veiculo(id_veiculo),
        FOREIGN KEY(fk_cliente) REFERENCES cliente(id_cliente)
);


CREATE TABLE reserva_veiculo(
        fk_id_aluguel INT PRIMARY KEY AUTO_INCREMENT,
        fk_pagamento INT,
        fk_veiculo INT,
        FOREIGN KEY(fk_id_aluguel) REFERENCES aluguel(id_aluguel),
        FOREIGN KEY(fk_pagamento) REFERENCES aluguel(pagamento),
        FOREIGN KEY(fk_veiculo) REFERENCES aluguel(fk_veiculo)
);