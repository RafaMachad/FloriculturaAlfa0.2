/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.petaltech.relatorios;

import br.sp.petaltech.clientes.Clientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.manzano
 */
public class RelatoriosDAO {
    
    
        private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/petaltech";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
    
    
    public List<Object[]> consultarRelatorioSintetico(String cliente, String dataInicial, String dataFinal) {
        List<Object[]> relatorioSintetico = new ArrayList<>();

        try (Connection connection = getConnection()) {
            String query = "SELECT v.idVenda, c.nome AS nomeCliente, p.nome AS nomeProduto, iv.qtdProduto, iv.valorUnitario, iv.qtdProduto * iv.valorUnitario AS valorTotal " +
                           "FROM venda AS v " +
                           "INNER JOIN clientes c ON v.idCliente = c.idCliente " +
                           "INNER JOIN itemvenda iv ON v.idVenda = iv.idVenda " + 
                           "INNER JOIN produtos p ON iv.idProduto = p.IDproduto " +
                           "WHERE c.nome LIKE ? AND v.data BETWEEN ? AND ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cliente + "%");
            statement.setString(2, dataInicial);
            statement.setString(3, dataFinal);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] row = new Object[6];
                row[0] = resultSet.getObject("idVenda");
                row[1] = resultSet.getObject("nomeCliente");
                row[2] = resultSet.getObject("nomeProduto");
                row[3] = resultSet.getObject("qtdProduto");
                row[4] = resultSet.getObject("valorUnitario");
                row[5] = resultSet.getObject("valorTotal");
                relatorioSintetico.add(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERRO SQL");
            e.printStackTrace();
        }

        return relatorioSintetico;
    }

    public List<Object[]> consultarRelatorioAnalitico(String cliente, String dataInicial, String dataFinal) {
        List<Object[]> relatorioAnalitico = new ArrayList<>();

        try (Connection connection = getConnection()) {
            String query = "SELECT p.nome AS nome_produto, " +
                           "(SELECT SUM(iv.qtdProduto) FROM itemvenda iv WHERE iv.idProduto = p.IDproduto) AS total_vendas_produto, " +
                           "c.nome AS nome_cliente, " +
                           "(SELECT COUNT(*) FROM venda v WHERE v.idCliente = c.idCliente) AS total_vendas_cliente, " +
                           "v.data AS data_venda " +
                           "FROM produtos p " +
                           "LEFT JOIN itemvenda iv ON p.IDproduto = iv.idProduto " +
                           "LEFT JOIN venda v ON iv.idVenda = v.idVenda " +
                           "LEFT JOIN clientes c ON v.idCliente = c.idCliente " +
                           "WHERE p.nome LIKE ? AND v.data BETWEEN ? AND ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cliente+"%");
            statement.setString(2, dataInicial);
            statement.setString(3, dataFinal);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Object[] row = new Object[5];
                row[0] = resultSet.getObject("nome_produto");
                row[1] = resultSet.getObject("total_vendas_produto");
                row[2] = resultSet.getObject("nome_cliente");
                row[3] = resultSet.getObject("total_vendas_cliente");
                row[4] = resultSet.getObject("data_venda");

                relatorioAnalitico.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return relatorioAnalitico;
    }


    

}
