
package ModeloDB;

import ModeloUML.Persona;
import java.sql.*;
import java.util.ArrayList;

public class TablaPersona {
    private BaseDatos bd;
    private Connection con;

    public TablaPersona() {
        bd = new BaseDatos();
        this.con = bd.getCon();
    }
    
    public void insertar(Persona p) throws Exception{
        bd.conectar();
        
        // Preparar y ejecutar setencia sql
        
        String plantilla = "insert into persona values (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        
        int n = ps.executeUpdate();
        if(n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        bd.desconectar();
        
    }
    
    public void actualizar(Persona p) throws Exception{
        bd.conectar();
        
        // Preparar y ejecutar sentencia sql
        
        String plantilla = "update persona set nombre=?, edad=?, profesion=? where telefono=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.set
    }
    
    public void borrar(Persona p) throws Exception{}
    
    public Persona seleccionarUna() throws Exception{
    
    }
    
    public ArrayList<Persona> seleccionarTodo() throws Exception{
    
    }
}
