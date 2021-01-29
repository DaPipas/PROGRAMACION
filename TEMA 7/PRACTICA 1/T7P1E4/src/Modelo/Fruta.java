
package Modelo;

public class Fruta {
    private String nombre;
    private int unidades;
    private double precioUnitario;

    public Fruta(String nombre, int unidades, double precioUnitario) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
