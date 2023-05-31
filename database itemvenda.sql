drop table itemvenda;

alter table itemvenda add column valor double;

insert into itemvenda (iditemvenda, idvenda, idproduto, qtdproduto, valorunit, valor) values (3, 1, 1, 3, 24.99, valorunit*3);

alter table venda add column numeroItens int;
alter table venda add column valor double;

alter table itemvenda drop column valorunit;

select * from itemvenda;