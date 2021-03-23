/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Caso {
    private int id;
    private LocalDate f_inicio;
    private LocalDate f_final;
    private String estado;      //tramite, archivado, anulado
    private Cliente cliente;
    private ArrayList<Abogado> listaAbogados;

    public Caso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(LocalDate f_inicio) {
        this.f_inicio = f_inicio;
    }

    public LocalDate getF_final() {
        return f_final;
    }

    public void setF_final(LocalDate f_final) {
        this.f_final = f_final;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Abogado> getListaAbogados() {
        return listaAbogados;
    }

    public void setListaAbogados(ArrayList<Abogado> listaAbogados) {
        this.listaAbogados = listaAbogados;
    }
    
    public void addAbogado(Abogado a){
        listaAbogados.add(a);
    }
    
}
