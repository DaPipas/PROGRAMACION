package Main;


import Clases.Producto;
import Vista.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Producto> listaProductos;
    
    public static void main(String[] args) {
        try
        {
            abrirInicio();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void abrirInicio() throws Exception{
        Inicio init = new Inicio();
        init.setVisible(true);
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
}
