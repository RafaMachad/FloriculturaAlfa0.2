package br.sp.petaltech.vendas.dao;

import br.sp.petaltech.clientes.Clientes;
import br.sp.petaltech.vendas.model.ItemVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VendaDAO {
    
    public static boolean salvar(ItemVenda pObj){
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - Abrir a conexão
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");
            
            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO itemvenda (numeroNota,valorNota) VALUES(?,?)");
            
            //comandoSQL.setInt(1, pObj.getNumeroNota());
            //comandoSQL.setDouble(2, pObj.getValorNota());
                    
            //Passo 4 - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }
        
        return retorno;
    }//Fim do método salvar

    /*public static ArrayList<Clientes> filtrarPorNome(){
        ArrayList<Clientes> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");
            
            String nome =
                    
            //3/*
           /*PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE dscProduto LIKE ?");
            comandoSQL.setString(1, "%" + nome + "%");
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if (rs != null) {
                while (rs .next()) {
                    Clientes clienteRetorno = new Clientes();
                    clienteRetorno.setNome(rs.getString("nome"));
                    clienteRetorno.setCpf(rs.getString("Cpf"));
                    
                    
                    listaRetorno.add(clienteRetorno);
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return listaRetorno;
    }*///Fim do método filtrar

}
