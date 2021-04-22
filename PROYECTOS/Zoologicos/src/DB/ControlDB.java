
package DB;


import java.sql.Connection;
import java.sql.DriverManager;


public class ControlDB {
    private static Connection con;
    
    public static void abrirDB() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/zoo_proyecto";
        con = DriverManager.getConnection(url, "root", "usbw");
    }
    
    public static void cerraDB() throws Exception{
        con.close();
    }
    
    public static Connection getCon(){
        return con;
    }
}
