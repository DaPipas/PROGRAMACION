
package t6p1e3;

import clases.*;
import javax.swing.JOptionPane;
import excepciones.*;
import java.util.ArrayList;

public class T6P1e3 {

    ArrayList <Persona> listaPersonas = new ArrayList <Persona>();
    
    public static void main(String[] args) {
        try
        {
            insertarPersonas();
            menu();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    public static void insertarPersonas() throws Exception{
        int continuar = 0;
        do
        {
        insertarDatos();
        continuar = JOptionPane.showConfirmDialog(null, "Deseas anadir más personas?", "Añadir más Personas", JOptionPane.YES_NO_OPTION);
        }
        while(continuar == 0);
    }
    public static void insertarDatos() throws Exception{
        int continuar = 0;
        do
        {
            listaPersonas.add(--constructor)
        }
        while(continuar == 0);
    }
    public static void menu() throws Exception{
        boolean fin = false;
        do
        {
            int n1 = 0;
            while(n1 != 4)
            {
                n1 = datoMenu(n1);
                optMenu(n1);
            }
        }
        while(fin == false);
    }
    public static int datoMenu(int n1) throws Exception{
        try
        {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n\n"
                                                              + "1- Persona de mayor edad\n"
                                                              + "2- Personas que viven en Elche\n"
                                                              + "3- Personas mayores de edad\n"
                                                              + "4- Cerrar"));
            if(n1 < 1 && n1 >4)
            {
                throw new NumeroNoValido();
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir un caracter de tipo numerico");
        }
        catch(NumeroNoValido e)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir una opcion (1-4)");
        }
        return n1;
    }
    public static void optMenu(int n1) throws Exception{
        switch(n1){
            case 1:
            {
                personaMayor();
                break;
            }
            case 2:
            {
                deElche();
                break;
            }
            case 3:
            {
                mayoresEdad();
                break;
            }
            default:
                break;
        }
    }
}
