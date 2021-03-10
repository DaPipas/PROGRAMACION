
package t8p1e1;

import ModeloDB.TablaPersona;
import ModeloUML.Persona;
import Vista.Gestion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T8P1E1 {
    
    public static Persona personaActual;
    public static ArrayList<Persona> listaPersonas;
    
    public static void main(String[] args) {
        
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static void abrirAlta() throws Exception{
        Gestion alta = new Gestion(1);
        alta.setVisible(true);
    }
    
    public static void abrirConsultaIndividual() throws Exception{
        String telefono = JOptionPane.showInputDialog("Introduce el numero de telefono de la persona que deses consuñltar: ");
        Gestion cIndividual = new Gestion(2);
        TablaPersona datoPersona = new TablaPersona();
        personaActual = datoPersona.seleccionarUna(telefono);
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
}
