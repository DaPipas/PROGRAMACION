
package GUI;

import static zoologicos.Zoologicos.*;

public class vInicio extends javax.swing.JFrame {

    public vInicio() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        fondo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAltaPais = new javax.swing.JMenuItem();
        mBajaPais = new javax.swing.JMenuItem();
        mModificarPais = new javax.swing.JMenuItem();
        mConsultaPais = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mAltaZoo = new javax.swing.JMenuItem();
        mBajaZoo = new javax.swing.JMenuItem();
        mModificarZoo = new javax.swing.JMenuItem();
        mConsultaZoo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mAltaAnimal = new javax.swing.JMenuItem();
        mBajaAnimal = new javax.swing.JMenuItem();
        mModificarAnimal = new javax.swing.JMenuItem();
        mConsultaAnimal = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();

        jMenuItem9.setText("jMenuItem9");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/fondo.jpg"))); // NOI18N

        jMenu1.setText("Paises");

        mAltaPais.setText("Alta");
        jMenu1.add(mAltaPais);

        mBajaPais.setText("Baja");
        jMenu1.add(mBajaPais);

        mModificarPais.setText("Modificar");
        jMenu1.add(mModificarPais);

        mConsultaPais.setText("Consulta");
        jMenu1.add(mConsultaPais);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Zoo");

        mAltaZoo.setText("Alta");
        jMenu2.add(mAltaZoo);

        mBajaZoo.setText("Baja");
        jMenu2.add(mBajaZoo);

        mModificarZoo.setText("Modificar");
        jMenu2.add(mModificarZoo);

        mConsultaZoo.setText("Consultas");
        jMenu2.add(mConsultaZoo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Animales");

        mAltaAnimal.setText("Alta");
        mAltaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAltaAnimalActionPerformed(evt);
            }
        });
        jMenu3.add(mAltaAnimal);

        mBajaAnimal.setText("Baja");
        jMenu3.add(mBajaAnimal);

        mModificarAnimal.setText("Modificar");
        jMenu3.add(mModificarAnimal);

        mConsultaAnimal.setText("Consultas");
        jMenu3.add(mConsultaAnimal);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenu4.add(mSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAltaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAltaAnimalActionPerformed
        try
        {
            abrirAltaAnimal();
            dispose();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getClass() + " : " + e.getMessage());
        }
    }//GEN-LAST:event_mAltaAnimalActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        finalizar();
    }//GEN-LAST:event_mSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mAltaAnimal;
    private javax.swing.JMenuItem mAltaPais;
    private javax.swing.JMenuItem mAltaZoo;
    private javax.swing.JMenuItem mBajaAnimal;
    private javax.swing.JMenuItem mBajaPais;
    private javax.swing.JMenuItem mBajaZoo;
    private javax.swing.JMenuItem mConsultaAnimal;
    private javax.swing.JMenuItem mConsultaPais;
    private javax.swing.JMenuItem mConsultaZoo;
    private javax.swing.JMenuItem mModificarAnimal;
    private javax.swing.JMenuItem mModificarPais;
    private javax.swing.JMenuItem mModificarZoo;
    private javax.swing.JMenuItem mSalir;
    // End of variables declaration//GEN-END:variables
}
