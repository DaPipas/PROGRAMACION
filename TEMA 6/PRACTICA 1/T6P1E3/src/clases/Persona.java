
package clases;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fchNacimiento;
    private String direccion;
    private String cp;
    private String ciudad;

    public Persona(String nombre, LocalDate fchNacimiento, String direccion, String cp, String ciudad) {
        this.nombre = nombre;
        this.fchNacimiento = fchNacimiento;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFchNacimiento() {
        return fchNacimiento;
    }

    public void setFchNacimiento(LocalDate fchNacimiento) {
        this.fchNacimiento = fchNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\nfchNacimiento = " + fchNacimiento + "\ndireccion = " +  direccion + "\ncp = " + cp + "\nciudad = " + ciudad;
    }
    
}
