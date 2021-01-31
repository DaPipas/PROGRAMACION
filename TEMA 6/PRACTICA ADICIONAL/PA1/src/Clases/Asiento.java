/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Luyan
 */
public class Asiento {
    private int nAsiento;
    private boolean estado;
    private String compartimiento;
    
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Asiento(int nAsiento, boolean estado, String compartimiento) {
        this.nAsiento = nAsiento;
        this.estado = estado;
        this.compartimiento = compartimiento;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    
    public int nAsiento(){
        return 8;
    }
}
