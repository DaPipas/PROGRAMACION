/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p2e1;

import DB.AbogadoDAO;
import DB.ClienteDAO;
import GUI.Alta;
import GUI.Baja;
import GUI.ErrorGenerico;
import GUI.Inicio;
import UML.Abogado;
import UML.Cliente;

/**
 *
 * @author 1gdaw05
 */
public class T8P2E1 {

    /**
     * @param args the command line arguments
     */
    public static Cliente clienteActual;
    public static Abogado abogadoActual;
    
    public static Inicio vInicio;
    public static Alta vAlta;
    public static Baja vBaja;
    
    public static void main(String[] args) {
        try
        {
            clienteActual = new Cliente();
            abogadoActual = new Abogado();
            abrirInicio();
            
        }
        catch(Exception e)
        {
            abrirError(e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static void abrirError(String mensaje){
        ErrorGenerico e = new ErrorGenerico(mensaje);
        e.setVisible(true);
    }
    
    public static void abrirInicio() throws Exception{
        vInicio = new Inicio();
        vInicio.setVisible(true);
    }
    
    public static void abrirAlta(Boolean cliente) throws Exception{
        //abrir en modo cliente true o false
        vAlta = new Alta(cliente);
        vAlta.setVisible(true);
    }
    
    public static void datoDni(String dni, Boolean cliente) throws Exception{
        if(cliente)
        {
            clienteActual.setDni(dni);
        }
        else
        {
            abogadoActual.setDni(dni);
        }
    }
    public static void datoNombre(String nombre, Boolean cliente) throws Exception{
        if(cliente)
        {
            clienteActual.setNombre(nombre);
        }
        else
        {
            abogadoActual.setNombre(nombre);
        }
    }
    public static void datoApellidos(String apellidos, Boolean cliente) throws Exception{
        if(cliente)
        {
            clienteActual.setApellidos(apellidos);
        }
        else
        {
            abogadoActual.setApellidos(apellidos);
        }
    }
    public static void datoDireccion(String direccion, Boolean cliente) throws Exception{
        if(cliente)
        {
            clienteActual.setDireccion(direccion);
        }
        else
        {
            abogadoActual.setDireccion(direccion);
        }
    }
    public static void datoTelefono(String telefono) throws Exception{
        clienteActual.setTelefono(telefono);
    }
    public static void datoEmail(String email) throws Exception{
            clienteActual.setEmail(email);
    }
    
    public static void Alta(Boolean cliente) throws Exception{
        if(cliente)
        {
            ClienteDAO.alta(clienteActual);
        }
        else
        {
            //AbogadoDAO.alta(abogadoActual);
        }
    }
    
    public static void abrirBaja(Boolean cliente) throws Exception{
        //abrir en modo cliente true o false
        vBaja = new Baja(cliente);
        vBaja.setVisible(true);
    }
    
    public static boolean getDatosCliente(String dni) throws Exception{
        clienteActual = new Cliente();
        clienteActual.setDni(dni);
        clienteActual = ClienteDAO.selectByDni(clienteActual);
        if(clienteActual == null)
            return false;
        return true;
    }
    
    public static boolean getDatosAbogado(String dni) throws Exception{
        abogadoActual = new Abogado();
        abogadoActual.setDni(dni);
        abogadoActual = AbogadoDAO.selectByDni(abogadoActual);
        if(abogadoActual == null)
            return false;
        return true;
    }
}
