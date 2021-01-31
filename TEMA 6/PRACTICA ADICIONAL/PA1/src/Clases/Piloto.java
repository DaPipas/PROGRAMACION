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
public class Piloto {
    private String codPiloto;
    private String nombre;
    private String apellido;
    private Integer nLicencia;
    
    private ArrayList<Vuelo> listaVuelos;

    public Piloto(String codPiloto, String nombre, String apellido, Integer nLicencia) {
        this.codPiloto = codPiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nLicencia = nLicencia;
        
        listaVuelos = new ArrayList();
    }

    public String getCodPiloto() {
        return codPiloto;
    }

    public void setCodPiloto(String codPiloto) {
        this.codPiloto = codPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getnLicencia() {
        return nLicencia;
    }

    public void setnLicencia(Integer nLicencia) {
        this.nLicencia = nLicencia;
    }

    public ArrayList<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
    
    public void agregarNuevo(){}
    
    public void asignarVuelo(){}
    
    public void cancelarVuelo(){}
    
    public void modificar(){}
    
    public Piloto buscar(){
        return this;
    }
}
    