/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.petaltech.clientes;

/**
 *
 * @author Pedro
 */
public class Clientes {
    
    String nome;
    int cpf;
    int telefone;
    String email;
    char sexo;
    int data;
    int cep;
    String uf;
    String bairro;
    String rua;
    int numero;
    String complemento;
    
    public Clientes (int cpf, int telefone, int data){     
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.email = email;
    this.sexo = sexo;
    this.data = data;
    this.cep = cep;
    this.uf = uf;
    this.bairro = bairro;
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;        
    }
    
    public Clientes(){
        
    }
    
    //getters 

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public char getSexo() {
        return sexo;
    }

    public int getData() {
        return data;
    }

    public int getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }
    
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}
