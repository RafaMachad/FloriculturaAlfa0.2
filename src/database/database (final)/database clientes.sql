insert into clientes (idCliente, nome, cpf, email) values (1, "Breno L Santos", "123.456.788-90", "breno@petaltech.com");
insert into clientes (idCliente, nome, cpf, email) values (2, "Leonardo F Serra", "234.567.898-01", "leonardo@petaltech.com");
insert into clientes (idCliente, nome, cpf, email) values (3, "Pedro H Siva", "345.678.908-12", "pedro@petaltech.com");
insert into clientes (idCliente, nome, cpf, email) values (4, "Rafael M Ribeiro", "456.789.018-23", "rafael@petaltech.com");
insert into clientes (idCliente, nome, cpf, email) values (5, "Matheus", "567.890.128-34", "matheus@petaltech.com");

SELECT *
FROM itemvenda
JOIN venda ON itemvenda.idvenda = venda.idvenda;