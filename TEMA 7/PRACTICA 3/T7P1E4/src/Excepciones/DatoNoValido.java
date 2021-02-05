/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Luyan
 */
public class DatoNoValido extends Exception{
    
    private static String mensaje;
    public DatoNoValido(String mensaje){
        this.mensaje = mensaje;
    }

    public static String getMensaje() {
        return mensaje;
    }

    public static void setMensaje(String mensaje) {
        DatoNoValido.mensaje = mensaje;
    }
    
    
    
}
