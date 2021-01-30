
package t6p1e2;

import Clases.Alumno;
import Vista.FichaAlumno;
import Vista.Formulario;
import Vista.IntroducirCodigo;
import Vista.Menu;
import Vista.TipoError;
import java.util.ArrayList;
import javax.swing.JDialog;

public class T6P1E2 {
    static ArrayList<Alumno> listaAlumnos;
    
    public static void main(String[] args) {
        try
        {
            listaAlumnos = new ArrayList();
            abrirMenu();
            
        }
        catch(Exception e)
        {
            JDialog error = new TipoError(null, true);
            error.setVisible(true);
        }  
    }
    public static void finalizar() throws Exception{
        System.exit(0);
    }
    public static void datosAlumno(String codigo, String nombre, String domicilio, String telefono) throws Exception{
        Alumno al = new Alumno(codigo, nombre, domicilio, telefono);
        listaAlumnos.add(al);
    }
    public static void abrirMenu() throws Exception{
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    public static void abrirFormulario() throws Exception{
        Formulario f1 = new Formulario();
        f1.setVisible(true);
    }
    public static void abrirIntroducirCodigo() throws Exception{
        IntroducirCodigo p1 = new IntroducirCodigo();
        p1.setVisible(true);
    }
    public static boolean validarCodigo(String codigo) throws Exception{
        int x;
        for(x = 0; x < listaAlumnos.size()|| !listaAlumnos.get(x).getCodigo().equals(codigo); x++){}
        if(x < listaAlumnos.size())
            return true;
        else
            return false;
    }
    public static void abrirFichaAlumno() throws Exception{
        FichaAlumno f1 = new FichaAlumno();
        f1.setVisible(true);
    }
}
