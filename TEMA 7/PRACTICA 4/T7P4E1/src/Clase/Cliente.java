/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Cliente {
    private String nombre;
    private String dni;
    private int clave;
    
    private ArrayList<Cuenta> listaCuentas;

    public Cliente(String nombre, String dni, int clave) {
        this.nombre = nombre;
        this.dni = dni;
        this.clave = clave;
        
        listaCuentas = new ArrayList();
    }
    
    public void addCuenta(Cuenta c){
        listaCuentas.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
    
    
}
