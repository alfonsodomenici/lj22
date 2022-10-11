/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.corsojava.clienti.jpa;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ospite
 */
public class FinestraPrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FinestraPrincipale
     */
    public FinestraPrincipale() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(200, 200, 500, 400);
        tbAnagrafica.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbAnagrafica.getSelectionModel().addListSelectionListener(e -> abilitaBottoni(tbAnagrafica.getSelectedRow() != -1));
        loadData();
        abilitaBottoni(false);
    }

    private void abilitaBottoni(boolean enable) {
        btnModifica.setEnabled(enable);
        btnElimina.setEnabled(enable);
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
        tbAnagrafica = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnModifica = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuEsci = new javax.swing.JMenuItem();
        mnuClienti = new javax.swing.JMenu();
        mnuNuovoCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbAnagrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbAnagrafica);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModifica);

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });
        jPanel1.add(btnElimina);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        mnuFile.setText("File");

        mnuEsci.setText("Esci");
        mnuEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEsciActionPerformed(evt);
            }
        });
        mnuFile.add(mnuEsci);

        jMenuBar1.add(mnuFile);

        mnuClienti.setText("Clienti");

        mnuNuovoCliente.setText("Nuovo Cliente");
        mnuNuovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNuovoClienteActionPerformed(evt);
            }
        });
        mnuClienti.add(mnuNuovoCliente);

        jMenuBar1.add(mnuClienti);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuEsciActionPerformed

    private void mnuNuovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNuovoClienteActionPerformed
        AnagraficaDialog f = new AnagraficaDialog(this, true);
        f.setVisible(true);
        loadData();
    }//GEN-LAST:event_mnuNuovoClienteActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        int rowIndex = tbAnagrafica.getSelectedRow();
        Long id = (Long) tbAnagrafica.getModel().getValueAt(rowIndex, 0);
        AnagraficaStore.delete(id);
        loadData();
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        int rowIndex = tbAnagrafica.getSelectedRow();
        Long id = (Long) tbAnagrafica.getModel().getValueAt(rowIndex, 0);
        Anagrafica found = AnagraficaStore.find(id);
        AnagraficaDialog f = new AnagraficaDialog(this, true,found);
        f.setVisible(true);
        loadData();
    }//GEN-LAST:event_btnModificaActionPerformed

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
            java.util.logging.Logger.getLogger(FinestraPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraPrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnModifica;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuClienti;
    private javax.swing.JMenuItem mnuEsci;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuNuovoCliente;
    private javax.swing.JTable tbAnagrafica;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        tbAnagrafica.setModel(new TbAnagraficaModel());
    }
}
