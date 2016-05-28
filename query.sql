create database crud_java;

use crud_java;

create table clientes
(
	codigo int(6) auto_increment primary key,
  nome varchar(30) not null,
  endereco varchar (100) not null,
  telefone varchar(20) not null
);

insert into clientes (nome, endereco, telefone) values ('Arthur Ferreira', 'Rua dos Efeitos, 185', '555-444');
insert into clientes (nome, endereco, telefone) values ('Odinei Ribeiro', 'Rua dos Trilhos, 222', '555-333');
