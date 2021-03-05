
package ModeloBD;

import ModeloUML.Persona;
import java.sql.*;
import java.util.ArrayList;


public class TablaPersonas {
    
    private Connection con;
    private TablaVehiculos tv;

    public TablaPersonas(Connection con) {
        this.con = con;
    }
    
    public void setTablaVehiculos(TablaVehiculos tv)
    {
        this.tv = tv;
    }
    
     public void insertar(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO tpersonas VALUES (?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
        ps.setString(2,p.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizar(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "UPDATE tpersonas SET nombre =?  WHERE dni =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(2, p.getDni());
        ps.setString(1,p.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
      public void borrar(Persona p) throws Exception
    {
        // no es necesario todo el objeto con el dni es suficiente
        
        String plantilla = "Delete from tpersonas where dni=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
        
    public ArrayList<Persona>  seleccionarTodo() throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
       
        // Con Statement también se puede porque no hay parametros.
        
        String plantilla = "select * from tpersonas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
       // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es un conjunto de filas y columnas
      // .next nos mueve a la siguiente fila y devuelve true. Si estoy ya en la última fila devuelve false.
       while(resultado.next())
       {
                // Crear objeto
                Persona p = new Persona();
                // resultado.get para coger el contenido de la columna dni que es un string
                p.setDni(resultado.getString("dni"));
                p.setNombre(resultado.getString("nombre"));
                
                lista.add(p);
       }
       return lista;
    }

    public ArrayList<Persona>  seleccionarTodoV2() throws Exception
    {
        // Esta nueva versión busca los vehiculos de una persona
        ArrayList<Persona> lista = new ArrayList();
        String plantilla = "select * from tpersonas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
                Persona p = new Persona();
                p.setDni(resultado.getString("dni"));
                p.setNombre(resultado.getString("nombre"));
                p.setListaVehiculos(tv.seleccionarPorDni(p));
                
                lista.add(p);
       }
       return lista;
    }
    
    public Persona  seleccionarUna(String dni) throws Exception
    {
        
        String plantilla = "select * from tpersonas where dni = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, dni);
       
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Persona p = new Persona();
           // resultado.get para coger el contenido de la columna dni
           p.setDni(resultado.getString("dni"));
           p.setNombre(resultado.getString("nombre"));
           return p;
       }
       else
           // No hay nadie con ese dni
           return null;
    }
    
    
}
