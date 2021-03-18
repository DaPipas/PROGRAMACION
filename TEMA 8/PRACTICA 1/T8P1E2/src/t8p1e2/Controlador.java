/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1e2;

import BD.tablaEvento;
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
            tests();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void tests() throws Exception{
        /*Comprobamos la conexion con la base de datos */
        BD.ControladorBD.conectar();
        BD.ControladorBD.desconectar();
        
        /*Comprobamos las ejecuciones en la base de datos EVENTO*/
        eventoActual = new Evento("Boda", "Bilbao", LocalDate.of(2031, 5, 2), LocalTime.of(20, 0), LocalTime.of(1, 0), 30);
        
        tablaEvento.insertEvento(eventoActual);
        
    }
}
