package GUI;

import Excepciones.AcontecimientoNoEncontrado;
import Excepciones.CampoVacio;
import Excepciones.NombreNoValido;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        this.setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bAlta = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAlta = new javax.swing.JMenuItem();
        mBaja = new javax.swing.JMenuItem();
        mModificacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mNuevaInscripcion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mListadoAsistentes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mSalirListado = new javax.swing.JMenuItem();
        mSalirSinListado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/alta.png"))); // NOI18N
        bAlta.setToolTipText("Alta de un acontecimeinto");
        bAlta.setFocusable(false);
        bAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAlta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        jToolBar1.add(bAlta);

        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/editar.png"))); // NOI18N
        bEditar.setFocusable(false);
        bEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEditar);

        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/papelera.jpg"))); // NOI18N
        bBorrar.setFocusable(false);
        bBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBorrar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("XXXXXXXXXXX");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Dedicada a la organización de acontecimientos en Vitoria desde 1900");

        jMenu1.setText("Acontecimientos");

        mAlta.setText("Alta");
        mAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mAlta);

        mBaja.setText("Baja");
        mBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBajaActionPerformed(evt);
            }
        });
        jMenu1.add(mBaja);

        mModificacion.setText("Modificación");
        mModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModificacionActionPerformed(evt);
            }
        });
        jMenu1.add(mModificacion);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Inscripciones");

        mNuevaInscripcion.setText("Nueva");
        mNuevaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevaInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(mNuevaInscripcion);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Listado");

        mListadoAsistentes.setText("Personas asistentes a un evento");
        mListadoAsistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoAsistentesActionPerformed(evt);
            }
        });
        jMenu4.add(mListadoAsistentes);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Salir");

        mSalirListado.setText("SalirListado");
        mSalirListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirListadoActionPerformed(evt);
            }
        });
        jMenu2.add(mSalirListado);

        mSalirSinListado.setText("SalirSinListado");
        mSalirSinListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirSinListadoActionPerformed(evt);
            }
        });
        jMenu2.add(mSalirSinListado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaActionPerformed
             t8p1e2_v2.T8p1e2_v2.visualizarVentanaAlta();
    }//GEN-LAST:event_mAltaActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
             mAlta.doClick();
    }//GEN-LAST:event_bAltaActionPerformed

    private void mSalirListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirListadoActionPerformed
       try{
            javax.swing.JOptionPane.showMessageDialog(this,t8p1e2_v2.T8p1e2_v2.listado());
            t8p1e2_v2.T8p1e2_v2.terminar();
       }
       catch(Exception e)
       {
           javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el listado al terminar");
       }
    }//GEN-LAST:event_mSalirListadoActionPerformed

    private void mSalirSinListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirSinListadoActionPerformed
        t8p1e2_v2.T8p1e2_v2.terminar();
    }//GEN-LAST:event_mSalirSinListadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
    }//GEN-LAST:event_formWindowOpened

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        mModificacion.doClick();
    }//GEN-LAST:event_bEditarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        mBaja.doClick();
    }//GEN-LAST:event_bBorrarActionPerformed

    public void validarNombre(String nombre) throws Exception
    {
         if (nombre.isEmpty())
                throw new CampoVacio("Es obligatorio indicar el nombre del evento");
         if (nombre.length()< 3)
                throw new NombreNoValido();
    }
    
    private void mBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBajaActionPerformed
        try
        {
            String nombre = javax.swing.JOptionPane.showInputDialog(this,"Teclea el nombre del acontecimiento que quieres eliminar");
            validarNombre(nombre);
            t8p1e2_v2.T8p1e2_v2.borrarAcontecimiento(nombre);
            JOptionPane.showMessageDialog(this,"Acontecimiento borrado");
            
        }
        catch(AcontecimientoNoEncontrado e)
        {
            JOptionPane.showMessageDialog(this,"No hay ningún acontecimiento con el nombre indicado");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas eliminando " + e.getMessage());
        }
    }//GEN-LAST:event_mBajaActionPerformed

    private void mModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModificacionActionPerformed
        try
        {
            String nombre = javax.swing.JOptionPane.showInputDialog(this,"Teclea el nombre del acontecimiento que quieres modificar");
            validarNombre(nombre);
            t8p1e2_v2.T8p1e2_v2.modificarAcontecimientoParteUno(nombre);
        }
        catch(AcontecimientoNoEncontrado e)
        {
            JOptionPane.showMessageDialog(this,"No hay ningún acontecimiento con el nombre indicado");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas modificando " + e.getMessage());
        }
    }//GEN-LAST:event_mModificacionActionPerformed

    private void mNuevaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevaInscripcionActionPerformed
        try
        {
            if (!t8p1e2_v2.T8p1e2_v2.visualizarVentanaInscripcion())
                JOptionPane.showMessageDialog(this,"No hay acontecimientos disponibles");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas con la nueva inscripción " + e.getClass());
        }
    }//GEN-LAST:event_mNuevaInscripcionActionPerformed

    private void mListadoAsistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoAsistentesActionPerformed
        try
        {
            String nombre = JOptionPane.showInputDialog("Indica el nombre del evento");
            // validar
            JOptionPane.showMessageDialog(this,t8p1e2_v2.T8p1e2_v2.getAsistentes(nombre));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_mListadoAsistentesActionPerformed

    public boolean mostrar(String datos)
    {
        JOptionPane.showMessageDialog(this,datos);
        int respuesta = JOptionPane.showConfirmDialog(this,"¿ Estas seguro? Los datos se eliminarán de forma permanente");
        if (respuesta == 0)
            return true;
        else
            return false;
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mAlta;
    private javax.swing.JMenuItem mBaja;
    private javax.swing.JMenuItem mListadoAsistentes;
    private javax.swing.JMenuItem mModificacion;
    private javax.swing.JMenuItem mNuevaInscripcion;
    private javax.swing.JMenuItem mSalirListado;
    private javax.swing.JMenuItem mSalirSinListado;
    // End of variables declaration//GEN-END:variables
}
