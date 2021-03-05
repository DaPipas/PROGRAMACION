
package Vista;

import ejemplobd.Controlador;
import javax.swing.JOptionPane;

public class VentanaPersona extends javax.swing.JFrame {

    public VentanaPersona() {
        initComponents();
        
        pVehiculos.setVisible(false);
        taVehiculos.setVisible(false);
        bAltaVehiculo.setEnabled(false);
        bBajaVehiculo.setEnabled(false);
        bConsultaVehiculos.setEnabled(false);
        bModificarVehiculo.setEnabled(false);
       
        
        tfNombre.setEnabled(false);
        bAltaPersona.setEnabled(false);
        bBajaPersona.setEnabled(false);
        bModificarPersona.setEnabled(false);
        bVehiculos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        bAltaPersona = new javax.swing.JButton();
        bBajaPersona = new javax.swing.JButton();
        bModificarPersona = new javax.swing.JButton();
        bVehiculos = new javax.swing.JButton();
        pVehiculos = new javax.swing.JPanel();
        bConsultaVehiculos = new javax.swing.JButton();
        bAltaVehiculo = new javax.swing.JButton();
        bBajaVehiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taVehiculos = new javax.swing.JTextArea();
        bModificarVehiculo = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PERSONAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos básicos de las personas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre:");

        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });

        bAltaPersona.setText("Alta");
        bAltaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaPersonaActionPerformed(evt);
            }
        });

        bBajaPersona.setText("Baja");
        bBajaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaPersonaActionPerformed(evt);
            }
        });

        bModificarPersona.setText("Modificación");
        bModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarPersonaActionPerformed(evt);
            }
        });

        bVehiculos.setText("Operar sobre sus vehiculos");
        bVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDni, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(tfNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(bAltaPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bBajaPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bModificarPersona)
                        .addGap(18, 18, 18)
                        .addComponent(bVehiculos)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAltaPersona)
                    .addComponent(bBajaPersona)
                    .addComponent(bModificarPersona)
                    .addComponent(bVehiculos))
                .addGap(28, 28, 28))
        );

        pVehiculos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos sobre los vehiculos propiedad de la persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        bConsultaVehiculos.setText("Consulta");
        bConsultaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaVehiculosActionPerformed(evt);
            }
        });

        bAltaVehiculo.setText("Alta");
        bAltaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaVehiculoActionPerformed(evt);
            }
        });

        bBajaVehiculo.setText("Baja");
        bBajaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaVehiculoActionPerformed(evt);
            }
        });

        taVehiculos.setEditable(false);
        taVehiculos.setColumns(20);
        taVehiculos.setRows(5);
        taVehiculos.setBorder(null);
        taVehiculos.setEnabled(false);
        jScrollPane1.setViewportView(taVehiculos);

        bModificarVehiculo.setText("Modificación");
        bModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pVehiculosLayout = new javax.swing.GroupLayout(pVehiculos);
        pVehiculos.setLayout(pVehiculosLayout);
        pVehiculosLayout.setHorizontalGroup(
            pVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVehiculosLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVehiculosLayout.createSequentialGroup()
                        .addComponent(bConsultaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bAltaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBajaVehiculo)
                        .addGap(28, 28, 28)
                        .addComponent(bModificarVehiculo)
                        .addGap(98, 98, 98))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pVehiculosLayout.setVerticalGroup(
            pVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVehiculosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConsultaVehiculos)
                    .addComponent(bAltaVehiculo)
                    .addComponent(bBajaVehiculo)
                    .addComponent(bModificarVehiculo))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bSalir)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(bSalir)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
      // Si el dni tiene buena pinta, vamos a buscar a la base de datos
      try
      {
          String nombre;
            if (validarDni())
            {
                 nombre = Controlador.tenDni(tfDni.getText());
                 if (nombre == null)
                 {
                     // No hay ninguna persona con ese dni, tiene que ser un alta
                     tfDni.setEditable(false);
                     tfNombre.setEnabled(true);
                     tfNombre.requestFocus();
                     bAltaPersona.setEnabled(true);
                 }
                 else
                 {
                     // Hay una persona con ese dni. Será una baja, una modificación o sobre los vehiculos
                     tfDni.setEditable(false);
                     tfNombre.setEnabled(true);
                     tfNombre.setText(nombre);
                     bBajaPersona.setEnabled(true);
                     bModificarPersona.setEnabled(true);
                     bVehiculos.setEnabled(true);
                 }
            }
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
          
    }//GEN-LAST:event_tfDniActionPerformed

    private void bAltaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaPersonaActionPerformed
      try
      {
                if (validarNombre())
               {
                   Controlador.insertarPersona(tfDni.getText(),tfNombre.getText());
                   JOptionPane.showMessageDialog(this,"Persona dada de alta");
                   // Faltan los vehiculo
                   pVehiculos.setVisible(true);
                   bAltaVehiculo.setEnabled(true);
               }
      }
       catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
      
    }//GEN-LAST:event_bAltaPersonaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Controlador.salir(this);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bBajaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaPersonaActionPerformed
       try
       {
             Controlador.bajaPersona();
             JOptionPane.showMessageDialog(this,"Persona dada de baja");
             bSalir.doClick();
       }
       catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
    }//GEN-LAST:event_bBajaPersonaActionPerformed

    private void bModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarPersonaActionPerformed
        try
       {
             Controlador.modificarPersona(tfNombre.getText());
             JOptionPane.showMessageDialog(this,"Persona modificada");
              pVehiculos.setVisible(true);
              bConsultaVehiculos.setEnabled(true);
              bAltaVehiculo.setEnabled(true);
               bBajaVehiculo.setEnabled(true);
               bModificarVehiculo.setEnabled(true);
       }
       catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
    }//GEN-LAST:event_bModificarPersonaActionPerformed

    private void bConsultaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaVehiculosActionPerformed
       try
       {
           taVehiculos.setText(Controlador.datosVehiculosPorPersona());
           taVehiculos.setVisible(true);
       }
        catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
    }//GEN-LAST:event_bConsultaVehiculosActionPerformed

    private void bAltaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaVehiculoActionPerformed
       try
       {
          Controlador.mostrarAMVehiculoPersona("Alta");
       }
       catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
    }//GEN-LAST:event_bAltaVehiculoActionPerformed

    private void bVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVehiculosActionPerformed
      pVehiculos.setVisible(true);
      bConsultaVehiculos.setEnabled(true);
      bAltaVehiculo.setEnabled(true);
      bBajaVehiculo.setEnabled(true);
      bModificarVehiculo.setEnabled(true);
      
    }//GEN-LAST:event_bVehiculosActionPerformed

    private void bBajaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaVehiculoActionPerformed
      try
      {
                String matricula = JOptionPane.showInputDialog(this,"Indica la matricula del vehiculo que quieres dar de baja");
               if (validarMatricula())
               {
                   Controlador.bajaVehiculoPersona(matricula);
                   JOptionPane.showMessageDialog(this,"Vehiculo eliminado");
               }
      }
      catch(Exception e)
      {
              JOptionPane.showMessageDialog(this,e.getMessage());
      }
    }//GEN-LAST:event_bBajaVehiculoActionPerformed

    private void bModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarVehiculoActionPerformed
        try
       {
          Controlador.mostrarAMVehiculoPersona("Modificar");
       }
       catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,e.getMessage());
      }
    }//GEN-LAST:event_bModificarVehiculoActionPerformed

    private boolean validarDni()
    {
        // Expresión regular, try catch, etc...
        return true;
    }
    
      private boolean validarNombre()
    {
        // Expresión regular, try catch, etc...
        return true;
    }
      
     private boolean validarMatricula()
    {
        // Expresión regular, try catch, etc...
        return true;
    }

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
            java.util.logging.Logger.getLogger(VentanaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAltaPersona;
    private javax.swing.JButton bAltaVehiculo;
    private javax.swing.JButton bBajaPersona;
    private javax.swing.JButton bBajaVehiculo;
    private javax.swing.JButton bConsultaVehiculos;
    private javax.swing.JButton bModificarPersona;
    private javax.swing.JButton bModificarVehiculo;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pVehiculos;
    private javax.swing.JTextArea taVehiculos;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
