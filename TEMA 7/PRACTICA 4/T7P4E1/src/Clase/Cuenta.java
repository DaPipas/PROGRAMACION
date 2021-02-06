/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Cuenta {
    private int nCuenta;
    private double saldo;
    
    private ArrayList<Movimiento> listaMovimientos;

    public Cuenta(int nCuenta, double saldo) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        listaMovimientos = new ArrayList();
    }
    
    public void addMovimiento(Movimiento m){
        listaMovimientos.add(m);
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }
    
    
}
