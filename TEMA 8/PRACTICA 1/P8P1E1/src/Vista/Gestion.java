/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Excepciones.Problemas;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Gestion extends javax.swing.JFrame {

    int controlador;
    int posicion = 0;
    int maxList;
    
    public Gestion() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Gestion(int control) throws Exception{
        initComponents();
        setLocationRelativeTo(null);
        
        this.controlador = control;
        
        switch (controlador){
            case 1: bBack.setVisible(false);
                    bNext.setVisible(false);
                    bSalir.setVisible(false);
                    break;
            case 2: bBack.setVisible(false);
                    bNext.setVisible(false);
                    bSalir.setVisible(false);
                    tfNombre.setEditable(false);
                    tfEdad.setEditable(false);
                    tfProfesion.setEditable(false);
                    tfTelefono.setEditable(false);
                    rellenarDatos(controlador);
                    break;
            case 3: bBack.setVisible(true);
                    bBack.setEnabled(false);
                    bNext.setVisible(true);
                    bSalir.setVisible(true);
                    tfNombre.setEditable(false);
                    tfEdad.setEditable(false);
                    tfProfesion.setEditable(false);
                    tfTelefono.setEditable(false);
                    bAceptar.setVisible(false);
                    rellenarDatos(controlador);
                    break;
            default: setVisible(false); 
                     throw new Problemas("Fallo en con el controlador del menú.");
        }
            
    }
    
    private void rellenarDatos(int controlador){
        try
        {
            if(controlador == 2){
                datoIndividual();
            }
            else{
                datoMultiple(0);
                maxList = t8p1e1.T8P1E1.maxPersonas();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + " " + e.getClass() + " " + e.getMessage());
        }
    }
    
    private void datoIndividual() throws Exception{
        tfNombre.setText(t8p1e1.T8P1E1.nombreIndividual());
        tfEdad.setText(String.valueOf(t8p1e1.T8P1E1.edadIndividual()));
        tfProfesion.setText(t8p1e1.T8P1E1.profesionIndividual());
        tfTelefono.setText(t8p1e1.T8P1E1.telefonoIndividual());
    }
    
    private void datoMultiple(int x) throws Exception{
        tfNombre.setText(t8p1e1.T8P1E1.nombreMultiple(posicion));
        tfEdad.setText(String.valueOf(t8p1e1.T8P1E1.edadMultiple(posicion)));
        tfProfesion.setText(t8p1e1.T8P1E1.profesionMultiple(posicion));
        tfTelefono.setText(t8p1e1.T8P1E1.telefonoMultiple(posicion));
    }
    
    private boolean validarDatos() throws Exception{
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JFormattedTextField();
        tfNombre = new javax.swing.JTextField();
        tfProfesion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JFormattedTextField();
        bBack = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Personas");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Profesión");

        jLabel5.setText("Teléfono");

        try {
            tfEdad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bBack.setText("<");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        bNext.setText(">");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(bBack)
                            .addGap(18, 18, 18)
                            .addComponent(bNext)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSalir))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfProfesion))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfTelefono))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(bAceptar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBack)
                    .addComponent(bNext)
                    .addComponent(bSalir))
                .addGap(42, 42, 42)
                .addComponent(bAceptar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        try
        {
            posicion -= 1;
        
            if(posicion <= 0)
            {
                bBack.setEnabled(false);
            }
            else
            {
                datoMultiple(posicion);
            }  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + " " + e.getClass() + " " + e.getMessage());
        }
    }//GEN-LAST:event_bBackActionPerformed

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        try
        {
            posicion += 1;
            
            if(posicion >= maxList)
            {
                bNext.setEnabled(false);
            }
            else
            {
                datoMultiple(posicion);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + " " + e.getClass() + " " + e.getMessage());
        }
    }//GEN-LAST:event_bNextActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try
        {
            if(controlador == 1)
            {
                if(validarDatos())
                {
                    t8p1e1.T8P1E1.altaNueva(tfNombre.getText(), Integer.parseInt(tfEdad.getText()), tfProfesion.getText(), tfTelefono.getText());
                    JOptionPane.showMessageDialog(this, "Alta realizada.");
                    this.dispose();
                }
                else
                {
                    tfNombre.setFocusable(true);
                }
            }
            else
            {
                dispose();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + " " + e.getClass() + " " + e.getMessage());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfProfesion;
    private javax.swing.JFormattedTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}