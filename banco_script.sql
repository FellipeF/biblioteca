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
    	email varchar(25) not null,
    	telefone varchar(20) not null,
    	matricula varchar(20) not null,
    	cpf varchar(20) not null,
   	codigo_acesso varchar(15) not null,
    	atrasado bool
);
    
create table funcionario(
   	id int primary key auto_increment,
   	nome varchar(50) not null,
   	cpf varchar(20) not null,
   	telefone varchar(20) not null,
   	email varchar(20) not null,
   	codigo_acesso varchar(15) not null
);

create table aluguel_livro(
	id_alugel int auto_increment,
	id_livro int,
	id_estudante int,
	PRIMARY KEY (id_aluguel, id_livro, id_estudante) 
	foreign key(id_livro) references livro(id),
	foreign key(id_estudante) references estudante(id),
    	data_aluguel timestamp default current_timestamp
);