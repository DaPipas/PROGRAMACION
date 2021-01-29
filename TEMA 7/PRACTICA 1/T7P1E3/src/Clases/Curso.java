
package Clases;

import java.util.ArrayList;

public class Curso {
    private String clase;
    private ArrayList<Persona> listaPersonas;

    public Curso(String clase) {
        this.clase = clase;
        listaPersonas = new ArrayList();
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return clase;
    }
    
    
}
