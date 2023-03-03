create database biblioteca;

use biblioteca;

create table livro(
	id int primary key auto_increment,
	nome varchar(40) not null,
	isbn varchar (25) not null,
	autor varchar(30) not null,
	genero varchar(20) not null,
	paginas smallint not null,
	edicao tinyint not null,
	quantidade tinyint not null,
	secao tinyint not null,
	contemimagem bool
);

create table estudante(
	id int primary key auto_increment,
	nome varchar(50) not null,
	email varchar(50) not null unique,
	telefone varchar(20) not null unique,
	matricula varchar(20) not null unique,
	cpf varchar(20) not null unique,
	codigo_acesso varchar(15) not null,
	atrasado bool
);
    
create table funcionario(
   	id int primary key auto_increment,
   	nome varchar(50) not null,
   	cpf varchar(20) not null unique,
   	telefone varchar(20) not null unique,
   	email varchar(50) not null unique,
   	codigo_acesso varchar(15) not null
);

create table aluguel_livro(
	id_aluguel int auto_increment,
	id_livro int,
	id_estudante int,
	PRIMARY KEY (id_aluguel, id_livro, id_estudante), 
	foreign key(id_livro) references livro(id),
	foreign key(id_estudante) references estudante(id),
	data_aluguel timestamp default current_timestamp
);

insert into funcionario (nome,cpf,telefone,email,codigo_acesso)
values('admin','12345678900','(74)99999-9999','admin@univasf.edu.br','acesso');

insert into estudante (nome,email,telefone,matricula,cpf,codigo_acesso,atrasado)
values ('estudante','estudante@univasf.edu.br','(74)8888-8888','1234','1478','998877',false);