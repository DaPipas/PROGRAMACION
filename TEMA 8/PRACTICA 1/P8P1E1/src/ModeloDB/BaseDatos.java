/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import java.sql.*;

public class BaseDatos {
    private Connection con;

    public BaseDatos() {
    }
    
    public void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Dreiver");
            String bd = "bd_t8p1e1";
            String url = "jdbc:mysql://localhost:3306/"+bd;
            String login = "root";
            String password = "usbw";
            con = DriverManager.getConnection(url,login,password);
            
            if(con==null){
                throw new Exception("problemas con la conexión");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void desconectar(){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println("Problemas cerrando la conexión con la base de datos");
        }
    }
    
    public Connection getCon(){
        return con;
    }
}
