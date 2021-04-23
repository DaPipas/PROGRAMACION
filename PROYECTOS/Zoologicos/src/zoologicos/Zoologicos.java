
package zoologicos;

import GUI.Animal.*;
import GUI.*;
import UML.Animal;
import UML.Pais;
import UML.Zoo;

public class Zoologicos {
    private static Pais pais;
    private static Zoo zoo;
    private static Animal animal;

    public static void main(String[] args) {
        try{
            abrirInicio();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getClass() + " : " + e.getMessage());
        }
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
    public static void abrirInicio() throws Exception{
        vInicio vI = new vInicio();
        vI.setVisible(true);
    }
    public static void abrirAltaAnimal() throws Exception{
        vAltaAnimal vA = new vAltaAnimal();
        vA.setVisible(true);
    }
    
}
