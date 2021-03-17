
package t8p1e1;

import Excepciones.Problemas;
import ModeloDB.TablaPersona;
import ModeloUML.Persona;
import Vista.Gestion;
import Vista.Menu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T8P1E1 {
    
    public static Persona personaActual;
    public static ArrayList<Persona> listaPersonas;
    
    public static void main(String[] args) {
        try
        {
            abrirMenu();
        }
       
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + " " + e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void abrirMenu() throws Exception{
        Menu m = new Menu();
        m.setVisible(true);
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static void abrirAlta() throws Exception{
        Gestion alta = new Gestion(1);
        alta.setVisible(true);
    }
    
    public static void abrirConsultaIndividual() throws Exception{
        String telefono = JOptionPane.showInputDialog("Introduce el numero de telefono de la persona que deses consultar: ");
        TablaPersona datoPersona = new TablaPersona();
        personaActual = datoPersona.seleccionarUna(telefono);
        Gestion cIndividual = new Gestion(2);
        cIndividual.setVisible(true);
    }
    
    public static void abrirConsultaMultiple() throws Exception{
        Gestion cMultiple = new Gestion();
        TablaPersona datosPersonas = new TablaPersona();
        listaPersonas = new ArrayList();
        listaPersonas = datosPersonas.seleccionarTodo();
        cMultiple.setVisible(true);
    }
    
    public static String nombreIndividual() throws Exception{
        return personaActual.getNombre();
    }
    
    public static int edadIndividual() throws Exception{
        return personaActual.getEdad();
    }
    
    public static String profesionIndividual() throws Exception{
        return personaActual.getProfesion();
    } 
    
    public static String telefonoIndividual() throws Exception{
        return personaActual.getTelefono();
    }
    
    public static String nombreMultiple(int posicion) throws Exception{
        if(posicion <= listaPersonas.size())
        {
            return listaPersonas.get(posicion).getNombre();
        }
        else
        {
            return listaPersonas.get(listaPersonas.size()).getNombre();
        }
    }
    
    public static int edadMultiple(int posicion) throws Exception{
        if(posicion <= listaPersonas.size())
        {
            return listaPersonas.get(posicion).getEdad();
        }
        else
        {
            return listaPersonas.get(listaPersonas.size()).getEdad();
        }
    }
    
    public static String profesionMultiple(int posicion) throws Exception{
        if(posicion <= listaPersonas.size())
        {
            return listaPersonas.get(posicion).getProfesion();
        }
        else
        {
            return listaPersonas.get(listaPersonas.size()).getProfesion();
        }
    }
    
    public static String telefonoMultiple(int posicion) throws Exception{
        if(posicion <= listaPersonas.size())
        {
            return listaPersonas.get(posicion).getTelefono();
        }
        else
        {
            return listaPersonas.get(listaPersonas.size()).getTelefono();
        }
}
    
    public static int maxPersonas() throws Exception{
        return listaPersonas.size();
    }
    
    public static void altaNueva(String nombre, int edad, String profesion, String telefono) throws Exception{
        Persona p = new Persona(nombre, edad, profesion, telefono);
        TablaPersona tp = new TablaPersona();
        tp.insertar(p);
    }
}
