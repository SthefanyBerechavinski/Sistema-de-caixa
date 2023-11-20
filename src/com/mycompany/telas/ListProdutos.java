/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.telas;

import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.DaoProdutos;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author sthefany.1921
 */
public class ListProdutos extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     */
    public ListProdutos() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel= (DefaultTableModel) tableProdutos.getModel();
            
            tableProdutos.setModel(defaultTableModel);
            
            DaoProdutos daoProdutos = new DaoProdutos();
            
            ResultSet resultSet= daoProdutos.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String codigo= resultSet.getString(2);
                String nome= resultSet.getString(3);
                String preco= resultSet.getString(4);
                String acrescimo= resultSet.getString(5);
                String novopreco= resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, codigo, nome, preco, acrescimo, novopreco});
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorID(int pID){
        try{
            DefaultTableModel defaultTableModel= (DefaultTableModel) tableProdutos.getModel();
            
            tableProdutos.setModel(defaultTableModel);
            
            DaoProdutos daoProdutos = new DaoProdutos();
            
            ResultSet resultSet= daoProdutos.listarPorID(pID);
            
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String codigo= resultSet.getString(2);
                String nome= resultSet.getString(3);
                String preco= resultSet.getString(4);
                String acrescimo= resultSet.getString(5);
                String novopreco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, codigo, nome, preco, acrescimo, novopreco});
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorCodigo(int pCodigo){
        try{
            DefaultTableModel defaultTableModel= (DefaultTableModel) tableProdutos.getModel();
            
            tableProdutos.setModel(defaultTableModel);
            
            DaoProdutos daoProdutos = new DaoProdutos();
            
            ResultSet resultSet= daoProdutos.listarPorCodigo(pCodigo);
            
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String codigo= resultSet.getString(2);
                String nome= resultSet.getString(3);
                String preco= resultSet.getString(4);
                String acrescimo= resultSet.getString(5);
                String novopreco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, codigo, nome, preco, acrescimo, novopreco});
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorNome(String pNome){
        try{
            DefaultTableModel defaultTableModel= (DefaultTableModel) tableProdutos.getModel();
            
            tableProdutos.setModel(defaultTableModel);
            
            DaoProdutos daoProdutos = new DaoProdutos();
            
            ResultSet resultSet= daoProdutos.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String codigo= resultSet.getString(2);
                String nome= resultSet.getString(3);
                String preco= resultSet.getString(4);
                String acrescimo= resultSet.getString(5);
                String novopreco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, codigo, nome, preco, acrescimo, novopreco});
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorPreco(Double pPreco){
        try{
            DefaultTableModel defaultTableModel= (DefaultTableModel) tableProdutos.getModel();
            
            tableProdutos.setModel(defaultTableModel);
            
            DaoProdutos daoProdutos = new DaoProdutos();
            
            ResultSet resultSet= daoProdutos.listarPorPreco(pPreco);
            
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String codigo= resultSet.getString(2);
                String nome= resultSet.getString(3);
                String preco= resultSet.getString(4);
                String acrescimo= resultSet.getString(5);
                String novopreco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, codigo, nome, preco, acrescimo, novopreco});
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorAcrescimo(Double pAcrescimo){
        try{
            DefaultTableModel defaultTableModel= (DefaultTableModel) tableProdutos.getModel();
            
            tableProdutos.setModel(defaultTableModel);
            
            DaoProdutos daoProdutos = new DaoProdutos();
            
            ResultSet resultSet= daoProdutos.listarPorAcrescimo(pAcrescimo);
            
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                String id = resultSet.getString(1);
                String codigo= resultSet.getString(2);
                String nome= resultSet.getString(3);
                String preco= resultSet.getString(4);
                String acrescimo= resultSet.getString(5);
                String novopreco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, codigo, nome, preco, acrescimo, novopreco});
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        tfBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jcbfiltro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produtos Cadastrados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nome", "Preço", "Acréscimo", "Novo Preço"
            }
        ));
        jScrollPane1.setViewportView(tableProdutos);

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jcbfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "ID", "Código", "Nome", "Preço", "Acréscimo", "Novo Preço", " " }));
        jcbfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnBusca)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca)
                    .addComponent(jcbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfiltroActionPerformed
        
    }//GEN-LAST:event_jcbfiltroActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        switch (jcbfiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorID(Integer.parseInt(tfBusca.getText()));
                break;
            case 2:
                listarPorCodigo(Integer.parseInt(tfBusca.getText()));
                break;
            case 3:
                listarPorNome(tfBusca.getText());
                break;
            case 4:
                listarPorPreco(Double.parseDouble(tfBusca.getText()));
                break;
            case 5:
                listarPorAcrescimo(Double.parseDouble(tfBusca.getText()));
                break;
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.listProdutos = null;
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ListProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbfiltro;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField tfBusca;
    // End of variables declaration//GEN-END:variables
}
