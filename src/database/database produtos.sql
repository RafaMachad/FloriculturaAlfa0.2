insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (2, "margarida", 15.49, "flo brancar", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (3, "orquidea", 9.99, "flor meio rosa", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (4, "tulipa amarela", 9.99, "flor amarela", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (5, "tulipa vermelha", 9.99, "flor vermelha", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (6, "rosa rugosa", 9.99, "flor", 20);
insert into produtos (IDproduto, nome, precoVenda, descricao, qtdEstoque) values (7, "rosa", 14.99, "flor vermelha", 20);

DELETE FROM itemvenda WHERE idProduto >= 0 AND idProduto <= 8;

DELETE FROM produtos WHERE idProduto >= 0 AND idProduto <= 8;
