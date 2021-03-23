/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p2e1;

import GUI.ErrorGenerico;

/**
 *
 * @author 1gdaw05
 */
public class T8P2E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        
        }
        catch(Exception e)
        {
            abrirError(e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static void abrirError(String mensaje){
        ErrorGenerico e = new ErrorGenerico(mensaje);
        e.setVisible(true);
    }
    
}
