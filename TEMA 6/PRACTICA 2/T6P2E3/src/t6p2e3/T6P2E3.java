
package t6p2e3;

import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T6P2E3 {
    static ArrayList<Empleado> listaTodosEmpleados = new ArrayList<Empleado>();
    static ArrayList<Directivo> listaDirectivos = new ArrayList<Directivo>();
    public static void main(String[] args) {
        try
        {
            inicializarDatos();
            
            System.out.println("listo");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " = " + e.getMessage());
        }
    }
    public static void inicializarDatos(){
        for(int x = 0; x < 10; x++)
        {
            listaTodosEmpleados.add(new Empleado());
        }
        
        listaDirectivos.add(new Directivo());
        listaDirectivos.get(0).setNombre("Pepe");
        for(int x = 0; x< 4; x++)
        {
        listaDirectivos.get(0).addEmpleado(listaTodosEmpleados.get(x));
        }
        
        
        listaDirectivos.add(new Directivo());
        listaDirectivos.get(1).setNombre("Juan");
        for(int x = 0; x< 3; x++)
        {
        listaDirectivos.get(1).addEmpleado(listaTodosEmpleados.get(x));
        }
        
        listaDirectivos.add(new Directivo());
        listaDirectivos.get(2).setNombre("Alberto");
        for(int x = 0; x< 3; x++)
        {
        listaDirectivos.get(2).addEmpleado(listaTodosEmpleados.get(x));
        }
        
    }
    public static String directivoMaxSubordinados(){
        Directivo d = new Directivo();
        int max = 0;
        
        for(int x = 0; x < listaDirectivos.size(); x++)
        {
            if(listaDirectivos.get(x).getListaEmpleados().size() > max)
            {
                max = listaDirectivos.get(x).getListaEmpleados().size();
                d = listaDirectivos.get(x);
            }
        }
        return d.getNombre();
    }
}
