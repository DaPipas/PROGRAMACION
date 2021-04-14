package Excepciones;

public class CampoVacioException extends Exception{
    private int numero;

    public CampoVacioException(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String getMessage(){
        String mensaje=null;
        switch(numero)
        {
            case 1: mensaje = "El nombre es un campo obligatorio";
                break;
            case 2: mensaje = "La edad es un campo obligatorio";
                break;
            case 3: mensaje = "La profesión es un campo obligatorio";
                break;
            case 4: mensaje = "El teléfono es un campo obligatorio";
                break;
            case 5: mensaje = "Indica una opción";
                break;
        }
        return mensaje;
    }
}
