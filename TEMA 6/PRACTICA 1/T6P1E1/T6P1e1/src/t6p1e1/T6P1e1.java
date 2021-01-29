
package t6p1e1;
import Clases.Circunferencia;
import javax.swing.JOptionPane;
public class T6P1e1 {
    
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(radio());
        
    }
    public static double radio() {
        boolean error = false;
        double radio = 0;
        do
        {
            try
            {
                radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circuferencia en metros"));
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Debes introducir un numero real");
            }
        }
        while (error == true);
        return radio;
    }
}
