
package UML;

import java.util.ArrayList;

public class Pais {
    private int id_pais;
    private String nombre;
    private int continente;
    
    private ArrayList<Zoo> listaZoo;

    public Pais() {
    }

    public Pais(int id_pais, String nombre, int continente, ArrayList<Zoo> listaZoo) {
        this.id_pais = id_pais;
        this.nombre = nombre;
        this.continente = continente;
        this.listaZoo = listaZoo;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContinente() {
        return continente;
    }

    public void setContinente(int continente) {
        this.continente = continente;
    }

    public ArrayList<Zoo> getListaZoo() {
        return listaZoo;
    }

    public void setListaZoo(ArrayList<Zoo> listaZoo) {
        this.listaZoo = listaZoo;
    }
    
    public void addListaZoo(Zoo zoo){
        listaZoo.add(zoo);
    }

    @Override
    public String toString() {
        return "Pais{" + "id_pais=" + id_pais + ", nombre=" + nombre + ", continente=" + continente + ", listaZoo=" + listaZoo + "}";
    }
    
    
}
