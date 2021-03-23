/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Evento;
import UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author 1gdaw05
 */
public class tablaAsistentes {
    private static Connection con;
    
    public static void insertAsistente(Evento e, Persona p) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "INSERT INTO asistentes VALUES( nombre = ?, dni = ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        ps.setString(2, p.getDni());
        int x = ps.executeUpdate();
        if(x!=1){
            throw new Exception("Se ha actualizado mas de una fila.");
        }
        else{
            System.out.println("Se ha insertado un nuevo asistente al evento");
        }
    }
    
    public static int getNumeroAsistentes(Evento e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        String plantilla = "SELECT COUNT(*) FROM asistentes WHERE LOWER(nombre) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, toLowerCase(e.getNombre()));
        ResultSet resultado = ps.executeQuery();
        if(resultado.next())
        {
            int total = resultado.getInt(1);
            System.out.println("Numerro de Asistentes obtenido con exito.");
            ControladorBD.desconectar();
            return total;
        }
        System.out.println("Error obteniendo Numerro de Asistentes");
        ControladorBD.desconectar();
        return -1;
    }
    
    public static boolean validarAsistencia(Evento e, Persona p) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        String plantilla = "SELECT * FROM asistentes WHERE LOWER(nombre) = ? AND LOWER(dni) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, toLowerCase(e.getNombre()));
        ps.setString(2, toLowerCase(p.getDni()));
        ResultSet resultado = ps.executeQuery();
        if(resultado.next())
        {
            System.out.println("Asistencia confirmada.");
            ControladorBD.desconectar();
            return true;
        }
        System.out.println("Asistencia no registrada.");
        ControladorBD.desconectar();
        return false;
    }
    
    public static ArrayList<String> getAsistentes(Evento e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        String plantilla = "SELECT dni FROM asistentes WHERE LOWER(nombre) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, toLowerCase(e.getNombre()));
        ResultSet resultado = ps.executeQuery();
        ArrayList<String> listaAsistentes = new ArrayList();
        while(resultado.next())
        {
            listaAsistentes.add(resultado.getString("dni"));
        }
        if(resultado!=null)
        {
            System.out.println("DNI de asistentes obtenido.");
            ControladorBD.desconectar();
            return listaAsistentes;
        }
        System.out.println("Error lista de Asistente no obtenida");
        ControladorBD.desconectar();
        return null;
    }
}
