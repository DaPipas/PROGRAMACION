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
public class Vuelo {
    private int nVuelo;
    private String hSalida;
    private String hLlega;
    private String lOrigen;
    private String lDestino;
    private LocalDate fchSalida;
    private LocalDate fchRegreso;
    private String tipoVuelo;
    
    private Avion avion;
    private Piloto piloto;
    private ArrayList<Asiento> listaAsientos;
    private Pasajero Pasajero;
    private Ciudad ciudad;
    

    public Vuelo(int nVuelo, String hSalida, String hLlega, String lOrigen, String lDestino, LocalDate fchSalida, LocalDate fchRegreso, String tipoVuelo) {
        this.nVuelo = nVuelo;
        this.hSalida = hSalida;
        this.hLlega = hLlega;
        this.lOrigen = lOrigen;
        this.lDestino = lDestino;
        this.fchSalida = fchSalida;
        this.fchRegreso = fchRegreso;
        this.tipoVuelo = tipoVuelo;
        
        listaAsientos = new ArrayList();
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public ArrayList<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    public int getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    public String gethSalida() {
        return hSalida;
    }

    public void sethSalida(String hSalida) {
        this.hSalida = hSalida;
    }

    public String gethLlega() {
        return hLlega;
    }

    public void sethLlega(String hLlega) {
        this.hLlega = hLlega;
    }

    public String getlOrigen() {
        return lOrigen;
    }

    public void setlOrigen(String lOrigen) {
        this.lOrigen = lOrigen;
    }

    public String getlDestino() {
        return lDestino;
    }

    public void setlDestino(String lDestino) {
        this.lDestino = lDestino;
    }

    public LocalDate getFchSalida() {
        return fchSalida;
    }

    public void setFchSalida(LocalDate fchSalida) {
        this.fchSalida = fchSalida;
    }

    public LocalDate getFchRegreso() {
        return fchRegreso;
    }

    public void setFchRegreso(LocalDate fchRegreso) {
        this.fchRegreso = fchRegreso;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
    
    public void reservar(){}
    
    public void modificar(){}
    
    public void eliminar(){}
    
    public Vuelo buscar(){
        return this;
    }
}
