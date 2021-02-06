/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw05
 */
public class Transferencia extends Movimiento{
    private String nombreDestinatario;

    public Transferencia(String nombreDestinatario, LocalDate fecha, double importe) {
        super(fecha, importe);
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    @Override
    public String toString() {
        return super.getFecha() + " " + nombreDestinatario + " " + super.getImporte();
    }
    
    
}
