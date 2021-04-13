
package t9p1e1_v2;

import Modelo.BD.*;
import Modelo.ClasesUML.Persona;
import Vista.*;
import java.util.ArrayList;

public class Principal {

    private static DbConnection bdcon;
    private static PersonaDAO miPersonaDAO;
    private static Ventana v;
    private static VMenu vm;
    private static ArrayList<Persona> listaPersonas;
    private static int posicion;
 
    public static void main(String[] args) 
    {
        try
        {
            // Ya no hay ArrayList inventados o creados
            // Ahora hay una base de datos
            bdcon = new DbConnection();
            bdcon.conectar();
            miPersonaDAO = new PersonaDAO(bdcon.getConnection());

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
         miPersona.setNombrePersona(n);
         miPersona.setEdadPersona(e);
         miPersona.setProfesionPersona(pr);
         miPersona.setTelefonoPersona(t);

         // Ir a la base de datos
         miPersonaDAO.registrarPersona(miPersona);
    }
         
    public static void salir()
    {
        v.dispose();
        vm.setVisible(true);
    }
    
    public static void terminar() throws Exception
    {
        bdcon.desconectar();
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
        listaPersonas = miPersonaDAO.listaDePersonas();
        //Se comprueba si hay información
        if (listaPersonas.size()>0) 
        {
            // Paso a la ventana los datos del primero
            posicion = 0;
            v = new Ventana(listaPersonas.get(0).getNombrePersona(),listaPersonas.get(0).getEdadPersona(),listaPersonas.get(0).getProfesionPersona(),listaPersonas.get(0).getTelefonoPersona());
            v.setVisible(true);
        }
        else
            throw new Exception("No hay personas");
 }
    
  public static String getSiguienteNombre()
  {
      posicion = posicion + 1;
      return listaPersonas.get(posicion).getNombrePersona();
  }
  
  public static Integer getEdad()
  {
     return listaPersonas.get(posicion).getEdadPersona();
  }
   
  public static String getProfesion()
  {
      return listaPersonas.get(posicion).getProfesionPersona();
  }
    
  public static String getTelefono()
  {
      return listaPersonas.get(posicion).getTelefonoPersona();
  }
  
  public static String getAnteriorNombre()
  {
      posicion = posicion - 1;
      return listaPersonas.get(posicion).getNombrePersona();
  }
   
  public static void visualizar(Persona p)
  {
        System.out.println("Nombre Persona: "+p.getNombrePersona());
        System.out.println("Edad Persona: "+p.getEdadPersona());
        System.out.println("Profesión Persona: "+p.getProfesionPersona());
        System.out.println("Telefono Persona: "+p.getTelefonoPersona());
        System.out.println("*************************************************\n");
  }
    
    public static void buscarPersona(String nombre) throws Exception
    {
        Persona miPersona = miPersonaDAO.consultarPersona(nombre);
        visualizar(miPersona);
    }
}
