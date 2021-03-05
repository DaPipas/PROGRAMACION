
package ModeloUML;

import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList();
    }

    public Persona() {
        this.listaVehiculos = new ArrayList();
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    public void setVehiculo(Vehiculo v)
    {
        this.listaVehiculos.add(v);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
