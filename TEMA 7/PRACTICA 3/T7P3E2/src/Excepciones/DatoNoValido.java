/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author 1gdaw05
 */
public class DatoNoValido extends Exception{
    private static String txt;
    
    public DatoNoValido(String error){
        this.txt = error;
    }
    
    public static String getTxt(){
        return txt;
    }
}
