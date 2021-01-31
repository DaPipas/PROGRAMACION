/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa2;

import Clases.*;
import java.time.LocalDate;

/**
 *
 * @author Luyan
 */
public class PA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comprador c1 = new Comprador("Rayo", "Mcqueen", "narnia");
        Envio e1 = new Envio(LocalDate.parse("01-01-2010"), "narnia");
        Articulo a1 = new Articulo("teclado", 99.99);
        Vendedor v1 = new Vendedor("batman", "bruce");
        Pago p1 = new Pago(LocalDate.parse("01-01-2010"), 99.99, "narnia");
    }
    
}
