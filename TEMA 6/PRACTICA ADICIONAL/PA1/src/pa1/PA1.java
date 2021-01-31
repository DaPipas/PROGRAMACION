
package pa1;

import Clases.*;
import java.time.LocalDate;

public class PA1 {

    public static void main(String[] args) {
        Avion a1 = new Avion("aaaa", "747", 300, "200");
        Piloto p1 = new Piloto("123", "barack", "obama", 22333);
        Asiento as1 = new Asiento(23, true, "22");
        Pasajero ps1 = new Pasajero("e14233", "Jimmy", "Hendrix", "m", 30);
        Ciudad c1 = new Ciudad("9998", "Ginebra");
        Vuelo v1 = new Vuelo(2322, "01:00", "03:30", "Mallorca", "Ginebra", LocalDate.parse("01-20-2010"), LocalDate.parse("01-20-2010"), "Media Distancia");
    }
    
}
