package br.sp.petaltech.vendas.dao;

import br.sp.petaltech.vendas.model.ItemVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            PreparedStatement comandoSQL = 
                conexao.prepareStatement("INSERT INTO itemvenda (numeroNota,valorNota) VALUES(?,?)");
            
            comandoSQL.setInt(1, pObj.getNumeroNota());
            comandoSQL.setDouble(2, pObj.getValorNota());
                    
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
}
