use petaltech;

insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (1, "rosa", 24.99, "flor", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (2, "margarida", 25.49, "flor", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (3, "orquidea", 29.99, "flor", 5);

delete from produtos where IDproduto>=0 and 4;


alter table itemvenda drop column idItemVenda;

alter table venda drop column idItemVenda;

drop table produtos;

select * from p;