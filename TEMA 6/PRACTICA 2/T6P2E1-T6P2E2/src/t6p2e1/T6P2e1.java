
package t6p2e1;
import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class T6P2e1 {
    static ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();
    static ArrayList<Estudio> listaEstudio = new ArrayList<Estudio>();
    
    public static void main(String[] args) {
        InicializarDatos();
        /*String resultado = "Estudio con la pelicula más larga\n";*/
        EstuidoMaxPeliculas();
        
        
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
        
        
        JOptionPane.showMessageDialog(null,"Listo");
    }
    public static void EstuidoMaxPeliculas(){
        int numPeli = 0;
        String NombrEst = "";
        for( int x = 0; x < listaEstudio.size(); x++)
        {
            
        }
    }
            
}
