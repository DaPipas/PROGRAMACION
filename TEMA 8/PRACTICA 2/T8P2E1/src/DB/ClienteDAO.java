/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import UML.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class ClienteDAO {
    public static Connection con;
    
    public static void alta(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        String plantilla = "INSERT INTO cliente "
                         + "VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.setString(2, c.getNombre());
        ps.setString(3, c.getApellidos());
        ps.setString(4, c.getDireccion());
        ps.setString(5, c.getTelefono());
        ps.setString(6, c.getEmail());
        int x = ps.executeUpdate();
        ControladorDB.desconectar();
        System.out.println("Se ha dado de alta al cliente con exito.");
    }
    
    public static void baja(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        String plantilla = "DELETE FROM cliente "
                         + "WHERE LOWER(dni)= ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.executeUpdate();
        ControladorDB.desconectar();
        System.out.println("Se ha eliminado el cliente con exito.");
    }
    
    public static void modificar(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        String plantilla = "UPDATE cliente"
                         + "SET nombre = ?,"
                            + "apellidos = ?,"
                            + "direccion = ?,"
                            + "telfono = ?,"
                            + "email = ?"
                         + "WHERE LOWER(dni) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getNombre());
        ps.setString(2, c.getApellidos());
        ps.setString(3, c.getDireccion());
        ps.setString(4, c.getTelefono());
        ps.setString(5, c.getEmail());
        ps.setString(6, c.getDni());
        
        int x = ps.executeUpdate();
        if(x != 1)
            throw new Exception("Se ha actualizado más de un cliente.");
        ControladorDB.desconectar();
        System.out.println("Cliente actualizado con exito.");
    }
    
    public static ArrayList<Cliente> obtenerDatos(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        
        String plantilla = "SELECT *"
                         + "FROM cliente";
        
        Boolean cDni = false;
        Boolean cNombre = false;
        Boolean cApellidos = false;
        Boolean cDireccion = false;
        Boolean cTelefono = false;
        Boolean cEmail = false;
        
        PreparedStatement ps = completarPlantilla(c, plantilla, cDni, cNombre, cApellidos, cDireccion, cTelefono, cEmail);
        ResultSet resultado = ps.executeQuery();
        if(resultado == null)
            throw new Exception("Datos no obtenidos.");
        
        ArrayList<Cliente> listaClientes = datosClientes(resultado, cDni, cNombre, cApellidos, cDireccion, cTelefono, cEmail);
        return listaClientes;          
    }
    
    private static PreparedStatement completarPlantilla(Cliente c, String plantilla, Boolean cDni, Boolean cNombre, Boolean cApellidos, Boolean cDireccion, Boolean cTelefono, Boolean cEmail) throws Exception{
        PreparedStatement ps;
        String plusPlantilla = " WHERE";
        cDni = comprobarDni(c, plusPlantilla);
        cNombre = comprobarNombre(c, plusPlantilla);
        cApellidos = comprobarApellidos(c, plusPlantilla);
        cDireccion = comprobarDireccion(c, plusPlantilla);
        cTelefono = comprobarTelefono(c, plusPlantilla);
        cEmail = comprobarEmail(c, plusPlantilla);
        
        //Si tenemos clasula where debemos eliminar en "AND" del final del String
        if(!plusPlantilla.equals(" WHERE"))
        {
            plusPlantilla = plusPlantilla.substring(0, plusPlantilla.lastIndexOf("AND"));
            plantilla += plusPlantilla;
        }
        plantilla += ";";
        
        ps = con.prepareStatement(plantilla);
        prepararPlantilla(ps, c, cDni, cNombre, cApellidos, cDireccion, cTelefono, cEmail);
        
        return ps;
    }
    
    private static Boolean comprobarDni(Cliente c, String plusPlantilla) throws Exception{
        if(!c.getDni().isEmpty())
        {
            plusPlantilla += " LOWER(dni) = ? AND";
            return true;
        }
        return false;
    }
    private static Boolean comprobarNombre(Cliente c, String plusPlantilla) throws Exception{
        if(!c.getNombre().isEmpty())
        {
            plusPlantilla += " LOWER(nombre) = ? AND";
            return true;
        }
        return false;
    }
    private static Boolean comprobarApellidos(Cliente c, String plusPlantilla) throws Exception{
        if(!c.getApellidos().isEmpty())
        {
            plusPlantilla += " LOWER(apellidos) = ? AND";
            return true;
        }
        return false;
    }
    private static Boolean comprobarDireccion(Cliente c, String plusPlantilla) throws Exception{
        if(!c.getDireccion().isEmpty())
        {
            plusPlantilla += " LOWER(direccion) = ? AND";
            return true;
        }
        return false;
    }
    private static Boolean comprobarTelefono(Cliente c, String plusPlantilla) throws Exception{
        if(!c.getTelefono().isEmpty())
        {
            plusPlantilla += " telefono = ? AND";
            return true;
        }
        return false;
    }
    private static Boolean comprobarEmail(Cliente c, String plusPlantilla) throws Exception{
        if(!c.getEmail().isEmpty())
        {
            plusPlantilla += " LOWER(email) = ? AND";
            return true;
        }
        return false;
    }
    
    private static void prepararPlantilla(PreparedStatement ps, Cliente cliente, Boolean cDni, Boolean cNombre, Boolean cApellidos, Boolean cDireccion, Boolean cTelefono, Boolean cEmail) throws Exception{
        int contador = 1;
        if(cDni)
        {
            ps.setString(contador, cliente.getDni());
            contador++;
        }
        if(cNombre)
        {
            ps.setString(contador, cliente.getNombre());
            contador++;
        }
        if(cApellidos)
        {
            ps.setString(contador, cliente.getApellidos());
            contador++;
        }
        if(cDireccion)
        {
            ps.setString(contador, cliente.getDireccion());
            contador++;
        }
        if(cTelefono)
        {
            ps.setString(contador, cliente.getTelefono());
            contador++;
        }
        if(cEmail)
        {
            ps.setString(contador, cliente.getEmail());
            contador++;
        }
    }
    
    private static ArrayList<Cliente> datosClientes(ResultSet resultado, Boolean cDni, Boolean cNombre, Boolean cApellidos, Boolean cDireccion, Boolean cTelefono, Boolean cEmail) throws Exception{
        ArrayList<Cliente> listaClientes = new ArrayList();
        while(resultado.next())
        {
            Cliente c = getDatos(resultado, cDni, cNombre, cApellidos, cDireccion, cTelefono, cEmail);
            listaClientes.add(c);
        }
        return listaClientes;
    }
    
    private static Cliente getDatos(ResultSet resultado, Boolean cDni, Boolean cNombre, Boolean cApellidos, Boolean cDireccion, Boolean cTelefono, Boolean cEmail) throws Exception{
        Cliente cliente = new Cliente();
        if(cDni)
        {
            cliente.setDni(resultado.getString("dni"));
        }
        if(cNombre)
        {
            cliente.setNombre(resultado.getString("nombre"));
        }
        if(cApellidos)
        {
            cliente.setApellidos(resultado.getString("apellidos"));
        }
        if(cDireccion)
        {
            cliente.setDireccion(resultado.getString("direccion"));
        }
        if(cTelefono)
        {
            cliente.setTelefono(resultado.getString("telefono"));
        }
        if(cEmail)
        {
            cliente.setEmail(resultado.getString("email"));
        }
        return cliente;
    }
}
