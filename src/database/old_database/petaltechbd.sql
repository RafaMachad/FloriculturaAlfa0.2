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

alter table itemvenda add foreign key (idProduto) references produtos(IDproduto) on delete set null;

alter table itemvenda add foreign key (idVenda) references venda(idVenda) on delete set null;

alter table itemvenda drop foreign key itemvenda_ibfk_2;

sudo mysql