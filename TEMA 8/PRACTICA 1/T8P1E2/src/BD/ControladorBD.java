/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
/**
 *
 * @author 1gdaw05
 */
public class ControladorBD {
    private static Connection con;

    public static void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd = "bd_t8p1e2";
            String url = "jdbc:mysql://localhost:3306/"+bd;
            String login = "root";
            String password = "usbw";
            con = DriverManager.getConnection(url,login,password);
            
            if(con == null){
                throw new Exception("Problemas con la conexion con la base de datos");
            }
            else{
                System.out.println("----Conexion realizada con exito.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void desconectar(){
        try{
            con.close();
            System.out.println("----Conexion cerrada con exito.");
        }
        catch(Exception e){
            System.out.println("Problemas cerrando la conexion con la base de datos.");
        }
    }
    
    public static Connection getCon(){
        return con;
    }
}
