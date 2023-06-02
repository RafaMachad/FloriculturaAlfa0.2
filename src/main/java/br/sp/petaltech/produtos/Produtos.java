package br.sp.petaltech.produtos;

public class Produtos {
//Classe para armazenar os metodos construtores para a geração de novos produtos para o programa.
    
    private String nome;
    private double Pc;
    private double QtdEstoque;
    private String desc;
    private double Pv;
    private int Cod;
   
    //Construtor onde nao é necessário usar o COD do produto, como para adicionar um produto novo ao banco de dados
    public Produtos(String nome, double Pc, double QtdEstoque, double Pv,  String desc) {
        this.nome = nome;
        this.Pc = Pc;
        this.QtdEstoque = QtdEstoque;
        this.desc = desc;
        this.Pv = Pv;
       
    }
    public Produtos(){}
//Construtor usado para onde é necessário importar o COD como na tela de vendas e para exibição na tabela de produtos
    public Produtos(int Cod, String nome, double Pc,  String desc, double QtdEstoque) {
        this.Cod = Cod;
        this.nome = nome;
        this.Pc = Pc;
        this.desc = desc;
        this.QtdEstoque = QtdEstoque;
    }
    
    
    
    // Métodos getters e setters

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }
    

    
    public double getPv() {
        return Pv;
    }

    public void setPv(double Pv) {
        this.Pv = Pv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPc() {
        return Pc;
    }

    public void setPc(double Pc) {
        this.Pc = Pc;
    }

    public double getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(double QtdEstoque) {
        this.QtdEstoque = QtdEstoque;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }

    public Object[] obterDados() {
        return new Object[]{nome, Pc, Pv, QtdEstoque, desc};

    }
}
