create database locadora_de_veiculos;
use locadora_de_veiculos;
create table usuario(
id_usuario INT NOT NULL AUTO_INCREMENT,
email VARCHAR(30) NOT NULL unique,
senha VARCHAR(20) NOT NULL,
fk_id_cliente int not null,
foreign key(fk_id_cliente) references cliente(id_cliente),
PRIMARY KEY (id_usuario)
);

create table cliente(
id_cliente INT NOT NULL AUTO_INCREMENT,
cpf varchar(14) not null unique,
nome VARCHAR(50) NOT NULL unique,
telefone varchar(17) not null unique,
nascimento date not null,
endereço varchar(50),
email VARCHAR(30) NOT NULL unique,
 primary key(id_cliente)
);

create table veiculo(
id_veiculo INT NOT NULL AUTO_INCREMENT,
modelo varchar(20) not null,
placa varchar(7) not null unique,
cor varchar (20) not null,
vl_diaria decimal(15,2) not null,
qtd_portas int not null,
qtd_acentos int not null,
KM int not null,
primary key (id_veiculo)
);

create table pagamento(
id_pagamento INT NOT NULL AUTO_INCREMENT,
descriçao varchar(50),
primary key (id_pagamento)
);

create table aluguel(
id_aluguel INT NOT NULL AUTO_INCREMENT, 
nmr_vendedor varchar(10),
dat_retirada date not null,
dat_devoluçao date not null,
vlr_total decimal(15,2),
vlr_taxa decimal(15,2),
pagamento int not null,
fk_id_pagamento int not null,
foreign key(fk_id_pagamento) references  pagamento(id_pagamento),
fk_veiculo int not null,
foreign key(fk_veiculo) references veiculo(id_veiculo),
fk_cliente int not null,
foreign key(fk_cliente) references cliente(id_cliente),
primary key (id_aluguel)
);

create table reserva_veiculo(
fk_id_aluguel int not null unique,
foreign key(fk_id_aluguel) references aluguel(id_aluguel),
fk_pagamento int not null,
foreign key(fk_pagamento) references aluguel(pagamento),
fk_veiculo int not null,
foreign key(fk_veiculo) references aluguel(fk_veiculo),

primary key (fk_id_aluguel)
);