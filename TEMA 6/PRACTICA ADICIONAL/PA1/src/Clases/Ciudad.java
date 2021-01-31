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
public class Ciudad {
    private String codCiudad;
    private String nombre;
    
    private ArrayList<Vuelo> listaVuelo;

    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
        
        listaVuelo = new ArrayList();
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getListaVuelo() {
        return listaVuelo;
    }

    public void setListaVuelo(ArrayList<Vuelo> listaVuelo) {
        this.listaVuelo = listaVuelo;
    }
    
    public void agregarNuevo(){}
    
    public Ciudad obtener(){
        return this;
    }
    
}
