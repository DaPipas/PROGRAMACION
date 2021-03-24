/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    private ArrayList<Caso> listaCasos;

    public Cliente() {
        listaCasos = new ArrayList();
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addCaso(Caso c){
        listaCasos.add(c);
    }
    
    public void rmCaso(Caso c){
        listaCasos.remove(c);
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }
    
    
}
