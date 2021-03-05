
package ejemplobd;

import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Controlador {

    private static BaseDatos bd;
    private static TablaPersonas tp;
    private static TablaVehiculos tv;
    
    private static VentanaPrincipal vp;
    private static VentanaPersona vper;
    private static DVehiculos dv;
    
    private static Persona p;
    private static Vehiculo v;
    
    public static void main(String[] args) {
        
        try
        {
                // Abrir la conexion con una base de datos
                bd = new BaseDatos();
                bd.conectar();

                tp=new TablaPersonas(bd.getCon());
                tv = new TablaVehiculos(bd.getCon(),tp);
                tp.setTablaVehiculos(tv);

                vp = new VentanaPrincipal();
                vp.setVisible(true);
                
        }
        catch(Exception e)
        {
            bd.desconectar();
            System.out.println(e.getMessage());
        }
    }
    
    public static void mostrarVentanaPersonas()
    {
        vp.setVisible(false);
        vper = new VentanaPersona();
        vper.setVisible(true);
    }
    
    public static String tenDni(String dni) throws Exception{
       p = tp.seleccionarUna(dni);
       if (p == null)
           // No hay persona con ese dni
           return null;
       else
           return p.getNombre();
    }
    
    public static void insertarPersona(String dni,String nombre) throws Exception
    {
           // Insertar una persona
                p = new Persona(dni,nombre);
                tp.insertar(p);
    }
    
    public static void bajaPersona() throws Exception
    {
        tp.borrar(p);
    }
    
    public static void modificarPersona(String nombre) throws Exception
    {
        p.setNombre(nombre);
        tp.actualizar(p);
    }
    
    public static String datosVehiculosPorPersona() throws Exception
    {
        String datos="";
        ArrayList<Vehiculo> lista = tv.seleccionarPorDni(p);
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        return datos;
    }
    
    public static void salir(JFrame v)
    {
        v.dispose();
        vp.setVisible(true);
    }
    
    public static void mostrarAMVehiculoPersona(String operacion)
    {
        dv=new DVehiculos(vper,true,p.getDni(),operacion);
        dv.setVisible(true);
    }
    
    public static void altaVehiculoPersona(String matricula,String modelo) throws Exception
    {
        v = new Vehiculo(matricula,modelo,p);
        p.setVehiculo(v);
        
        tv.insertar(v);
    }
    
     public static void bajaVehiculoPersona(String matricula) throws Exception
    {
       p.setListaVehiculos( tv.seleccionarPorDni(p));
       int x;
       for(x = 0;x< p.getListaVehiculos().size() &&  ! p.getListaVehiculos().get(x).getMatricula().equals(matricula); x++){}
       if (x == p.getListaVehiculos().size())
           throw new Exception("La persona no tiene ese vehículo");
       else
           p.getListaVehiculos().remove(x);
        
        tv.borrar(matricula);
    }
    
    public static void cerrarVentana(JDialog v){
        v.dispose();
    }
    
    public static void llenarComboDni(JComboBox cb) throws Exception
    {
        ArrayList<Persona> lista = tp.seleccionarTodo();
        for(int x = 0; x < lista.size(); x++)
            cb.addItem(lista.get(x).getDni());
    }
    
    public static void modificarVehiculoPersona(String matricula,String modelo,String dni) throws Exception
    {
        // Busco el objeto vehiculo dentro de persona.
       p.setListaVehiculos( tv.seleccionarPorDni(p));
       int x;
       for(x = 0;x< p.getListaVehiculos().size() &&  ! p.getListaVehiculos().get(x).getMatricula().equals(matricula); x++){}
       if (x == p.getListaVehiculos().size())
           throw new Exception("La persona no tiene ese vehículo");
       else
       {
           v = p.getListaVehiculos().get(x);
           v.setModelo(modelo);
           // ¿ Ha cambiado de propietario? Si es así, hay que quitarlo de este objeto persona y ponerlo en el nuevo.
           if (!v.getP().getDni().equals(dni))
           {
               // busco la nueva persona
               Persona pNueva = tp.seleccionarUna(dni);
               pNueva.setListaVehiculos( tv.seleccionarPorDni(pNueva));
               pNueva.getListaVehiculos().add(v);
               v.setP(pNueva);
               
               p.getListaVehiculos().remove(v);
               
           }
           
       }
        
        tv.actualizar(v);
        
    }
            
}
