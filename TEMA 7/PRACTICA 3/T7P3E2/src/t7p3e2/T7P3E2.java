/**
 * 
 */
package t7p3e2;

import Clases.Cliente;
import Clases.Producto;
import Clases.Proveedor;
import Vista.Almacen;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Vamos a implementar un proyecto para contabilizar las compras y ventas de los productos en un
 * alamacén.
 * 
 * @serial t7p3e2
 * 
 * @author Luis H. Alves
 * @version v2 23/03/2021 10:20
 * 
 * @see Cliente
 * @see Producto
 * @see Proveedor
 * 
 */
public class T7P3E2 {

    private static ArrayList<Producto> listaProductos;
    private static ArrayList<Proveedor> listaProveedores;
    private static ArrayList<Cliente> listaClientes;
    private static Producto productoActual;
    private static Cliente clienteActual;
    
    private final float DTOV = 0.8f;
    private final float DTOPPP = 0.9f;
    
    public static void main(String[] args) {
        try
        {
            boolean salir = false;
            do
            {
                abrirAlmacen();
            }
            while(salir == false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR: " +  e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void iniciarDatosPrueba() throws Exception{
        listaProveedores.add(new Proveedor("Marta"));
        listaProveedores.add(new Proveedor("Pepe"));
        listaProveedores.add(new Proveedor("Batman"));
        listaProveedores.add(new Proveedor("Gino"));
        listaProveedores.add(new Proveedor("Nahia"));
        listaProveedores.add(new Proveedor("Iker"));
        listaProveedores.add(new Proveedor("Raquel"));
        listaProveedores.add(new Proveedor("Iniesta"));

        listaProductos.add(new Producto("Pera", 2.5, 20));
        listaProductos.add(new Producto("Naranjas Chinas", 1.5, 30));
        listaProductos.add(new Producto("Chirimoyas", 4.2, 42));
        listaProductos.add(new Producto("Pepinos", 1, 20));
        listaProductos.add(new Producto("Albaricoques", 1.59, 32));
                
        for(int t = 0; t < listaProductos.size(); t++)
        {
            for(int y = 0; y < listaProveedores.size(); y++)
            {
                listaProductos.get(t).addProveedor(listaProveedores.get(y));
            }
        }
    }
    
    public static void abrirAlmacen() throws Exception{
        Almacen a1 = new Almacen();
        a1.setVisible(true);
    }
    
    /**
     * Trata de comprobar si tenemos un producto en el almacén
     * @param producto - String
     * @return boolean
     * @throws Exception 
     */
    public static boolean comprobarNombreProducto(String producto) throws Exception{
        int x;
        for(x = 0; x<listaProductos.size()||producto == listaProductos.get(x).getNombre(); x++){}
        productoActual = listaProductos.get(x);
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
        int x;
        for(x = 0; x < productoActual.getListaProveedores().size(); x++)
        {
            cbProveedores.insertItemAt(productoActual.getNombre(), x);
        }
    }
    
    public static void actualizarCompraProducto(double precio, int unidades) {
        productoActual.setPrecio(precio);
        productoActual.setUnidades(productoActual.getUnidades() + unidades);
    }
    
    public static double precioVenta() {
        return productoActual.getPrecio()*2;
    }
    
    public static int unidadesProducto(){
        return productoActual.getUnidades();
    }
    
    public static void encontrarCliente(String nombre){
        int x;
        for(x = 0; x<listaClientes.size()||nombre.equalsIgnoreCase(listaClientes.get(x).getNombre()); x++){}
        if(x > listaClientes.size())
        {
            listaClientes.add(new Cliente(nombre));
        }
        else
        {
            clienteActual = listaClientes.get(x);
        }
    }
    
    public static void actualizarVentaProducto(int unidades){
        productoActual.setUnidades(productoActual.getUnidades() - unidades );
    }
    
    public static void finalizar(){
    System.exit(0);
    }
}
