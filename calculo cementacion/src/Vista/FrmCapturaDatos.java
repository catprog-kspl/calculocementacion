/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.math.*;

/**
 *
 * @author kievp
 */
public class FrmCapturaDatos extends javax.swing.JFrame{

    /**
     * Creates new form InterfazDatos
     */
    public FrmCapturaDatos() {
        initComponents();
    
    
    }

        

        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        txtDiametroB = new javax.swing.JTextField();
        txtDiametroInterno = new javax.swing.JTextField();
        txtAlturaTapon = new javax.swing.JTextField();
        txtAlturaFondo = new javax.swing.JTextField();
        txtAsentamiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDiametroE = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtDiametroB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtDiametroB);
        txtDiametroB.setBounds(670, 110, 133, 32);

        txtDiametroInterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiametroInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiametroInternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiametroInterno);
        txtDiametroInterno.setBounds(670, 210, 133, 32);

        txtAlturaTapon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlturaTapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaTaponActionPerformed(evt);
            }
        });
        getContentPane().add(txtAlturaTapon);
        txtAlturaTapon.setBounds(670, 260, 133, 32);

        txtAlturaFondo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlturaFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaFondoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAlturaFondo);
        txtAlturaFondo.setBounds(670, 310, 133, 32);

        txtAsentamiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAsentamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsentamientoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAsentamiento);
        txtAsentamiento.setBounds(670, 360, 133, 32);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Diámetro de la barrena(plg).");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 100, 500, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diámetro interno(plg).");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 210, 450, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Altura tapón(m).");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 260, 400, 40);

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Altura fondo(m).");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 310, 400, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Asentamiento(m).");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 360, 340, 35);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cálculo de volumen de cementación en T.R.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 10, 930, 80);

        btnCalcular.setBackground(new java.awt.Color(153, 153, 255));
        btnCalcular.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(150, 410, 180, 60);

        btnRegresar.setBackground(new java.awt.Color(153, 153, 255));
        btnRegresar.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(390, 410, 180, 60);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Diámetro externo(plg).");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 150, 450, 30);

        txtDiametroE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtDiametroE);
        txtDiametroE.setBounds(670, 160, 133, 32);

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(630, 410, 160, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoabs.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 80, 710, 350);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoabs.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 990, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlturaTaponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaTaponActionPerformed
    
    }//GEN-LAST:event_txtAlturaTaponActionPerformed

    private void txtDiametroInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiametroInternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiametroInternoActionPerformed

    private void txtAsentamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsentamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsentamientoActionPerformed

    private void txtAlturaFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaFondoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaFondoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

 


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
             
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCapturaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCapturaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCapturaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCapturaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCapturaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField txtAlturaFondo;
    public javax.swing.JTextField txtAlturaTapon;
    public javax.swing.JTextField txtAsentamiento;
    public javax.swing.JTextField txtDiametroB;
    public javax.swing.JTextField txtDiametroE;
    public javax.swing.JTextField txtDiametroInterno;
    // End of variables declaration//GEN-END:variables
}
