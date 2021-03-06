/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.Fraccionario;
import javax.swing.JOptionPane;

/**
 *
 * @author amoreno15
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        txtNumeradorUno.requestFocusInWindow();
        this.setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDenominadorTres = new javax.swing.JTextField();
        txtNumeradorTres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtNumeradorUno = new javax.swing.JTextField();
        txtDenominadorUno = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtNumeradorDos = new javax.swing.JTextField();
        txtDenominadorDos = new javax.swing.JTextField();
        cmbOperaciones = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmdLimpiar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 0, -1, 489));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel2.setText("Operaciones con Fraccionario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 520, 90));

        txtDenominadorTres.setEditable(false);
        getContentPane().add(txtDenominadorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 50, 80));

        txtNumeradorTres.setEditable(false);
        getContentPane().add(txtNumeradorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 50, 80));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, -1));
        getContentPane().add(txtNumeradorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 80));
        getContentPane().add(txtDenominadorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 80));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 70, -1));
        getContentPane().add(txtNumeradorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 50, 80));
        getContentPane().add(txtDenominadorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 50, 80));

        cmbOperaciones.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-", "*", "/", " " }));
        cmbOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 60, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        cmdLimpiar.setBackground(new java.awt.Color(0, 0, 153));
        cmdLimpiar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 130, 60));

        cmdCalcular.setBackground(new java.awt.Color(0, 0, 153));
        cmdCalcular.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(255, 255, 255));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/background-63756_960_720.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperacionesActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:

        int op, n1, d1, n2, d2;
        Fraccionario f1, f2, f3=null;

        op = cmbOperaciones.getSelectedIndex();
        n1 = Integer.parseInt(txtNumeradorUno.getText());
        d1 = Integer.parseInt(txtDenominadorUno.getText());
        n2 = Integer.parseInt(txtNumeradorDos.getText());
        d2 = Integer.parseInt(txtDenominadorDos.getText());
        
        try{
        f1 = new Fraccionario(n1, d1);
        f2 = new Fraccionario(n2, d2);

        
        switch (op) {
            case 0:
                f3 = f1.sumar(f2);
                break;
               
        
            case 1:
                f3 = f1.restar(f2);
                break;
                
            case 2:
                f3 = f1.multiplicar(f2);
                break;
                
            case 3:
                f3= f1.division(f2);
                break;
                
        }
                txtNumeradorTres.setText(""+f3.getNumerador());
                txtDenominadorTres.setText(""+f3.getDenominador());
        }catch(DenominadorCeroException k){
            JOptionPane.showMessageDialog(null, k.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        
        txtNumeradorUno.setText("");
        txtNumeradorDos.setText("");
        txtDenominadorUno.setText("");
        txtDenominadorDos.setText("");
        txtNumeradorTres.setText("");
        txtDenominadorTres.setText("");
        txtNumeradorUno.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtDenominadorDos;
    private javax.swing.JTextField txtDenominadorTres;
    private javax.swing.JTextField txtDenominadorUno;
    private javax.swing.JTextField txtNumeradorDos;
    private javax.swing.JTextField txtNumeradorTres;
    private javax.swing.JTextField txtNumeradorUno;
    // End of variables declaration//GEN-END:variables
}
