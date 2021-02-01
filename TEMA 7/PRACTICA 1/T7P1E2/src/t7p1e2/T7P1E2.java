/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1e2;

import Clases.Persona;
import Vista.Alta;
import Vista.Lista;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luyan
 */
public class T7P1E2 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Persona> listaPersonas;
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            listaPersonas = new ArrayList();
            abrirAlta();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void abrirAlta() throws Exception{
        Alta a1 = new Alta();
        a1.setVisible(true);
    }
    
    public static void getDatos(String nombre, String apellidos, String dni) throws Exception{
        Persona p1 = new Persona(nombre, apellidos, dni);
        listaPersonas.add(p1);
    }
    
    public static boolean llena(){
        if(listaPersonas.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void abrirLista(){
        Lista l1 = new Lista();
        l1.setVisible(true);
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static String datosLista(){
        String datos = "";
        for(int x = 0; x< listaPersonas.size(); x++)
        {
            datos += listaPersonas.get(x).toString();
        }
        return datos;
    }
}
