
package t6p1e3;

import Vista.BuscarCiudad;
import Vista.Menu;
import clases.*;
import javax.swing.JOptionPane;
import excepciones.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class T6P1e3 {

    private static ArrayList <Persona> listaPersonas;
    
    public static void main(String[] args) {
        try
        {
            listaPersonas = new ArrayList<Persona>();
            insertarPersonas();
            abrirMenu();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    public static void insertarPersonas() throws Exception{
        listaPersonas.add(new Persona("pepe", LocalDate.of(1, 5, 1954),"calle", "123456", "narnia"));
        listaPersonas.add(new Persona("chenchu", LocalDate.of(1, 5, 1976),"rio", "112233", "narnia"));
        listaPersonas.add(new Persona("juan palomo", LocalDate.of(1, 5, 1975),"puente", "554433", "aceitunilla"));
        listaPersonas.add(new Persona("marcelino pan y vino", LocalDate.of(1, 5, 2009),"yeka", "123321", "el torno"));
    }
  
    public static void abrirMenu() throws Exception{
       Menu m = new Menu();
       m.setVisible(true);
    }
    public static String masViejo() throws Exception{
        int x;
        String nombre = "";
        int anioViejo = 99999;
        int anioComparar;
        for(x = 0; x < listaPersonas.size(); x++)
        {
            anioComparar = listaPersonas.get(x).getFchNacimiento().getYear();
            if(anioComparar < anioViejo)
            {
                anioViejo = anioComparar;
                nombre = listaPersonas.get(x).getNombre();
            }
        }
        return nombre;
    }
    public static String datosLocalidad(String ciudad) throws Exception{
        String datos = "";
        for(int x = 0; x < listaPersonas.size(); x++)
        {
            if(listaPersonas.get(x).getCiudad().equalsIgnoreCase(ciudad))
            {
                datos += listaPersonas.get(x).toString() + "\n";
            }
        }
        return datos;
    }
    public static void abrirBuscarCiudad(String datos, String ciudad) throws Exception{
        BuscarCiudad busqueda = new BuscarCiudad(datos, ciudad);
        busqueda.setVisible(true);
    }
    public static String datosMayores() throws Exception{
        String datos = "";
        for(int x = 0; x < listaPersonas.size(); x++)
        {
            LocalDate hoy = LocalDate.now();
            int anio = hoy.getYear();
            if(anio - listaPersonas.get(x).getFchNacimiento().getYear() > 18)
            {
                datos += listaPersonas.get(x).getNombre();
            }
        }
        return datos;
    }
    public static void abrirMayoresEdad(String datos) throws Exception{
        MayoresEdad me = new MayoresEdad(datos);
        me.setVisible(true);
    }
    public static void finalizar() throws Exception{
        System.exit(0);
    }
}
