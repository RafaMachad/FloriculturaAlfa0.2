package br.sp.petaltech.produtos;

public class Produtos {

    private String nome;
    private double Pc;
    private int QtdEstoque;
    private String desc;
    private double Pv;
   

    public Produtos(String nome, double Pc, double Pv, int QtdEstoque, String desc) {
        this.nome = nome;
        this.Pc = Pc;
        this.QtdEstoque = QtdEstoque;
        this.desc = desc;
        this.Pv = Pv;
    }
    public Produtos(){}

    // Métodos getters e setters
    

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

    public int getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(int QtdEstoque) {
        this.QtdEstoque = QtdEstoque;
    }

    public void setDesc(String desc) {
        this.nome = desc;
    }
    public String getDesc(){
    return desc;
    }

    public Object[] obterDados() {
        return new Object[]{nome, Pc, Pv, QtdEstoque, desc};

    }
}
