/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p3e1;

import Vista.Almacen;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class T7P3E1 {

    private static ArrayList listaProductos;
    private static ArrayList listaProveedores;
    private static ArrayList listaClientes;
    
    private final float DTOV = 0.8f;
    private final float DTOPPP = 0.9f;
    
    public static void main(String[] args) {
        try
        {
            abrirAlmacen();
        }
        catch(Exception e)
        {
            
        }
    }
    
    public static void abrirAlmacen() throws Exception{
        Almacen a1 = new Almacen();
        a1.setVisible(true);
    }
}
