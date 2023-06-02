ALTER TABLE venda
ADD CONSTRAINT fk_venda_cliente
FOREIGN KEY (idCliente) REFERENCES clientes(idCliente);

ALTER TABLE itemvenda
ADD CONSTRAINT fk_itemvenda_venda
FOREIGN KEY (idVenda) REFERENCES venda(idVenda);

ALTER TABLE itemvenda
ADD CONSTRAINT fk_itemvenda_produto
FOREIGN KEY (idProduto) REFERENCES produtos(IDproduto);