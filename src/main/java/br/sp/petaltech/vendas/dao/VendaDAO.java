package br.sp.petaltech.vendas.dao;

import br.sp.petaltech.clientes.Clientes;
import br.sp.petaltech.produtos.Produtos;
import br.sp.petaltech.vendas.model.ItemVenda;
import br.sp.petaltech.vendas.model.Venda;
import br.sp.petaltech.vendas.view.SelecionarClienteView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class VendaDAO {

    public static ArrayList<ItemVenda> adicionarCarrinho() {
        ArrayList<ItemVenda> venda = new ArrayList<ItemVenda>();

        return venda;
    }

    public static void escolherCliente() {

    }

    public  void passarClienteTabela(JTable tbl, Clientes cliente) {
        
        
        

    }

    public Clientes passarCliente(Clientes cliente, Clientes clienteAlterado) {
        clienteAlterado.setIdcliente(cliente.getIdcliente());
        clienteAlterado.setNome(cliente.getNome());
        clienteAlterado.setCpf(cliente.getCpf());

        return clienteAlterado;
    }

    public ArrayList<Produtos> passarProdutoTabelaLista(JTable tbl) {
        int linhaSelecionada = tbl.getSelectedRow();
        ArrayList<Produtos> listaRetorno = new ArrayList<Produtos>();
        Produtos produto = new Produtos();
        //Passo os dados da tabela para o objeto
        DefaultTableModel modelo = (DefaultTableModel) tbl.getModel();
        int id = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
        String nome = modelo.getValueAt(linhaSelecionada, 1).toString();
        double valor = Double.parseDouble(modelo.getValueAt(linhaSelecionada, 2).toString());
        String descricao = modelo.getValueAt(linhaSelecionada, 3).toString();
        double estoque = Double.parseDouble(modelo.getValueAt(linhaSelecionada, 4).toString());

        //Passo o objeto para a lista de retorno
        
        produto.setCod(id);
        produto.setNome(nome);
        produto.setPv(valor);
        produto.setDesc(descricao);
        produto.setQtdEstoque(estoque);
        listaRetorno.add(produto);
        
        return listaRetorno;
    }

    public static Produtos passarProdutoTabela(Produtos produto, Produtos produtoNovo) {
        produtoNovo.setCod(produto.getCod());
        produtoNovo.setNome(produtoNovo.getNome());
        produtoNovo.setPv(produtoNovo.getPv());
        produtoNovo.setDesc(produtoNovo.getDesc());
        produtoNovo.setQtdEstoque(produtoNovo.getQtdEstoque());

        return produto;
    }

    public static ArrayList<Clientes> filtrarPorNomeCliente(String nome) {
        ArrayList<Clientes> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {
            //1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2
            String url = "jdbc:mysql://localhost:3310/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //3/*
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM Clientes WHERE nome LIKE ?");

            comandoSQL.setString(1, "%" + nome + "%");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Clientes clienteRetorno = new Clientes();
                    clienteRetorno.setIdcliente(rs.getInt("idCliente"));
                    clienteRetorno.setNome(rs.getString("nome"));
                    clienteRetorno.setCpf(rs.getString("cpf"));
                    clienteRetorno.setEmail(rs.getString("email"));

                    listaRetorno.add(clienteRetorno);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaRetorno;
    } //Fim do método filtrar

    public static ArrayList<Produtos> filtrarPorNomeProduto(String nome) {
        ArrayList<Produtos> listaRetorno = new ArrayList<>();
        Connection conexao = null;

        try {
            //1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2
            String url = "jdbc:mysql://localhost:3310/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //3/*
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ?");

            comandoSQL.setString(1, "%" + nome + "%");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Produtos produtoRetorno = new Produtos();
                    produtoRetorno.setCod(rs.getInt("IDproduto"));
                    produtoRetorno.setNome(rs.getString("nome"));
                    produtoRetorno.setPc(rs.getDouble("precoVenda"));
                    produtoRetorno.setDesc(rs.getString("descricao"));
                    produtoRetorno.setQtdEstoque(rs.getDouble("qtdEstoque"));

                    listaRetorno.add(produtoRetorno);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaRetorno;
    } //Fim do método filtrar

    public ArrayList<Venda> finalizarVenda(int idCliente, Date data) {
        boolean retorno = false;
        Connection conexao = null;
        ArrayList<Venda> vendaRetorno = new ArrayList<>();

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            String url = "jdbc:mysql://localhost:3310/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO venda (idCliente, iditemvenda) VALUES(?,?)");

            comandoSQL.setInt(1, idCliente);

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

        return vendaRetorno;
    }//Fim do método finalizaVenda

    public boolean retirarEstoque(Double estoque, int IDproduto) {
        boolean retorno = false;
        Connection conexao = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão
            String url = "jdbc:mysql://localhost:3310/petaltech";
            conexao = DriverManager.getConnection(url, "root", "");

            //Passo 3 - Preparar o comando SQL
            PreparedStatement comandoSQL
                    = conexao.prepareStatement("UPDATE Produtos SET qtdEstoque =? WHERE IDproduto=? ");

            comandoSQL.setDouble(1, estoque);
            comandoSQL.setInt(2, IDproduto);

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
    }//Fim do método retirar do estoque

    public JLabel atualizarTotal(JTable tbl, JLabel lbl, int coluna) {
        DefaultTableModel modelo = (DefaultTableModel) tbl.getModel();

        double total = Double.parseDouble(lbl.getText());

        for (int i = 0; i < tbl.getRowCount(); i++) {
            total = total + (double) modelo.getValueAt(i, coluna);
        }

        lbl.setText(Double.toString(total));

        return lbl;
    }//fim do método atualizarTotal
}
