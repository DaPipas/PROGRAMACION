
package ModeloUML;

public class Vehiculo {
    
    private String matricula;
    private String modelo;
    private Persona p;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, Persona p) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.p = p;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }
    
    @Override
    public String toString()
    {
        return matricula + " " + modelo + "\n";
    }
    
}
