
package t6p1e1;


import Clases.Circunferencia;
import javax.swing.JOptionPane;
import Excepciones.*;
import Vistas.*;

public class T6P1E1 {
    public static Calculadora C1;
    
    public static void main(String[] args) {
        try
        {
           C1= new Calculadora();
           C1.setVisible(true);
           double radio = Calculadora.get;
           Circunferencia c1 = new Circunferencia(radio);
           resultado(c1);
           Calculadora
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + ": " + e.getMessage());
        }
    }
    
    public static double datoRadio(double radio){
        return radio;
    }
    public static void resultado(Circunferencia c) throws Exception{
        JOptionPane.showMessageDialog(null, "Longitud: " + c.getLongitud() + "\n" +
                                            "Area: " + c.getArea() + "\n" +
                                            "Volumen: " + c.getVolumen());
    }
}
