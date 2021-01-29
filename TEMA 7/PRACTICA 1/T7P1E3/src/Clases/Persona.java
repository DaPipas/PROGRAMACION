
package Clases;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private Curso curso;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
    }
    
    public String getCurso() {
        return curso.toString();
    }

    public void setCurso (Curso curso) {
        this.curso = curso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
