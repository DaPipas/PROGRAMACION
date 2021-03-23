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
        String plantilla = "INSERT INTO cliente VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.setString(2, c.getNombre());
        ps.setString(3, c.getApellidos());
        ps.setString(4, c.getDireccion());
        ps.setString(5, c.getTelefono());
        ps.setString(6, c.getEmail());
        int x = ps.executeUpdate();
        if(x!=1)
            throw new Exception("Se ha incetado mas de una fila.");
        System.out.println("Se ha dado de alta al cliente con exito.");
    }
    
    public static void baja(Cliente c) throws Exception{}
    
    public static void modificar(Cliente c) throws Exception{}
    
    public static Cliente obtenerDatos(Cliente c) throws Exception{}
    
}
