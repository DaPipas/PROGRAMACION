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
public class ServidorWeb {
    private char nombre;
    
    private Aplicacion aplicacion;

    public ServidorWeb(char nombre) {
        this.nombre = nombre;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    
    public void solicitudProceso(){}
    
    public void mostrarPagina(){}
    
    public void convertirDatos(){}
    
    public void soliciteContenidoSolicitud(){}
}
