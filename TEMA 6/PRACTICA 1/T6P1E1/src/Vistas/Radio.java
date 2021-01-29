
package Vistas;

public class Radio extends javax.swing.JPanel {
    public Radio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfRadio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbLongitud = new javax.swing.JCheckBox();
        cbArea = new javax.swing.JCheckBox();
        cbVolumen = new javax.swing.JCheckBox();
        bListo = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 204));

        tfRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRadioActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduce el radio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Calculadora");

        cbLongitud.setBackground(new java.awt.Color(153, 255, 153));
        cbLongitud.setText("Longitud de una circunferencia");
        cbLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLongitudActionPerformed(evt);
            }
        });

        cbArea.setBackground(new java.awt.Color(153, 255, 153));
        cbArea.setText("Area de una circunferencia");

        cbVolumen.setBackground(new java.awt.Color(153, 255, 153));
        cbVolumen.setText("Volumen de una esfera");
        cbVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVolumenActionPerformed(evt);
            }
        });

        bListo.setBackground(new java.awt.Color(102, 255, 255));
        bListo.setText("¡Listo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bListo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbArea)
                            .addComponent(cbLongitud)
                            .addComponent(cbVolumen))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbLongitud)
                .addGap(18, 18, 18)
                .addComponent(cbArea)
                .addGap(18, 18, 18)
                .addComponent(cbVolumen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(bListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRadioActionPerformed
         
    }//GEN-LAST:event_tfRadioActionPerformed

    private void cbLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLongitudActionPerformed

    private void cbVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVolumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVolumenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bListo;
    private javax.swing.JCheckBox cbArea;
    private javax.swing.JCheckBox cbLongitud;
    private javax.swing.JCheckBox cbVolumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfRadio;
    // End of variables declaration//GEN-END:variables


}

