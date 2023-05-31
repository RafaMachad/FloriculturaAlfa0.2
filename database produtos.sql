use petaltech;

insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (1, "rosa", 24.99, "flor rosa", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (2, "margarida", 25.49, "flor amarela", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (3, "orquidea", 29.99, "flor branca", 5);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (4, "girassol", 14.99, "flor amarela", 5);

delete from produtos where IDproduto>=0 and 4;

select * from produtos