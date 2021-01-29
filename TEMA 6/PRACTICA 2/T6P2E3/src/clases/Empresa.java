
package clases;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        new ArrayList<Cliente>();
        new ArrayList<Empleado>();
    }

    public Empresa(String nombre, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        new ArrayList<Cliente>();
        new ArrayList<Empleado>();
    }
    
    public void addCliente(Cliente e){
        listaClientes.add(e);
    }
    
    public void addEmpleado(Empleado e){
        listaEmpleados.add(e);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        return super.toString() + "nombre=" + nombre + ", listaClientes=" + listaClientes + ", listaEmpleados=" + listaEmpleados;
    }
    
    
    
}
