
package UML;

public class Animal {
    private int id_animal;
    private String nombre;
    private String especie;
    private String sexo;
    private int peso; //kg
    private String continente;
    private int edad;
    private Zoo zoo;

    public Animal() {
    }

    public Animal(int id_animal, String nombre, String especie, String sexo, int peso, String continente, int edad, Zoo zoo) {
        this.id_animal = id_animal;
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.peso = peso;
        this.continente = continente;
        this.edad = edad;
        this.zoo = zoo;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public String toString() {
        return "Animal{" + "id_animal=" + id_animal + ", nombre=" + nombre + ", especie=" + especie + ", sexo=" + sexo + ", peso=" + peso + ", continente=" + continente + ", edad=" + edad + ", zoo=" + zoo + "}";
    }
    
    
}
