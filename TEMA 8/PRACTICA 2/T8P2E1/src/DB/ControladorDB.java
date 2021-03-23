/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 1gdaw05
 */
public class ControladorDB {
    private static Connection con;
    
    public static void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd = "bd_t8p2e1";
            String url = "jdbc:mysql://localhost:3306/"+bd;
            String login = "root";
            String pass = "usbw";
            con = DriverManager.getConnection(url, login, pass);
            
            if(con == null)
            {
                throw new Exception("Problemas con la conexion con la base de datos.");
            }
            else{
                System.out.println("Conexion realizada con exito.");
            }
        }
        catch(Exception e){
            t8p2e1.T8P2E1.abrirError(e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void desconectar() throws Exception{
        try{
            con.close();
            System.out.println("Conexion cerrada con exito.");
        }
        catch(Exception e)
        {
            System.out.println("Problemas cerrando la conexion con la base de datos.");
        }
    }
    
    public static Connection getCon() throws Exception{
        return con;
    }
}
