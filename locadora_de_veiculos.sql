create database locadora_de_veiculos;
use locadora_de_veiculos;
create table usuario(
id_usuario INT NOT NULL AUTO_INCREMENT,
email VARCHAR(30) NOT NULL unique,
senha VARCHAR(20) NOT NULL,
fk_id_cliente int not null ,
foreign key(fk_id_cliente) references cliente(id_cliente),
PRIMARY KEY (id_usuario)
);

create table veiculos(
marcas varchar(15) not null,
modelo varchar(20) not null,
placa varchar(7) not null unique,
condicao varchar(15) not null,
preço double not null,
KM int not null,
primary key (placa)
);

create table cliente(
id_cliente INT NOT NULL AUTO_INCREMENT,
cpf varchar(14) not null unique,
nome VARCHAR(50) NOT NULL unique,
telefone varchar(17) not null unique,
nascimento date,
email VARCHAR(30) NOT NULL unique,
 primary key(cpf)
);
