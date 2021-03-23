/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1e2;

import BD.tablaEvento;
import GUI.Alta;
import GUI.Cancelar;
import GUI.Confirmacion;
import GUI.Listado;
import GUI.Modificar;
import GUI.menuPrincipal;
import UML.Evento;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import javax.swing.JOptionPane;



/**
 *
 * @author 1gdaw05
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static Evento eventoActual;
    
    public static void main(String[] args) {
        try{
            abrirMenuPrincipal();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void abrirMenuPrincipal() throws Exception{
        menuPrincipal m = new menuPrincipal();
        m.setVisible(true);
    }
    
    public static void abrirAlta() throws Exception{
        Alta a = new Alta();
        a.setVisible(true);
    }
    
    public static void abrirCancelar() throws Exception{
        Cancelar c = new Cancelar();
        c.setVisible(true);
    }
    
    public static void abrirModificar() throws Exception{
        Modificar m = new Modificar();
        m.setVisible(true);
    }
    
    public static void abrirConfirmacion() throws Exception{
        Confirmacion c = new Confirmacion();
        c.setVisible(true);
    }
    
    public static void abrirListado() throws Exception{
        Listado l = new Listado();
        l.setVisible(true);
    }
    
    
    /*
    public static void tests() throws Exception{
        //Comprobamos la conexion con la base de datos
        BD.ControladorBD.conectar();
        BD.ControladorBD.desconectar();
        
        //Comprobamos las ejecuciones en la base de datos EVENTO
        eventoActual = new Evento("Boda", "Vitoria", LocalDate.of(2031, 5, 2), LocalTime.of(20, 0), LocalTime.of(1, 0), 30);
        
        tablaEvento.insertEvento(eventoActual);
        tablaEvento.validarEvento(eventoActual);
        tablaEvento.updateEvento(eventoActual);
        tablaEvento.deleteEvento(eventoActual);
    }
    */
}
