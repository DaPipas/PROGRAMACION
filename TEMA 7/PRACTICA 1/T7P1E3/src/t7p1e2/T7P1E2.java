

package t7p1e2;

import Clases.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class T7P1E2 {
    public static Alta alta;
    public static Listado lista;
    public static ArrayList<Persona> listaPersonas;
    
    public static void main(String[] args) {
        try
        {
            listaPersonas = new ArrayList();
            alta = new Alta();
            alta.setVisible(true);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void datosPersona(String nombre, String apellidos, String dni){
        Persona p1;
        p1 = new Persona(nombre, apellidos, dni);
        listaPersonas.add(p1);
    }
    
}
