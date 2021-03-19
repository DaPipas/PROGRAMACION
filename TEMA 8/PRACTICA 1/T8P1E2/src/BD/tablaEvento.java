/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

    

/**
 *
 * @author 1gdaw05
 */
public class tablaEvento {
    private static Connection con;
    
    public static void insertEvento(Evento e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "INSERT INTO evento (nombre, lugar, fecha, h_inicio, h_final, aforo) VALUES (?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getLugar());
        ps.setDate(3, java.sql.Date.valueOf(e.getFecha()));
        ps.setTime(4, java.sql.Time.valueOf(e.getH_inicio()));
        ps.setTime(5, java.sql.Time.valueOf(e.getH_final()));
        ps.setInt(6, e.getAforo());
        
        int n = ps.executeUpdate();
        
        if(n != 1)
        {
            throw new Exception("El numero de filas actualizadas no es uno.");
        }
        
        System.out.println("Insert de eventos realizado con exito.");
        
        ControladorBD.desconectar();
    } 
    
    public static void deleteEvento(Evento e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "DELETE FROM evento WHERE LOWER(nombre) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, toLowerCase(e.getNombre()));
        
        int n = ps.executeUpdate();
        
        if(n!=1)
            throw new Exception("El numero de eventos eliminados no es uno.");
        
        System.out.println("Evento eliminado con exito");
        
        ControladorBD.desconectar();
    }
    
    public static void updateEvento(Evento e ) throws Exception {
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "UPDATE evento SET lugar = ?, fecha = ?, h_inicio = ?, h_final = ?, aforo = ? WHERE nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getLugar());
        ps.setDate(2, java.sql.Date.valueOf(e.getFecha()));
        ps.setTime(3, java.sql.Time.valueOf(e.getH_inicio()));
        ps.setTime(4, java.sql.Time.valueOf(e.getH_final()));
        ps.setInt(5, e.getAforo());
        ps.setString(6, e.getNombre());
        
        int n = ps.executeUpdate();
        
        if(n!=1)
            throw new Exception("Más de un evento actualizado.");
        
        System.out.println("Evento actualizado con exito.");
        ControladorBD.desconectar();
    }
    
    public static Evento validarEvento(Evento e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "SELECT * FROM evento WHERE LOWER(nombre) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, toLowerCase(e.getNombre()));
        ResultSet resultado = ps.executeQuery();
        
        Evento eRespuesta = new Evento();
        if(resultado==null)
        {
            eRespuesta = null;
            System.out.println("Evento no existe el la BD");
            ControladorBD.desconectar();
            return eRespuesta;
        }
        else
        {
            resultado.next();
            eRespuesta.setNombre(resultado.getString("nombre"));
            eRespuesta.setLugar(resultado.getString("lugar"));
            eRespuesta.setFecha(LocalDate.parse(resultado.getString("fecha")));
            eRespuesta.setH_inicio(LocalTime.parse(resultado.getString("h_inicio")));
            eRespuesta.setH_final(LocalTime.parse(resultado.getString("h_final")));
            eRespuesta.setAforo(resultado.getInt("aforo"));
            
            System.out.println("Evento encontrado.");
            ControladorBD.desconectar();
            
            return eRespuesta;
        }
    }
    
    
    //public static Evento selectProximosEventos() throws Exception{}
    
    //public static int plazasDisponibles(Evento e) throws Exception{}
    
}
