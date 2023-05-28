package br.sp.petaltech.vendas.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Venda {
    int idVenda;
    int idCliente;
    double valorVenda;
    int numeroItens;
    Date data;
    ArrayList <ItemVenda> listaProdutos;
    Calendar calendario = Calendar.getInstance();
    Calendar c;

    public Venda() {
    }

    public Venda(int idVenda, int idCliente, double valorVenda, int numeroItens, Date data, ArrayList<ItemVenda> listaProdutos, Calendar c) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.valorVenda = valorVenda;
        this.numeroItens = numeroItens;
        this.data = data;
        this.listaProdutos = listaProdutos;
        this.c = c;
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

    public ArrayList<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public Calendar getC() {
        return c;
    }

    public void setC(Calendar c) {
        this.c = c;
    }
    
    
    
    
}
