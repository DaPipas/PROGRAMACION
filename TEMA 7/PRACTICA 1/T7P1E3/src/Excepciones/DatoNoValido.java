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

    private static String txt;
    public DatoNoValido(String txt){
        this.txt = txt;
    }
    
    public static String getText(){
        return txt;
    }
    
    public void setText(String s){
        this.txt = s;
    }
}
