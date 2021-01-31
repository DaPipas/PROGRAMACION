/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Luyan
 */
public class Envio {
    private LocalDate fchEnvio;
    private String direccionEnvio;
    
    private Comprador cliente;
    private ArrayList<Articulo> listaArticulos;
    private Vendedor proveedor;
    private Pago pago;

    public Envio(LocalDate fchEnvio, String direccionEnvio) {
        this.fchEnvio = fchEnvio;
        this.direccionEnvio = direccionEnvio;
        
        listaArticulos = new ArrayList();
    }

    public LocalDate getFchEnvio() {
        return fchEnvio;
    }

    public void setFchEnvio(LocalDate fchEnvio) {
        this.fchEnvio = fchEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Comprador getCliente() {
        return cliente;
    }

    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public Vendedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Vendedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    
}
