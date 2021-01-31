/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author Luyan
 */
public class Pago {
    private LocalDate fchPago;
    private double importe;
    private String direccionFacturacion;
    
    private Envio envio;

    public Pago(LocalDate fchPago, double importe, String direccionFacturacion) {
        this.fchPago = fchPago;
        this.importe = importe;
        this.direccionFacturacion = direccionFacturacion;
    }

    public LocalDate getFchPago() {
        return fchPago;
    }

    public void setFchPago(LocalDate fchPago) {
        this.fchPago = fchPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
    
    
}
