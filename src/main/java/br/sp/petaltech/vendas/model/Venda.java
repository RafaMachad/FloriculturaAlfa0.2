package br.sp.petaltech.vendas.model;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    int idVenda;
    int idCliente;
    double valorVenda;
    int numeroItens;
    Date data;
    ArrayList <ItemVenda> listaItens;

    public Venda() {
    }

    public Venda(int idVenda, int idCliente, double valorVenda, int numeroItens, Date data, ArrayList<ItemVenda> listaItens) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.valorVenda = valorVenda;
        this.numeroItens = numeroItens;
        this.data = data;
        this.listaItens = listaItens;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getNumeroItens() {
        return numeroItens;
    }

    public void setNumeroItens(int numeroItens) {
        this.numeroItens = numeroItens;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<ItemVenda> getlistaItens() {
        return listaItens;
    }

    public void setlistaItens(ArrayList<ItemVenda> listaItens) {
        this.listaItens = listaItens;
    }
    
}
