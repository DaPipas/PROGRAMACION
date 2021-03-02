/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1gdaw05
 */
public class Reserva {
    private String nombre;
    private String email;
    private int telefono;
    private String colorMantel;
    private String demandasExtra;
    private Turno turno;

    public Reserva(String nombre, String email, int telefono, String colorMantel, String demandasExtra, Turno turno) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.colorMantel = colorMantel;
        this.demandasExtra = demandasExtra;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getColorMantel() {
        return colorMantel;
    }

    public void setColorMantel(String colorMantel) {
        this.colorMantel = colorMantel;
    }

    public String getDemandasExtra() {
        return demandasExtra;
    }

    public void setDemandasExtra(String demandasExtra) {
        this.demandasExtra = demandasExtra;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    
}
