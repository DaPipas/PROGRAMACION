package Main;


import Clases.Producto;
import Excepciones.DatoNoValido;
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
    private static Producto productoActual;
    
    public static void main(String[] args) {
        listaProductos = new ArrayList();
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
    
    public static void transferirDatos(String nombre, String unidades, String precio) throws Exception{
        int u = Integer.parseInt(unidades);
        double p = Double.parseDouble(precio);
        if(comprobarProducto(nombre))
        {
            actualizarCompraProducto(u, p);
        }
        else
        {
            nuevoProducto(nombre, u, p);
        }
    }
    
    public static boolean comprobarProducto(String nombre) throws Exception{
        int x;
        for (x = 0; x < listaProductos.size()||nombre.equals(listaProductos.get(x).getNombre()); x++){}
        if(x > listaProductos.size())
        {
            return false;
        }
        else
        {
            productoActual = listaProductos.get(x);
            return true;
        }
    }
    
    public static void actualizarCompraProducto(int unidades, double precio) throws Exception{
        productoActual.setUnidades(productoActual.getUnidades() + unidades);
        productoActual.setPrecio(precio);
    }
    
    public static void nuevoProducto(String nombre, int u, double p) throws Exception{
        listaProductos.add(new Producto(nombre, u, p));
    }
    
    public static boolean comprobarUnidadesProducto(String unidades) throws Exception{
        int u = Integer.parseInt(unidades);
        if(productoActual.getUnidades() > 0)
        {
            if(u <= productoActual.getUnidades())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            throw new DatoNoValido("Stock no disponible.");
        }
    }
    
    public static String datoImporte() throws Exception{
        return String.valueOf(productoActual.getPrecio() * 2);
    } 
    
    public static void actualizarUnidadesProducto(String unidades) throws Exception{
        int u = Integer.parseInt(unidades);
        productoActual.setUnidades(productoActual.getUnidades() - u);
    }
}
