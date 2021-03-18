/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;

    

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
        
        ControladorBD.desconectar();
        System.out.println("Insert de eventos realizado con exito.");
    } 
}
