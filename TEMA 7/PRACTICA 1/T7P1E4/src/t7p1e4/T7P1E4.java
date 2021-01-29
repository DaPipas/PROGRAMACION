
package t7p1e4;

import Modelo.Fruta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vista.*;

public class T7P1E4 {
    static ArrayList<Fruta> almacen;
    public static void main(String[] args) {
        almacen = new ArrayList();
        try
        {
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    public static void Comprar() throws Exception{
        Compra compra = new Compra();
        compra.setVisible(true);
    }
    
    public static void Venta() throws Exception{
        Venta venta = new Venta();
        venta.setVisible(true);
    }
    
    public static void Salir() throws Exception{
        System.exit(0);
    }
    
    public static boolean ComprobarProducto(String producto) throws Exception{
        int x;
        boolean existe;
        for(x = 0; x < almacen.size() || producto.equalsIgnoreCase(almacen.get(x).getNombre()); x++)
        {
            if(producto.equalsIgnoreCase(almacen.get(x).getNombre()))
                break;
        }
        if(producto.equalsIgnoreCase(almacen.get(x).getNombre()))
            existe = true;
        else
            existe = false;
        return existe;
    }
    public static void anadirProducto() throws Exception{
    
    }
    public static void anadirExistencia() throws Exception{
        
    }
}
