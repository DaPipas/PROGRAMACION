/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1e2;

import javax.swing.JOptionPane;



/**
 *
 * @author 1gdaw05
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            tests();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void tests(){
        BD.ControladorBD.conectar();
        BD.ControladorBD.desconectar();
    }
}
