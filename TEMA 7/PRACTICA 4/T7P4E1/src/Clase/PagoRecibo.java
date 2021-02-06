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
public class PagoRecibo extends Movimiento{
    private String codigo;

    public PagoRecibo(String codigo, LocalDate fecha, double importe) {
        super(fecha, importe);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return super.getFecha() + " " + codigo + " " + super.getImporte();
    }
}
