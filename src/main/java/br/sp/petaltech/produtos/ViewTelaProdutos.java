/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.sp.petaltech.produtos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewTelaProdutos extends javax.swing.JFrame {

    /**
     * Creates new form TelaProdutos
     */
    public ViewTelaProdutos() {
        //Exigencias da tela de produtos...
        //CRUD

        initComponents();
        
        //depois de adicionar copio o metodo atualizar no final e coloco um disclose
        recarregarTabela();
    }

    public void recarregarTabela() {

        //Chamar a DAO para consulta
        ArrayList<Produtos> lista = produtosDAO.listar();

        DefaultTableModel modelo = (DefaultTableModel) tblProd.getModel();

        //Zerar a tabela
        modelo.setRowCount(0);

        //Para cada nota na lista, adiciono uma linha à tabela
        for (Produtos item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getCod()),
                String.valueOf(item.getNome()), // Primeira coluna - Nome
                String.valueOf(item.getQtdEstoque()), // Segunda coluna - Descrição
                String.valueOf(item.getPv()), // Terceira coluna - Preço Venda
                String.valueOf(item.getPc()), // Quarta coluna - Preço Compra
                String.valueOf(item.getDesc())// Quinta coluna - Quantidade em estoque
            });

        }

    }

    public JTable gettblProd() {
        return tblProd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        btnAdd = new javax.swing.JToggleButton();
        btnRemove = new javax.swing.JButton();
        btnAlt = new javax.swing.JButton();
        teste = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCadastro.setText("<html>\nCadastro de \n<br>\nProdutos\n</html>");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        tblProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome", "Preço Venda", "Preço Compra", "Qtd em estoque", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProd);
        if (tblProd.getColumnModel().getColumnCount() > 0) {
            tblProd.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAlt.setText("Alterar");
        btnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltActionPerformed(evt);
            }
        });

        teste.setText("jButton1");
        teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCod)
                        .addGap(26, 26, 26)
                        .addComponent(teste, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove)
                            .addComponent(btnAlt)
                            .addComponent(teste)
                            .addComponent(lblCod)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ViewTelaAddProd addprod = new ViewTelaAddProd(tblProd);

        addprod.pack();
        addprod.setLocationRelativeTo(null);
        addprod.setVisible(true);


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tblProd.getModel();

        if (tblProd.getSelectedRow() != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Deseja remover a linha selecionada?");
            if (option == JOptionPane.YES_OPTION) {
                modelo.removeRow(tblProd.getSelectedRow());
            }
        } else {
            if (tblProd.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Não há produtos para remover!");
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto para a remoção!");
            }
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltActionPerformed

        //
        int linhaSelecionada = tblProd.getSelectedRow();

        DefaultTableModel modelo = (DefaultTableModel) tblProd.getModel();
        
        int cod = Integer.parseInt((String) modelo.getValueAt(linhaSelecionada, 0));
        String nome = String.valueOf(modelo.getValueAt(linhaSelecionada, 1).toString());
        double pc = Double.parseDouble(modelo.getValueAt(linhaSelecionada, 2).toString());
        double estoque = Double.parseDouble(modelo.getValueAt(linhaSelecionada,3).toString());
        double pv = Double.parseDouble(modelo.getValueAt(linhaSelecionada, 4).toString());
        String desc = String.valueOf(modelo.getValueAt(linhaSelecionada, 5).toString());

        //Chamar a tela de Cadastro passando um obj nota fiscal
        Produtos obj = new Produtos(cod,nome, pc,estoque, pv,  desc);
        
        ViewAlterarProd novaTela = new ViewAlterarProd(obj);
        novaTela.setVisible(true);

    


    }//GEN-LAST:event_btnAltActionPerformed

    private void testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeActionPerformed
        //atualizar
        //Chamar a DAO para consulta
        ArrayList<Produtos> lista = produtosDAO.listar();
        
        DefaultTableModel modelo = (DefaultTableModel) tblProd.getModel();
        
        //Zerar a tabela
        modelo.setRowCount(0);
        
        //Para cada nota na lista, adiciono uma linha à tabela
        for (Produtos item : lista) {
            modelo.addRow(new String[]{  
                String.valueOf(item.getNome()), // Primeira coluna - Nome
                String.valueOf(item.getDesc()), // Segunda coluna - Descrição
                String.valueOf(item.getPv()), // Terceira coluna - Preço Venda
                String.valueOf(item.getPc()), // Quarta coluna - Preço Compra
                String.valueOf(item.getQtdEstoque())// Quinta coluna - Quantidade em estoque
                 
            });
            
        }
    }//GEN-LAST:event_testeActionPerformed

public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTelaProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTelaProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTelaProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTelaProdutos.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ViewTelaProdutos().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JButton btnAlt;
    private javax.swing.JButton btnRemove;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCod;
    private javax.swing.JTable tblProd;
    private javax.swing.JButton teste;
    // End of variables declaration//GEN-END:variables
}
