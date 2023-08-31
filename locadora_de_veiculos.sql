create database locadora_de_veiculos;
use locadora_de_veiculos;
create table usuario(
login varchar(20) not null unique,
senha VARCHAR(20) NOT NULL,
PRIMARY KEY (login)
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
cpf varchar(14) not null unique,
nome VARCHAR(50) NOT NULL unique,
telefone varchar(17) not null unique,
nascimento date,
email VARCHAR(30) NOT NULL unique,
 primary key(cpf)
);
