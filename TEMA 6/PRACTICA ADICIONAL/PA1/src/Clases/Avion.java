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
public class Avion {
    private String aerolinea;
    private String codAvion;
    private int nAsiento;
    private String compartimientos;
    
    private ArrayList<Vuelo> listaVuelos;

    public Avion(String aerolinea, String codAvion, int nAsiento, String compartimientos) {
        this.aerolinea = aerolinea;
        this.codAvion = codAvion;
        this.nAsiento = nAsiento;
        this.compartimientos = compartimientos;
        
        listaVuelos = new ArrayList();
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public String getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(String compartimientos) {
        this.compartimientos = compartimientos;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
    
    public void asignarVuelo(){}
    
    public Avion obtener(){
        return this;
    }
    public void cancelarVuelo(){}
}
