
package UML;

import java.util.ArrayList;

public class Zoo {
    private int id_zoo;
    private String nombre;
    private String localizacion;
    private int extencion;  //km^2
    private int capacidad;
    private String telefono;
    private String nom_dir;
    
    private Pais pais;
    private ArrayList<Animal> listaAnimales;

    public Zoo() {
    }

    public Zoo(int id_zoo, String nombre, String localizacion, int extencion, int capacidad, String telefono, String nom_dir, Pais pais) {
        this.id_zoo = id_zoo;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.extencion = extencion;
        this.capacidad = capacidad;
        this.telefono = telefono;
        this.nom_dir = nom_dir;
        this.pais = pais;
    }

    public int getId_zoo() {
        return id_zoo;
    }

    public void setId_zoo(int id_zoo) {
        this.id_zoo = id_zoo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getExtencion() {
        return extencion;
    }

    public void setExtencion(int extencion) {
        this.extencion = extencion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNom_dir() {
        return nom_dir;
    }

    public void setNom_dir(String nom_dir) {
        this.nom_dir = nom_dir;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    
    public void addListaAnimales(Animal animal){
        listaAnimales.add(animal);
    }
    
    @Override
    public String toString() {
        return "Zoo{" + "id_zoo=" + id_zoo + ", nombre=" + nombre + ", localizacion=" + localizacion + ", extencion=" + extencion + ", capacidad=" + capacidad + ", telefono=" + telefono + ", nom_dir=" + nom_dir + ", pais=" + pais + "}";
    }
    
}
