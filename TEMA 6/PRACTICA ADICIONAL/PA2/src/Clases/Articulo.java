/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Luyan
 */
public class Articulo {
    private String nombre;
    private double precio;
    
    private Envio envio;
    private ArrayList<Vendedor> listaProveedores;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        
        listaProveedores = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public ArrayList<Vendedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Vendedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
    
    
    
}
