
package ModeloDB;

import Excepciones.Problemas;
import ModeloUML.Persona;
import java.sql.*;
import java.util.ArrayList;

public class TablaPersona {
    private Connection con;

    public TablaPersona() {
    }
    
    public void insertar(Persona p) throws Exception{
        BaseDatos.conectar();
        con = BaseDatos.getCon();
        
        // Preparar y ejecutar setencia sql
        
        String plantilla = "insert into persona (nombre, edad, profesion, telefono) values (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        
        int n = ps.executeUpdate();
        if(n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        BaseDatos.desconectar();
        
    }
    
    public void actualizar(Persona p) throws Exception{
        BaseDatos.conectar();
        con = BaseDatos.getCon();
        
        // Preparar y ejecutar sentencia sql
        
        String plantilla = "update persona set nombre=?, edad=?, profesion=? where telefono=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3,p.getProfesion());
        ps.setString(4,p.getTelefono());
        
        int n = ps.executeUpdate();
        if(n != 1)
            throw new Problemas("Más de una fila actualizada.");
        
        BaseDatos.desconectar();
    }
    
    public void borrar(String telefono) throws Exception{
        BaseDatos.conectar();
        con = BaseDatos.getCon();
        
        String plantilla = "delete from persona where telefono = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, telefono);
        
        int n = ps.executeUpdate();
        if(n !=1)
            throw new Problemas("Se ha borrado más de una persona.");
    }
    
    public Persona seleccionarUna(String telefono) throws Exception{
        BaseDatos.conectar();
        con = BaseDatos.getCon();
        
        String plantilla = "select nombre, edad, profesion, telefono from persona where telefono = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,telefono);
        
        ResultSet resultado = ps.executeQuery();
        if(resultado.next())
        {
            Persona p = new Persona();
            p.setNombre(resultado.getString("nombre"));
            p.setEdad(resultado.getInt("edad"));
            p.setProfesion(resultado.getString("profesion"));
            p.setTelefono(resultado.getString("telefono"));
            
            BaseDatos.desconectar();
            return p;
        }
        else
        {
            BaseDatos.desconectar();
            return null;
        }
    }
    
    public ArrayList<Persona> seleccionarTodo() throws Exception{
        BaseDatos.conectar();
        con = BaseDatos.getCon();
        
        String plantilla = "select nombre, edad, profesion, telefono from persona;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        
        ResultSet resultado = ps.executeQuery();
        
        ArrayList<Persona> listaPersona = new ArrayList();
        while(resultado.next())
        {
            Persona p = new Persona();
            p.setNombre(resultado.getString("nombre"));
            p.setEdad(resultado.getInt("edad"));
            p.setProfesion(resultado.getString("profesion"));
            p.setTelefono(resultado.getString("telefono"));
            
            listaPersona.add(p);
        }
        
        BaseDatos.desconectar();
        return listaPersona;
    }
}
