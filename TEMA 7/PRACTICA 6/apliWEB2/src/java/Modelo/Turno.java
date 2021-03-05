/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Turno {
    private LocalDate fchReserva;
    private int franjaHoraria;
    private int Comensales;
    private ArrayList<Reserva> listaReservas;

    public Turno(LocalDate fchReserva, int franjaHoraria, int Comensales, ArrayList<Reserva> listaReservas) {
        this.fchReserva = fchReserva;
        this.franjaHoraria = franjaHoraria;
        this.Comensales = Comensales;
        this.listaReservas = listaReservas;
    }

    public LocalDate getFchReserva() {
        return fchReserva;
    }

    public void setFchReserva(LocalDate fchReserva) {
        this.fchReserva = fchReserva;
    }

    public int getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public int getComensales() {
        return Comensales;
    }

    public void setComensales(int Comensales) {
        this.Comensales = Comensales;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
    
    
}
