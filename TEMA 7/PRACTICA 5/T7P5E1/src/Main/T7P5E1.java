/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Contrato;
import Clases.Departamento;
import Clases.Empleado;
import Clases.Usuario;
import Vista.Amenaza;
import Vista.Formulario;
import Vista.Inicio;
import Vista.Login;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author 1gdaw05
 */
public class T7P5E1 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Contrato> listaTiposContrato;
    private static ArrayList<Departamento> listaDepartamentos;
    private static ArrayList<Empleado> listaEmpleados;
    private static ArrayList<Usuario> listaUsuarios;
    private static Empleado usuarioActual;
    private static Empleado empleadoActual;
    
    
    public static void main(String[] args) {
        try{
            datosPrueba();
            abrirVentanaLogin();
        }
        catch(Exception e){
            error("#ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void bandera(){
        System.out.println("Buen trabajo");
    }
    
    public static void datosPrueba() throws Exception{
        listaTiposContrato = new ArrayList();
        listaDepartamentos = new ArrayList();
        listaEmpleados = new ArrayList();
        listaUsuarios = new ArrayList();
        
        listaTiposContrato.add(new Contrato("Media Jornada"));
        listaTiposContrato.add(new Contrato("Jornada Completa"));
        
        listaDepartamentos.add(new Departamento("Personal"));
        listaDepartamentos.add(new Departamento("Logistica"));
        listaDepartamentos.add(new Departamento("Marketing"));
        
        listaEmpleados.add(new Empleado("1234567-A", 123456789, "Anderson Silva","Los Santos", "655444777", 'H', 'C', listaTiposContrato.get(1), listaDepartamentos.get(0), LocalDate.now(), 0001));
        listaEmpleados.add(new Empleado("2345678-B", 123456789, "Mohamed Ali","Barbosas", "678451232", 'H', 'S', listaTiposContrato.get(0), listaDepartamentos.get(1), LocalDate.now(), 0002));
        listaEmpleados.add(new Empleado("3456789-C", 123456789, "Mike Tyson","Jamaica", "674859632", 'M', 'C', listaTiposContrato.get(0), listaDepartamentos.get(2), LocalDate.now(), 0003));
        
        listaUsuarios.add(new Usuario(listaEmpleados.get(0).getDni(), "123456", listaEmpleados.get(0)));
        
        
    }
    
    public static void abrirVentanaLogin() throws Exception{
        Login l1 = new Login();
        l1.setVisible(true);
        bandera();
    }
    
    public static boolean usuarioValido(String usuario, String pass) throws Exception{
        boolean encontrado = false;
        boolean validado = false;
        for(int x = 0; x < listaUsuarios.size() && encontrado == false; x++){
            if(listaUsuarios.get(x).getUsuario().contains(usuario)){
                encontrado = true;
                if(listaUsuarios.get(x).getContrasena().contains(DigestUtils.md5Hex(pass))){
                    usuarioActual = listaUsuarios.get(x).getEmpleado();
                    validado = true;
                }
            }
        }
        return validado;
    }
    
    public static void abrirVentanaInicio() throws Exception{
        Inicio i1 = new Inicio();
        i1.setVisible(true);
    }
    
    public static void abrirAmenaza(){
        Amenaza a1 = new Amenaza(null, true);
        a1.setVisible(true);
    } 
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static void abrirFormulario(int controlador) throws Exception{
        Formulario f1 = new Formulario();
        f1.setVisible(true);
    }
    
    public static String datoNss() throws Exception{
        return String.valueOf(empleadoActual.getNss());
    }
    
    public static String datoNombreApellidos() throws Exception{
        return empleadoActual.getNombreApellido();
    }
    
    public static String datoDireccion() throws Exception{
        return empleadoActual.getDireccion();
    }
    
    public static String datoTelefono() throws Exception{
        return empleadoActual.getTelefono();
    }
    
    public static String datoSexo() throws Exception{
        return String.valueOf(empleadoActual.getSexo());
    }
    
    public static String datoEstadoCivil() throws Exception{
        return String.valueOf(empleadoActual.getEstadoCivil());
    }
    
    public static int datoContrato() throws Exception{
        int x;
        for(x = 0; x < listaTiposContrato.size() && empleadoActual.getTipoContrato() == listaTiposContrato.get(x); x++){}
        return x;
    }
    
    public static int datoDepartamento() throws Exception{
        int x;
        for(x = 0; x < listaDepartamentos.size() && empleadoActual.getDepartamento() == listaDepartamentos.get(x); x++){}
        return x;
    }
}
