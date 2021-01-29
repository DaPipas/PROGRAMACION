
package Clases;

import java.lang.Math;
public class Circunferencia {
    private double PI = Math.PI;
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double longitud(){
        double longitud = 2 * PI * radio;
        return longitud;
    }
    public double area() {
        double area = PI * radio * radio;
        return area;
    }
    public double volumen() {
        double volumen = (4 * PI * radio * radio * radio) / 3;
        return volumen;
    }
}
