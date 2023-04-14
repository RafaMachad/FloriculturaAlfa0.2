/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.floriculturaalfa;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Produtos {

    private String nome;
//    private double preco;
//    private int QtdEstoque;
//    private String desc;

    public Produtos(String nome){//, double preco, int quantidadeEmEstoque, String desc) {
        this.nome = nome;
//        this.preco = preco;
//        this.QtdEstoque = QtdEstoque;
//        this.desc = desc;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Object[] obterDados() {
        return new Object[] {nome};
        
    }
}//deletar uma chave

//    public double getPreco() {
//        return preco;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    public int getQtdEstoque() {
//        return QtdEstoque;
//    }
//
//    public void setQtdEstoque(int QtdEstoque) {
//        this.QtdEstoque = QtdEstoque;
//    }
//
//    public void setDesc(String desc) {
//        this.nome = desc;
//    }
//}
