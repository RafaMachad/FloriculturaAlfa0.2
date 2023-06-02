drop table itemvenda;

alter table itemvenda add column valorunit double;

insert into itemvenda (iditemvenda, idvenda, idproduto, qtdproduto, valorunit, valor) values (2, 1, 1, 3, 24.99, valorunit*3);

select*from itemvenda