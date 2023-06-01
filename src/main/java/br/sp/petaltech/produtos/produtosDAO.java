package br.sp.petaltech.produtos;

import br.sp.petaltech.clientes.ClientesDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class produtosDAO {

    public static boolean salvar(Produtos pObj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("INSERT INTO produtos (nome, precoCompra, qtdEstoque, precoVenda, descricao) "
                            + " VALUES(?,?,?,?,?)");
            
            comandoSQL.setString(1, pObj.getNome());
            comandoSQL.setDouble(2, pObj.getPc());
            comandoSQL.setDouble(3, pObj.getQtdEstoque());
            comandoSQL.setDouble(4, pObj.getPv());
            comandoSQL.setString(5, pObj.getDesc());

            //Passo 4 - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return retorno;
    }//Fim do método salvar

    public static ArrayList<Produtos> listar() {
        ArrayList<Produtos> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("SELECT * FROM produtos");

            //Passo 4 - Executar o comando
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    //Passo os dados do resultset para o objeto
                    Produtos obj = new Produtos();
                    obj.setCod(rs.getInt("IDproduto"));
                    obj.setNome(rs.getString("nome"));
                    obj.setPc(rs.getDouble("precoCompra"));
                    obj.setQtdEstoque(rs.getInt("qtdEstoque"));
                    obj.setPv(rs.getDouble("precoVenda"));
                    obj.setDesc(rs.getString("descricao"));
                    //Passo o objeto para a lista de retorno
                    listaRetorno.add(obj);

                }

            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return listaRetorno;

    }//Fim do listar

    public static boolean alterar(Produtos pObj) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            String url = "jdbc:mysql://localhost:3306/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("UPDATE produtos SET nome =?, precoCompra=?, qtdEstoque=?, precoVenda=?, descricao=? WHERE IDproduto=? ");

            comandoSQL.setString(1, pObj.getNome());
            comandoSQL.setDouble(2, pObj.getPc());
            comandoSQL.setDouble(3, pObj.getQtdEstoque());
            comandoSQL.setDouble(4, pObj.getPv());
            comandoSQL.setString(5, pObj.getDesc());
            comandoSQL.setInt(6, pObj.getCod());

            //Passo 4 - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }

        return retorno;
    }
public static boolean excluir(int cod){
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
            conexao.prepareStatement("DELETE FROM produtos WHERE IDproduto =? ");
            
            //passar os parametros
            
            comandoSQL.setInt(1, cod);
            
            
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
    
}// Fim da Classe

