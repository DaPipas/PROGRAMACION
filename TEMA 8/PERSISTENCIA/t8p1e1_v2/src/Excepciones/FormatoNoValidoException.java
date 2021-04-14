package Excepciones;

public class FormatoNoValidoException extends Exception{
      private int numero;

    public FormatoNoValidoException(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String getMessage(){
        String mensaje=null;
        switch(numero)
        {
            case 1: mensaje = "El nombre no tiene el formato adecuado";
                break;
            case 2: mensaje = "La edad no tiene el formato adecuado";
                break;
            case 3: mensaje = "La profesión no tiene el formato adecuado";
                break;
            case 4: mensaje = "El teléfono no tiene el formato adecuado";
                break;
        }
        return mensaje;
    }
}
