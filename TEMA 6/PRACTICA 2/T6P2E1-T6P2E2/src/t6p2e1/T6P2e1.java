
package t6p2e1;
import Clases.*;
import Vista.Ficha;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T6P2e1 {
    static ArrayList<Pelicula> listaPelicula;
    static ArrayList<Estudio> listaEstudio;
    
    public static void main(String[] args) {
        try
        {
            listaPelicula = new ArrayList<Pelicula>();
            listaEstudio = new ArrayList<Estudio>();
            InicializarDatos();
            abrirFicha(getDatos());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + " " + e.getMessage());
        }
        
    }
    public static void InicializarDatos(){
      
        listaEstudio.add(new Estudio());
        listaEstudio.add(new Estudio());
        
        listaEstudio.get(0).setNombre("Pepito Production");
        listaEstudio.get(1).setNombre("Dreamwords");
        
        listaPelicula.add(new Pelicula((float)1.5, "terror", listaEstudio.get(0)));
        listaPelicula.add(new Pelicula((float)5.5, "terror", listaEstudio.get(0)));
        listaPelicula.add(new Pelicula((float)4.5, "terror", listaEstudio.get(0)));
        listaPelicula.add(new Pelicula((float)3.5, "terror", listaEstudio.get(1)));
        listaPelicula.add(new Pelicula((float)2.5, "terror", listaEstudio.get(1)));
        
        listaPelicula.get(1).addEstudio(listaEstudio.get(1));
        
        listaEstudio.get(0).setPeliculas(listaPelicula.get(0));
        listaEstudio.get(0).setPeliculas(listaPelicula.get(1));
        listaEstudio.get(0).setPeliculas(listaPelicula.get(2));
        listaEstudio.get(1).setPeliculas(listaPelicula.get(3));
        listaEstudio.get(1).setPeliculas(listaPelicula.get(4));
    }
    public static String getDatos() throws Exception{
        String datos = "";
        datos += peliculaMasLarga();
        datos += masPeliculas();
        return datos;
    }
    public static String peliculaMasLarga() throws Exception{
        Pelicula peliActual =  listaPelicula.get(1);
        Pelicula peliDuracionMax = listaPelicula.get(0);
        String dato = "--Estudios de la pelicula mas larga\n";
        for(int x = 1;x < listaPelicula.size(); x++)
        {
            if(peliActual.getDuracion() > peliDuracionMax.getDuracion())
            {
                peliDuracionMax = peliActual;
            }
        }
        for(int x = 0; x < peliActual.getEstudios().size(); x++)
        {
            dato += peliActual.getEstudios().get(x).getNombre() + "\n";
        }
        dato += "\n";
        return dato;
    }
    public static String masPeliculas() throws Exception{
        String dato = "--Estudio con mas peliculas\n";
        Estudio masPeliculas = listaEstudio.get(0);
        Estudio actual = listaEstudio.get(1);
        for(int x = 0; x < listaEstudio.size(); x++)
        {
            if(actual.getPeliculas().size() > masPeliculas.getPeliculas().size())
            {
                masPeliculas = actual;
            }
        }
        dato += masPeliculas.getNombre();
        return dato;
    }
    public static void abrirFicha(String datos) throws Exception{
        Ficha f1 = new Ficha(datos);
        f1.setVisible(true);
    }
    public static void finalizar() throws Exception{
        System.exit(0);
    }        
}
