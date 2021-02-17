/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw05
 */
public class Empleado {
    private String dni;
    private int nss;
    private String nombreApellido;
    private String direccion;
    private int telefono;
    private String sexo;
    private String estadoCivil;
    private Contrato tipoContrato;
    private Departamento departamento;
    private LocalDate fchAlta;
    private final int nEmpleado;

    public Empleado(String dni, int nss, String nombreApellido, String direccion, int telefono, String sexo, String estadoCivil, Contrato tipoContrato, Departamento departamento, LocalDate fchAlta, int nEmpleado) {
        this.dni = dni;
        this.nss = nss;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.tipoContrato = tipoContrato;
        this.departamento = departamento;
        this.fchAlta = fchAlta;
        this.nEmpleado = nEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Contrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Contrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFchAlta() {
        return fchAlta;
    }

    public void setFchAlta(LocalDate fchAlta) {
        this.fchAlta = fchAlta;
    }
}
