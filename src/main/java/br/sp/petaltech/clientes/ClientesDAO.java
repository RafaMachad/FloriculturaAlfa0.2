/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.petaltech.clientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class ClientesDAO {
    
    public static boolean salvar(Clientes obj){
        boolean retorno = false;
        Connection conexao = null;
        
        
        try {
            //implementar o insert no banco
            
            //1°carregar driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //3 - abrir conexao
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url,"root","P@$$w0rd");
            
            //3 - preparar o comando sql
            PreparedStatement comandoSQL =
            conexao.prepareStatement("INSERT INTO Clientes (nome, cpf, telefone, email, sexo, data, cep, uf, bairro, rua, numero, complemento) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            //passar os parametros
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getTelefone());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, obj.getSexo());
            comandoSQL.setDate(6, new java.sql.Date(obj.getData().getTime()));
            comandoSQL.setString(7, obj.getCep());
            comandoSQL.setString(8, obj.getUf());
            comandoSQL.setString(9, obj.getBairro());
            comandoSQL.setString(10, obj.getRua());
            comandoSQL.setInt(11, obj.getNumero());
            comandoSQL.setString(12, obj.getComplemento());
            
            //executar comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
            }
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }//final metodo salvar
    
    public static ArrayList<Clientes> listar(){
        ArrayList<Clientes> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //1carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir conexao
           String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url,"root","");
            
            //passo 3 comando sql
            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM Clientes");
            
            //passo 4 executar comando sql
            ResultSet rs =  comandoSQL.executeQuery();
            
            if(rs!=null){
                //percorro o resultset e passo os valores a um obj
                //passo os valores a um obj
                while(rs.next()){
                    Clientes obj = new Clientes();
                    obj.setIdcliente(rs.getInt("idCliente"));
                    obj.setNome(rs.getString("nome"));
                    obj.setCpf(rs.getString("cpf"));
                    obj.setTelefone(rs.getString("telefone"));
                    obj.setEmail(rs.getString("email"));
                    obj.setSexo(rs.getString("sexo"));
                    obj.setData(rs.getDate("data"));
                    obj.setCep(rs.getString("cep"));
                    obj.setUf(rs.getString("uf"));
                    obj.setBairro(rs.getString("bairro"));
                    obj.setRua(rs.getString("rua"));
                    obj.setNumero(rs.getInt("numero"));
                    obj.setComplemento(rs.getString("complemento"));
                    
                    
                }
            }
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("erro ao carregar conexao");
        }
        
        return listaRetorno;
    } //final do metodo de exibir
    
    public static boolean alterar(Clientes obj){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir conexao
           String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url,"root","");
            
            //passo 3 comando sql
            PreparedStatement comandoSQL =
            conexao.prepareStatement("UPDATE Clientes SET nome =?,  telefone=?, email=?, sexo=?, data=?, cep=?, uf=?, bairro=?, rua=?, numero=?, complemento=? WHERE cpf=? ");
            
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getTelefone());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, obj.getSexo());
            comandoSQL.setDate(6, new java.sql.Date(obj.getData().getTime()));
            comandoSQL.setString(7, obj.getCep());
            comandoSQL.setString(8, obj.getUf());
            comandoSQL.setString(9, obj.getBairro());
            comandoSQL.setString(10, obj.getRua());
            comandoSQL.setInt(11, obj.getNumero());
            comandoSQL.setString(12, obj.getComplemento());
            
            //passo 4 executar comando sql
            int linhasAfetadas =  comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("erro ao carregar o driver");
        } catch (SQLException ex) {
            System.out.println("erro ao carregar conexao");
        }
        
        return retorno;
    } //final do metodo de alterar
    
    
    public static boolean excluir(int cpf){
        boolean retorno = false;
        Connection conexao = null;
        
        
        try {
            //implementar o insert no banco
            
            //1°carregar driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //3 - abrir conexao
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url,"root","");
            
            //3 - preparar o comando sql
            PreparedStatement comandoSQL =
            conexao.prepareStatement("DELETE FROM Clientes WHERE idCliente =? ");
            
            //passar os parametros
            
            comandoSQL.setInt(1, cpf);
            
            
            //executar comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
            }
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }//final metodo excluir
    
    
    
}//final da classe
