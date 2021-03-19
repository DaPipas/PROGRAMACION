/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author 1gdaw05
 */
public class tablaPersona {
    private static Connection con;
    //
    public static void insertPersona(Persona p) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "INSERT INTO persona VALUES(?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getApellido());
        ps.setString(4, p.getTelefono());
        
        int n = ps.executeUpdate();
        
        if(n != 1)
            throw new Exception("Se ha insertado más de una persona.");
        
        System.out.println("Persona insertada con exito.");
        ControladorBD.desconectar();
    }
    
    public static Persona validarPersona(Persona p) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "SELECT * FROM persona WHERE LOWER(dni) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, toLowerCase(p.getDni()));
        
        ResultSet resultado = ps.executeQuery();
        Persona rPersona = new Persona();
        
        if(resultado == null)
        {
            System.out.println("Persona no encontrada.");
            rPersona = null;
            ControladorBD.desconectar();
            return rPersona;
        }
        else
        {
            resultado.next();
            rPersona.setDni(resultado.getString("dni"));
            rPersona.setNombre(resultado.getString("nombre"));
            rPersona.setApellido(resultado.getString("apellido"));
            rPersona.setTelefono(resultado.getString("telefono"));
            System.out.println("Persona encontrada");
            ControladorBD.desconectar();
            return rPersona;
        }
    }
    //
    //public static ArrayList<Persona> getDatosAsistentes(ArrayList<String> a) throws Exception{}
    
    
    
}
