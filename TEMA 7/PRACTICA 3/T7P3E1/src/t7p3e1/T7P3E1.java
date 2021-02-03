/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p3e1;

import Clases.Cliente;
import Clases.Producto;
import Clases.Proveedor;
import Vista.Almacen;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T7P3E1 {

    private static ArrayList<Producto> listaProductos;
    private static ArrayList<Proveedor> listaProveedores;
    private static ArrayList<Cliente> listaClientes;
    
    private final float DTOV = 0.8f;
    private final float DTOPPP = 0.9f;
    
    public static void main(String[] args) {
        try
        {
            abrirAlmacen();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR: " +  e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void abrirAlmacen() throws Exception{
        Almacen a1 = new Almacen();
        a1.setVisible(true);
    }
    
    public static boolean comprobarNombreProducto(String producto) throws Exception{
        int x;
        for(x = 0; x<listaProductos.size()||producto == listaProductos.get(x).getNombre(); x++){}
        if(x < listaProductos.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void llenarCbProveedores(javax.swing.JComboBox cbProveedores){
        for()
    }
}
