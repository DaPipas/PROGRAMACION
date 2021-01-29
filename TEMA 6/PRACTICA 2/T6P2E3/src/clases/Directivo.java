
package clases;

import java.util.ArrayList;

public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado> listaEmpleados;

    public Directivo() {
        new ArrayList<Empleado>();
    }

    public Directivo(String categoria) {
        this.categoria = categoria;
        new ArrayList<Empleado>();
    }

    public Directivo(String categoria, double sueldo) {
        super(sueldo);
        this.categoria = categoria;
        new ArrayList<Empleado>();
    }

    public Directivo(String categoria, double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.categoria = categoria;
        new ArrayList<Empleado>();
    }
    

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleados) {
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleados, double sueldo) {
        super(sueldo);
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleados, double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }
    
    public void addEmpleado(Empleado e){
        listaEmpleados.add(e);
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        return super.toString() + "categoria=" + categoria + ", listaEmpleados=" + listaEmpleados;
    }
    
    
    
    
    
}
