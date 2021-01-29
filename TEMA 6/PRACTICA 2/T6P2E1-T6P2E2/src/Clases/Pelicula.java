
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo = "Desconocido";
    private String anio = "0000";
    private float duracion = (float) 0.0;
    private String tipo;
    private ArrayList<Estudio> estudios = new ArrayList<Estudio> ();

    
    
    
    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudiosArrayList(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }
    
    public void addEstudio (Estudio e){
        estudios.add(e);
    }
    
    

    
    public Pelicula(String tipo) {
        this.tipo = tipo;
    }
    
    public Pelicula(float duracion, String tipo, Estudio estudios){
        this.duracion = duracion;
        this.tipo = tipo;
        this.estudios.add(estudios);
    }
    

    public Pelicula(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
