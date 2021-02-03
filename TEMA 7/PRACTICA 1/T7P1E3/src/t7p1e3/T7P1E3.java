

package t7p1e3;

import Clases.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class T7P1E3 {
    public static Alta alta;
    public static ArrayList<Persona> listaPersonas;
    public static Persona individuo;
    private static boolean editar;
    private static boolean nuevo;
    private static boolean eliminar;
    
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
    
    public static void datosPersona(String nombre, String apellidos, String dni, String curso){
        Persona p1 = new Persona(nombre, apellidos, dni, curso);
        listaPersonas.add(p1);
    }
    
    public static boolean comprobarDni(String dni) throws Exception{
        int x ;
        for(x = 0; x< listaPersonas.size()||listaPersonas.get(x).getDni().equals(dni); x++){}
        if(x < listaPersonas.size())
        {
            individuo = listaPersonas.get(x);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static String datoCurso() throws Exception{
        return individuo.getCurso();
    }
    
    public static String datoNombre() throws Exception{
        return individuo.getNombre();
    }
    
    public static String datoApellidos() throws Exception{
        return individuo.getApellido();
    }
    
    public static void editar(boolean op){
        editar = op;
    }
    
    public static boolean getEditar(){
        return editar;
    }
    
    public static void nuevo(boolean op){
        nuevo = op;
    }
    
    public static boolean getNuevo(){
        return nuevo;
    }
    
    public static void actualizarDatos(String nombre, String apellidos, String curso){
        individuo.setNombre(nombre);
        individuo.setApellido(apellidos);
        individuo.setCurso(curso);
    }
    
    public static void eliminarPersona(){
        listaPersonas.remove(individuo);
    }
    
    public static void eliminarMode(boolean op){
        eliminar = op;
    }
    
    public static boolean getEliminar(){
        return eliminar;
    }
    
}
