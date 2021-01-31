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
public class Usuario {
    private char id;
    private char nombre;
    private char contrasenia;
    
    private Aplicacion aplicacion;

    public Usuario(char id, char nombre, char contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(char contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    
    public void hagaSolicitud(){}
    
    public void solicitudContenido(){}
}
