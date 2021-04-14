package GUI;

import Excepciones.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import t9p1e2.Controlador;

public class VentanaInscripcion extends javax.swing.JFrame {
  
    // persona que ya existe en la base de datos o hay que insertarla?
    private boolean encontrada;
    private boolean dniValidado = false;
    
    public VentanaInscripcion(){
        initComponents();
        llenarCombo();
        setLocationRelativeTo(null);
    }
    
    public void llenarCombo() {
       /* Llenar la combobox con el nombre de los próximos acontecimientos
       con plazas libres */
        int numero = Controlador.getNumeroAcontecimientosDisponibles();
        // Se puede pasar la combo como parámetro.
        for(int x = 0; x < numero; x++)
            cbNombreAcontecimiento.insertItemAt(Controlador.getNombreAcontecimiento(x),x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbNombreAcontecimiento = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dpFecha = new com.github.lgooddatepicker.components.DatePicker();
        tpHora = new com.github.lgooddatepicker.components.TimePicker();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNombreEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfRazonSocial = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfNif = new javax.swing.JTextField();
        tfCnae = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Evento"));

        jLabel1.setText("Nombre");

        cbNombreAcontecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNombreAcontecimientoActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha");

        jLabel3.setText("Hora");

        dpFecha.setEnabled(false);

        tpHora.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNombreAcontecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbNombreAcontecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tpHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Persona"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));

        jLabel10.setText("Nif:");

        jLabel11.setText("Nombre:");

        tfNombreEmpresa.setEnabled(false);

        jLabel12.setText("Razón social:");

        tfRazonSocial.setEnabled(false);

        jLabel13.setText("CNAE:");

        tfNif.setEnabled(false);

        tfCnae.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfNif)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCnae, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfCnae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Dni:");

        tfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDniFocusLost(evt);
            }
        });
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        tfNombre.setEnabled(false);

        jLabel7.setText("Apellidos");

        tfApellidos.setEnabled(false);

        jLabel9.setText("Telefono:");

        bAceptar.setText("Aceptar");
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

        tfTelefono.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAceptar)
                            .addComponent(bCancelar))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(bCancelar)))
                .addContainerGap())
        );

        jLabel4.setText("Inscripción en un evento");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbNombreAcontecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombreAcontecimientoActionPerformed
        // Muestro datos
        dpFecha.setDate(Controlador.getFechaAcontecimiento(cbNombreAcontecimiento.getSelectedIndex()));
        tpHora.setTime(Controlador.getHoraAcontecimiento());
        tfDni.requestFocus();
    }//GEN-LAST:event_cbNombreAcontecimientoActionPerformed

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
       consultaDni();
       // Con el nif podemos hacer algo parecido
    }//GEN-LAST:event_tfDniActionPerformed

    private void tfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDniFocusLost
        //consultaDni();
    }//GEN-LAST:event_tfDniFocusLost

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
      try
      {
        if (cbNombreAcontecimiento.getSelectedIndex() != -1)
        {
            if (dniValidado)
            {
                if (!encontrada)
                {
                    // Persona nueva. Tras las validaciones hay que insertar en la bd
                   if (datosPersonaCorrectos() && datosEmpresaCorrectos())
                   {
                       Controlador.altaPersonaEmpresa(tfDni.getText(),tfNombre.getText(),tfApellidos.getText(),tfTelefono.getText(),tfNif.getText(),tfNombreEmpresa.getText(),tfRazonSocial.getText(),tfCnae.getText());
                       Controlador.altaAsistente();
                       JOptionPane.showMessageDialog(this,"Enhorabuena, ya estás inscritx");
                       Controlador.volver(this);
                   }
               }
                else
                 {
                     // La persona ya existe. Solo hay que inscribirla.
                      Controlador.altaAsistente();
                      JOptionPane.showMessageDialog(this,"Enhorabuena, ya estás inscritx en un nuevo evento");
                      Controlador.volver(this);
                 }
            }
            else
                // problemas dni
                throw new Exception();
        }
        else
            // combo vacía
            throw new Exception();
        
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(this,"Problemas con la inscripción. \n");
      }
     
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Controlador.volver(this);
    }//GEN-LAST:event_bCancelarActionPerformed

 
    private boolean datosEmpresaCorrectos(){
        try
        {
            validarCIF();
            validarNombreEmpresa();
            validarRazonSocial();
            validarCNAE();
            return true;
        }
       catch(CampoVacio e)
       {
           JOptionPane.showMessageDialog(this,e.getMensaje());
           return false;
       }
       catch(NombreNoValido e)
       {
           JOptionPane.showMessageDialog(this," El nombre indicado no es válido.");
           return false;
       }
        catch(CifNoValido e)
       {
           JOptionPane.showMessageDialog(this," El cif indicado no es válido.");
           return false;
       }
        catch(RazonSocialNoValida e)
       {
           JOptionPane.showMessageDialog(this," La razón social indicada no existe");
           return false;
       }
         catch(CNAENoValido e)
       {
           JOptionPane.showMessageDialog(this," El CNAE indicado no es válido");
           return false;
       }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public void validarCIF() throws Exception{
        // https://www.clasesdeinformaticaweb.com/programas-en-java/cif-calcular-el-cif-en-java/
        Pattern pat = Pattern.compile("^[A-z][0-9]{8}[A-Z0-9]$");
        Matcher mat = pat.matcher(tfNif.getText()); 
    
        if (!mat.matches())
            throw new CifNoValido();
        // se puede complicar mucho más
    }
    
     public void validarNombreEmpresa() throws Exception
    {
        if (tfNombreEmpresa.getText().isEmpty())
            throw new CampoVacio("El nombre de la empresa es un dato obligatorio");
        // Considero que debe tener un mínimo de 3 caracteres. 50 es el máximo establecido en la base de datos.
        if (tfNombreEmpresa.getText().length()< 3 || tfNombreEmpresa.getText().length() > 50 )
            throw new NombreNoValido();
        
        Pattern pat = Pattern.compile("^[A-Z][a-z ]*$");
        Matcher mat = pat.matcher(tfNombreEmpresa.getText()); 
    
        if (!mat.matches())
            throw new NombreNoValido();
    }
     
      public void validarRazonSocial() throws Exception{
          String[] tiposRS = {"Sociedad anónima", "Sociedad limitada","Sociedad cooperativa"};
          if (!Arrays.asList(tiposRS).contains(tfRazonSocial.getText()))
              throw new RazonSocialNoValida();
          
        
    }
      
    public void validarCNAE() throws Exception
    {
        // cuatro números.
        Pattern pat = Pattern.compile("^[0-9]{4}$");
        Matcher mat = pat.matcher(tfCnae.getText()); 
    
        if (!mat.matches())
            throw new CNAENoValido();
    }
    private boolean datosPersonaCorrectos(){
       try
       {
           // dni ya esta validado y consultado
           validarNombrePersona();
           validarApellidos();
           validarTelefono();
           return true;
       }
       catch(CampoVacio e)
       {
           JOptionPane.showMessageDialog(this,e.getMensaje());
           return false;
       }
       catch(NombreNoValido e)
       {
           JOptionPane.showMessageDialog(this," El nombre o los apellidos indicados no son válidos");
           return false;
       }
        catch(TelefonoNoValido e)
       {
           JOptionPane.showMessageDialog(this," El teléfono indicado no es válido.");
           return false;
       }
       catch(Exception e)
       {
           return false;
       }
    }
    
    private void validarNombrePersona() throws Exception
    {
        if (tfNombre.getText().isEmpty())
            throw new CampoVacio("El nombre de la persona es un dato obligatorio");
        // Considero que debe tener un mínimo de 3 caracteres. 50 es el máximo establecido en la base de datos.
        if (tfNombre.getText().length()< 3 || tfNombre.getText().length() > 50 )
            throw new NombreNoValido();
        Pattern pat = Pattern.compile("^[A-Z][a-z ]*$");
        Matcher mat = pat.matcher(tfNombre.getText()); 
    
        if (!mat.matches())
            throw new NombreNoValido();
       
    }
    
    private void validarApellidos() throws Exception
    {
        if (tfApellidos.getText().isEmpty())
            throw new CampoVacio("Los apellidos de la persona son un dato obligatorio");
        // Considero que debe tener un mínimo de 3 caracteres. 50 es el máximo establecido en la base de datos.
        if (tfApellidos.getText().length()< 3 || tfApellidos.getText().length() > 50 )
            throw new NombreNoValido();
        Pattern pat = Pattern.compile("^[A-Z][a-z ]*$");
        Matcher mat = pat.matcher(tfApellidos.getText()); 
    
        if (!mat.matches())
            throw new NombreNoValido();
    }
       
    private void validarTelefono() throws Exception
    {
        Pattern pat = Pattern.compile("^[6789][0-9]{8}$");
        Matcher mat = pat.matcher(tfTelefono.getText()); 
    
        if (!mat.matches())
            throw new TelefonoNoValido();
    }
    private void consultaDni(){
        try
        {
           validarDni();
           dniValidado = true;
           // Dni correcto. Vamos a buscarlo en la base de datos
           encontrada = Controlador.buscarPersona(tfDni.getText());
           if (encontrada){
               // No es la primera vez que esta persona se inscribe en un evento
               mostrarDatos();
           }
           else
           {
               // Persona nueva
               habilitar();
           }
       }
       catch(CampoVacio e){
           JOptionPane.showMessageDialog(this, e.getMensaje());
       }
       catch(DniNoValido e){
           JOptionPane.showMessageDialog(this, "El dni tecleado no es válido");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }
    
    private void validarDni() throws Exception{
        if (tfDni.getText().isEmpty())
            throw new CampoVacio("El dni es un dato obligatorio");
        
        Pattern pat = Pattern.compile("^[0-9]{8}[A-Z]$");
        Matcher mat = pat.matcher(tfDni.getText()); 
    
        if (!mat.matches())
            throw new DniNoValido();
        
        Character[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = Integer.parseInt(tfDni.getText().substring(0, 8)) % 23;
        if (tfDni.getText().charAt(8)!=asignacionLetra[resto])
            throw new DniNoValido();
    }
    
    private void habilitar() throws Exception{
        tfNombre.setEnabled(true);
        tfApellidos.setEnabled(true);
        tfTelefono.setEnabled(true);
        tfNif.setEnabled(true);
        tfNombreEmpresa.setEnabled(true);
        tfRazonSocial.setEnabled(true);
        tfCnae.setEnabled(true);
        tfNombre.requestFocus();
    }
    private void mostrarDatos() throws Exception{
        // Datos de la persona
        tfNombre.setText(Controlador.getNombre());
        tfApellidos.setText(Controlador.getApellidos());
        tfTelefono.setText(Controlador.getTelefono());
        
        // Datos de la empresa
        tfNif.setText(Controlador.getNif());
        tfNombreEmpresa.setText(Controlador.getNombreEmpresa());
        tfRazonSocial.setText(Controlador.getRazonSocial());
        tfCnae.setText(Controlador.getCnae());
        bAceptar.requestFocus();
        
        // todo está deshabilitado. Se puede habilitar para que cambie datos.
        
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
            java.util.logging.Logger.getLogger(VentanaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox cbNombreAcontecimiento;
    private com.github.lgooddatepicker.components.DatePicker dpFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCnae;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNif;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreEmpresa;
    private javax.swing.JTextField tfRazonSocial;
    private javax.swing.JTextField tfTelefono;
    private com.github.lgooddatepicker.components.TimePicker tpHora;
    // End of variables declaration//GEN-END:variables
}
