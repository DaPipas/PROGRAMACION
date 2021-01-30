
package t6p1e1;


import Clases.Circunferencia;
import javax.swing.JOptionPane;
import Excepciones.*;
import Vistas.*;

public class T6P1E1 {
    public static Calculadora C1;
    static Circunferencia circunferencia;
            
    public static void main(String[] args) {
        try
        {
           C1= new Calculadora();
           C1.setVisible(true);
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "#ERROR: " + e.getClass() + ": " + e.getMessage());
        }
    }
   
    public static void datoCirculo(double radio) throws Exception{
        circunferencia = new Circunferencia(radio);
    }
    
    public static String getArea() throws Exception{
        return String.valueOf(circunferencia.getArea());
    }
    
    public static String getLongitud() throws Exception{
        return String.valueOf(circunferencia.getLongitud());
    }
    
    public static String getVolumen() throws Exception{
        return String.valueOf(circunferencia.getVolumen());
    }
}
