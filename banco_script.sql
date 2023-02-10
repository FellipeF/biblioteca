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
	id int primary key auto_increment,
    foreign key(id) references estudante(id),
    isbn varchar(25) not null,
    nome_livro varchar(40) not null,
    nome_estudante varchar(50) not null,
    data_aluguel timestamp default current_timestamp
);