create database petaltech;

use petaltech;

create table venda (
	idVenda int auto_increment,
    idCliente int,
    data date,
    
    primary key (idVenda)
);

create table itemvenda (
	idVenda int, -- fk
    idItemVenda int auto_increment, -- pk
    idProduto int, -- fk
    qtdProduto int,
    valorUnitario double,
    primary key (idItemVenda)
);

alter table itemvenda add foreign key idProduto references 