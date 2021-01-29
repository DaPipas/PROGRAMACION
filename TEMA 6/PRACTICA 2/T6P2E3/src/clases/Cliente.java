
package clases;

public class Cliente extends Persona{
    private String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Cliente(String telefonoContacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return super.toString() + "telefonoContacto=" + telefonoContacto;
    }
    
    
}
