
package t9p1e1_v2;

import Modelo.BD.*;
import Modelo.UML.Persona;
import Vista.*;
import java.util.List;
import javax.persistence.Persistence;

public class Principal {

    private static PersonaJpaController PersonaBD;
    private static Ventana v;
    private static VMenu vm;
    private static List<Persona> listaPersonas;
    private static int posicion;
 
    public static void main(String[] args) 
    {
        try
        {
            
            System.out.println("Inicio.");
            //crear el controlador que tiene los metodos de la bd
            PersonaBD = new PersonaJpaController(Persistence.createEntityManagerFactory("t9p1e1_v2PU"));
            
            vm = new VMenu();
            vm.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Problemas en el main");
        }
    }
      
    public static void alta() 
    {
        // Quieren dar de alta una persona
        vm.setVisible(false);
        
        v = new Ventana();
        v.setVisible(true);
    }
    
    public static void registrarPersona(String n, Integer e, String pr, String t)throws Exception
    {
         // Crear  y llenar el objeto
         Persona miPersona=new Persona();
         miPersona.setNombre(n);
         miPersona.setEdad(e);
         miPersona.setProfesion(pr);
         miPersona.setTelefono(t);

         // Ir a la base de datos
        PersonaBD.create(miPersona);
    }
         
    public static void salir()
    {
        v.dispose();
        vm.setVisible(true);
    }
    
    public static void terminar() throws Exception
    {
        System.exit(0);
    }
    
    public static boolean isSiguiente()
    {
        if (posicion == listaPersonas.size()-1)
            return false;
        return true;
        
        // return posicion != listaPersonas.size()-1;
    }
    
    public static boolean isAnterior()
    {
        if (posicion == 0)
            return false;
        return true;
        // return posicion != 0;
    }
    
    public static void obtenerDatos() throws Exception
    {
        //Se obtiene la lista de personas
        listaPersonas = PersonaBD.findPersonaEntities();
        //Se comprueba si hay información
        if (listaPersonas.size()>0) 
        {
            // Paso a la ventana los datos del primero
            posicion = 0;
            v = new Ventana(listaPersonas.get(0).getNombre(),listaPersonas.get(0).getEdad(),listaPersonas.get(0).getProfesion(),listaPersonas.get(0).getTelefono());
            v.setVisible(true);
        }
        else
            throw new Exception("No hay personas");
 }
    
  public static String getSiguienteNombre()
  {
      posicion = posicion + 1;
      return listaPersonas.get(posicion).getNombre();
  }
  
  public static Integer getEdad()
  {
     return listaPersonas.get(posicion).getEdad();
  }
   
  public static String getProfesion()
  {
      return listaPersonas.get(posicion).getProfesion();
  }
    
  public static String getTelefono()
  {
      return listaPersonas.get(posicion).getTelefono();
  }
  
  public static String getAnteriorNombre()
  {
      posicion = posicion - 1;
      return listaPersonas.get(posicion).getNombre();
  }
   
  public static void visualizar(Persona p)
  {
        System.out.println("Nombre Persona: "+p.getNombre());
        System.out.println("Edad Persona: "+p.getEdad());
        System.out.println("Profesión Persona: "+p.getProfesion());
        System.out.println("Telefono Persona: "+p.getTelefono());
        System.out.println("*************************************************\n");
  }
    
    public static void buscarPersona(String telefono) throws Exception
    {
        Persona miPersona = PersonaBD.findPersona(telefono);
        visualizar(miPersona);
    }
}
