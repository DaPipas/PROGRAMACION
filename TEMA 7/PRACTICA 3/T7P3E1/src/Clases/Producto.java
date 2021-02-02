/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Producto {
    private String nombre;
    private double precio;
    private int unidades;
    
    private ArrayList<Proveedor> listaProveedores;

    public Producto(String nombre, double precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
        
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    public void addProveedor(Proveedor p){
        listaProveedores.add(p);
    }
}
