/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 1gdaw05
 */
public class Evento {
    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private LocalTime h_inicio;
    private LocalTime h_final;
    private int aforo;

    public Evento() {
    }

    public Evento(String nombre, String lugar, LocalDate fecha, LocalTime h_inicio, LocalTime h_final, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.h_inicio = h_inicio;
        this.h_final = h_final;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getH_inicio() {
        return h_inicio;
    }

    public void setH_inicio(LocalTime h_inicio) {
        this.h_inicio = h_inicio;
    }

    public LocalTime getH_final() {
        return h_final;
    }

    public void setH_final(LocalTime h_final) {
        this.h_final = h_final;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    
    
}
