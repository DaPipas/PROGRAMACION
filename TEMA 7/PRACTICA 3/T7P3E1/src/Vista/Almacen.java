/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Excepciones.DatoNoValido;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Almacen extends javax.swing.JFrame {
    
    boolean  comprar;
    /**
     * Creates new form Almacen
     */
    public Almacen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombreProducto = new javax.swing.JTextField();
        tfUnidades = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbComprar = new javax.swing.JRadioButton();
        rbVender = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfPrecioCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tfImporteCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfPrecioVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbDtopv = new javax.swing.JCheckBox();
        cbDtoppp = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        tfImporteVenta = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ALMACEN");

        jLabel2.setText("Nombre del producto");

        jLabel3.setText("Unidades");

        tfNombreProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreProductoFocusLost(evt);
            }
        });

        tfUnidades.setEditable(false);
        tfUnidades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUnidadesFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        bgOpciones.add(rbComprar);
        rbComprar.setText("Comprar");
        rbComprar.setEnabled(false);
        rbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbComprarActionPerformed(evt);
            }
        });

        bgOpciones.add(rbVender);
        rbVender.setText("Vender");
        rbVender.setEnabled(false);
        rbVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(rbComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbVender)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbComprar)
                    .addComponent(rbVender))
                .addGap(35, 35, 35))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos sobre la compra"));

        jLabel4.setText("Precio");

        tfPrecioCompra.setEditable(false);
        tfPrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioCompraFocusLost(evt);
            }
        });

        jLabel5.setText("Proveedores");

        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });

        jLabel6.setText("Importe de la compra");

        tfImporteCompra.setEditable(false);

        jLabel10.setText("€");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos sobre venta"));

        jLabel7.setText("Precio");

        tfPrecioVenta.setEditable(false);
        tfPrecioVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioVentaFocusLost(evt);
            }
        });

        jLabel8.setText("Cliente");

        tfCliente.setEditable(false);
        tfCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfClienteFocusLost(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos"));

        cbDtopv.setText("Por Volumen");
        cbDtopv.setEnabled(false);
        cbDtopv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDtopvActionPerformed(evt);
            }
        });

        cbDtoppp.setText("Por pronto pago");
        cbDtoppp.setEnabled(false);
        cbDtoppp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDtopppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(cbDtopv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(cbDtoppp)
                .addGap(111, 111, 111))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDtopv)
                    .addComponent(cbDtoppp))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel9.setText("Importe de la venta: ");

        tfImporteVenta.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfCliente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22)
                                .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tfImporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfImporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNombreProducto)
                                    .addComponent(tfUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(bAceptar)
                        .addGap(147, 147, 147)
                        .addComponent(bCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComprarActionPerformed
        rbVender.setEnabled(false);
        tfPrecioCompra.setEditable(true);
        tfPrecioCompra.setFocusable(true);
        comprar = true;
    }//GEN-LAST:event_rbComprarActionPerformed

    private void rbVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVenderActionPerformed
        rbVender.setEnabled(false);
        tfCliente.setEnabled(true);
        tfCliente.setFocusable(true);
        tfPrecioVenta.setText(String.valueOf(t7p3e1.T7P3E1.precioVenta()));
        tfImporteVenta.setText(String.valueOf(t7p3e1.T7P3E1.precioVenta() * Integer.parseInt(tfUnidades.getText())));
        
    }//GEN-LAST:event_rbVenderActionPerformed

    private void tfNombreProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreProductoFocusLost
        boolean error = false;
        try
        {
            if(tfNombreProducto.getText().isEmpty())
            {
                throw new DatoNoValido("Nombre vacio.");
            }
            if(!t7p3e1.T7P3E1.comprobarNombreProducto(tfNombreProducto.getText()));
            {
                throw new DatoNoValido("No se ha encontrado el producto.");
            }
        }
        catch(DatoNoValido e)
        {
            error(DatoNoValido.getTxt());
            error = true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR: " +  e.getClass() + " " + e.getMessage());
            error = true;
        }
        if(!error)
        {
            tfNombreProducto.setEditable(false);
            tfUnidades.setEditable(true);
        }
        
    }//GEN-LAST:event_tfNombreProductoFocusLost

    private void tfUnidadesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUnidadesFocusLost
        boolean error = false;
        try
        {
            if(tfUnidades.getText().isEmpty())
            {
                throw new DatoNoValido("Unidades vacias.");
            }
            int validar = Integer.parseInt(tfUnidades.getText());
        }
        catch(DatoNoValido e)
        {
            error(DatoNoValido.getTxt());
            error = true;
        }
        catch(NumberFormatException e)
        {
            error("Solo puedes introducir numeros");
            error = true;
        }
        if(!error)
        {
            tfUnidades.setEditable(false);
            rbComprar.setEnabled(true);
            rbVender.setEnabled(true);
        }
    }//GEN-LAST:event_tfUnidadesFocusLost

    private void tfPrecioCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioCompraFocusLost
        boolean error = false;
        try
        {
            if(tfPrecioCompra.getText().isEmpty())
                throw new DatoNoValido("Precio vacio.");
            double validar = Double.parseDouble(tfPrecioCompra.getText());
        }
        catch(DatoNoValido e)
        {
            error(DatoNoValido.getTxt());
            error = true;
        }
        catch(NumberFormatException e)
        {
            error("Solo puedes introducir numeros");
            error = true;
        }
        if(!error)
        {
            t7p3e1.T7P3E1.llenarCbProveedores(cbProveedores);
            tfPrecioCompra.setEditable(false);
            cbProveedores.setEnabled(true);
        }
    }//GEN-LAST:event_tfPrecioCompraFocusLost

    private void tfPrecioVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioVentaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioVentaFocusLost

    private void tfClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteFocusLost
        try
        {
            tfCliente.getText().isEmpty();
                throw new DatoNoValido("Nombre del cliente vacio.");
            Pattern pat = Pattern.compile("^[A-Z|a-z]+");
            Matcher m = pat.matcher(tfCliente.getText());
        }
        catch(DatoNoValido e)
        {
            error(DatoNoValido.getTxt());
        }
        cbDtopv.setEnabled(true);
        cbDtoppp.setEnabled(true);
    }//GEN-LAST:event_tfClienteFocusLost

    private void cbDtopvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDtopvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDtopvActionPerformed

    private void cbDtopppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDtopppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDtopppActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if(comprar)
        {
            t7p3e1.T7P3E1.actualizarCompraProducto(Double.parseDouble(tfPrecioCompra.getText()), Integer.parseInt(tfUnidades.getText()));
            JOptionPane.showMessageDialog(this, "Operación realizada con exito.");
            dispose();
        }
        else
        {
            t7p3e1.T7P3E1.actualizarVentaProducto(Double.parseDouble(tfPrecioVenta.getText()), int unidades);
            JOptionPane.showMessageDialog(this, "Operación realizada con exito.");
            dispose();
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCancelarActionPerformed

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        cbProveedores.setEnabled(false);
        double total = (Double.parseDouble(tfPrecioCompra.getText()) * Integer.parseInt(tfUnidades.getText()));
        tfImporteCompra.setText(String.valueOf(total));
        bAceptar.setEnabled(true);
        bAceptar.setFocusable(true);
    }//GEN-LAST:event_cbProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }
    public void error(String txt){
        JOptionPane.showMessageDialog(this, txt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.ButtonGroup bgOpciones;
    private javax.swing.JCheckBox cbDtoppp;
    private javax.swing.JCheckBox cbDtopv;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbComprar;
    private javax.swing.JRadioButton rbVender;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfImporteCompra;
    private javax.swing.JTextField tfImporteVenta;
    private javax.swing.JTextField tfNombreProducto;
    private javax.swing.JTextField tfPrecioCompra;
    private javax.swing.JTextField tfPrecioVenta;
    private javax.swing.JTextField tfUnidades;
    // End of variables declaration//GEN-END:variables
}