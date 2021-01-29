
package clases;

public class Empleado extends Persona{
    private double sueldoBruto;

    public Empleado() {
    }

    public Empleado(double sueldo) {
        this.sueldoBruto = sueldo;
    }

    public Empleado(double sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldoBruto = sueldo;
    }

    public double getSueldo() {
        return sueldoBruto;
    }

    public void setSueldo(double sueldo) {
        this.sueldoBruto = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "sueldo bruto=" + sueldoBruto;
    }
    
    
}
