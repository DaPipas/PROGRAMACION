/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import UML.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 1gdaw05
 */
public class ClienteDAO {
    public static Connection con;
    
    public static void alta(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        String plantilla = "INSERT INTO cliente"
                         + "VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.setString(2, c.getNombre());
        ps.setString(3, c.getApellidos());
        ps.setString(4, c.getDireccion());
        ps.setString(5, c.getTelefono());
        ps.setString(6, c.getEmail());
        int x = ps.executeUpdate();
        if(x!=1) //no obligatorio
            throw new Exception("Se ha incertado mas de una fila.");
        System.out.println("Se ha dado de alta al cliente con exito.");
    }
    
    public static void baja(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        String plantilla = "DELETE FROM cliente "
                         + "WHERE LOWER(dni)= ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        int x = ps.executeUpdate();
        if(x != 1)
            throw new Exception("Se ha eliminado más de un cliente en la base de datos.");
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
        System.out.println("Cliente actualizado con exito.");
    }
    
    public static Cliente obtenerDatos(Cliente c) throws Exception{
        ControladorDB.conectar();
        con = ControladorDB.getCon();
        String plantilla = "SELECT *"
                         + "FROM cliente";
        plantilla = completarPlantilla(c);
             
                         
    }
    
    private static String completarPlantilla(Cliente c) throws Exception{
        String plusPlantilla = " WHERE";
        if(!c.getDni().isEmpty())
            plusPlantilla += " LOWER(dni) = ? AND";
        if(!c.getNombre().isEmpty())
            plusPlantilla += " LOWER(nombre) = ? AND";
        if(!c.getApellidos().isEmpty())
            plusPlantilla += " LOWER(apellidos) = ? AND";
        if(!c.getDireccion().isEmpty())
            plusPlantilla += " LOWER(direccion) = ? AND";
        if(!c.getTelefono().isEmpty())
            plusPlantilla += " telefono = ? AND";
        if(!c.getEmail().isEmpty())
            plusPlantilla += " LOWER(email) = ? AND";
        
        // - AND
        
        // desconexiones faltan 
    }
}
