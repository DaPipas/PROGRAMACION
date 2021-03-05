
package ModeloBD;

import ModeloUML.Vehiculo;
import ModeloUML.Persona;
import java.sql.*;
import java.util.ArrayList;


public class TablaVehiculos {
    
    private Connection con;
    private TablaPersonas tp;

    public TablaVehiculos(Connection con, TablaPersonas tp) {
        this.con = con;
        this.tp = tp;
    }
    
     public void insertar(Vehiculo v) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "INSERT INTO tvehiculos VALUES (?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, v.getMatricula());
        ps.setString(2,v.getModelo());
        // A través del objeto persona llegamos al dni
        ps.setString(3, v.getP().getDni());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
     public void actualizar(Vehiculo v) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        
        String plantilla = "UPDATE tvehiculos SET modelo =? ,dni=? WHERE matricula =?";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,v.getModelo());
        ps.setString(2,v.getP().getDni());
        ps.setString(3,v.getMatricula());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
     
     
      public void borrar(Vehiculo v) throws Exception
    {
        // no es necesario todo el objeto con la matricula es suficiente
        
        String plantilla = "Delete from tvehiculos where matricula=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, v.getMatricula());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
      
         public void borrar(String matricula) throws Exception
    {
        // no es necesario todo el objeto con la matricula es suficiente
        
        String plantilla = "Delete from tvehiculos where matricula=?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, matricula);
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
        
     public ArrayList<Vehiculo>  seleccionarTodo() throws Exception
    {
        ArrayList<Vehiculo> lista = new ArrayList();
       
        // Con Statement también se puede porque no hay parametros.
        
        String plantilla = "select * from tvehiculos;";
        PreparedStatement ps = con.prepareStatement(plantilla);
       
// executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es un conjunto de filas y columnas
      // .next nos mueve a la siguiente fila y devuelve true. Si estoy ya en la última fila devuelve false.
       while(resultado.next())
       {
                // Crear objeto
               Vehiculo v = new Vehiculo();
               
               // A las columnas se puede acceder por nombre o por posición
               v.setMatricula(resultado.getString("matricula"));
               v.setModelo(resultado.getString(2));
               // A través del dni hacemos la consulta en la tabla personas.
               v.setP(tp.seleccionarUna(resultado.getString("dni")));
                
                lista.add(v);
       }
       return lista;
    }

        public ArrayList<Vehiculo>  seleccionarPorDni(Persona p) throws Exception
    {
        ArrayList<Vehiculo> lista = new ArrayList();
        
        String plantilla = "select * from tvehiculos where dni = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDni());
       
      ResultSet resultado = ps.executeQuery();
       while(resultado.next())
       {
               Vehiculo v = new Vehiculo();
               
               v.setMatricula(resultado.getString("matricula"));
               v.setModelo(resultado.getString(2));
               v.setP(p);
                
                lista.add(v);
       }
       return lista;
    }
     
      public Vehiculo seleccionarUna(String matricula) throws Exception
    {
        
        String plantilla = "select * from tvehiculos where matricula= ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, matricula);
       
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
          Vehiculo v = new Vehiculo();
           v.setMatricula(resultado.getString("matricula"));
           v.setModelo(resultado.getString(2));
           // A través del dni hacemos la consulta en la tabla personas.
           v.setP(tp.seleccionarUna(resultado.getString("dni")));
           return v;
       }
       else
           // No hay vehiculo con esa matricula.
           return null;
    }
    
}
