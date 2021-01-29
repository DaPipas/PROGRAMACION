
package Clases;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getLongitud(){
        return 2 * Math.PI * radio;
    }
    
    public double getArea(){
        return Math.PI * radio * radio;
    }
    
    public double getVolumen(){
        return 4* Math.PI* radio* radio* radio / 3;
    }
}
