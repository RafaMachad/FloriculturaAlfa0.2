package br.sp.petaltech.vendas.model;

import br.sp.petaltech.produtos.Produtos;

public class ItemVenda {
    int idVenda;
    int idItemVenda;
    int idProduto;
    int qtdProduto;
    double valorUnitario;
    
    public ItemVenda (){
        
    }
    
    public ItemVenda (Produtos produto){
        this.idProduto = produto.getCod();
        this.qtdProduto = produto.getQtdEstoque();
        this.valorUnitario = produto.getPc();
    }
    
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
