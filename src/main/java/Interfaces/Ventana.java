/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author jaider
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setExtendedState(6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdministrativo = new javax.swing.JButton();
        btnNuevaCompra = new javax.swing.JButton();
        btnEstadoCompra = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alfa Omega");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdministrativo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdministrativo.setText("Administrativo");
        btnAdministrativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrativoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 216, 80));

        btnNuevaCompra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNuevaCompra.setText("Nueva compra");
        btnNuevaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 216, 80));

        btnEstadoCompra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEstadoCompra.setText("Estado de compra");
        btnEstadoCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 216, 80));

        jButton4.setText("Salir");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 66, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadoCompraActionPerformed

    private void btnNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompraActionPerformed
        // TODO add your handling code here:
        Compra compra= new Compra();
        compra.setVisible(true);
        this.dispose();
        
        // Nombre_interfaz nombre_objeto = new Nombre_interfaz();
        //nombre_objeto.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnNuevaCompraActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrativoActionPerformed
        // TODO add your handling code here:
        LoginAdministrativo login= new LoginAdministrativo();
        login.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_btnAdministrativoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrativo;
    private javax.swing.JButton btnEstadoCompra;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
