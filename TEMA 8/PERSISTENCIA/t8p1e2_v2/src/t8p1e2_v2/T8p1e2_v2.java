package t8p1e2_v2;

import Modelo.UML.Acontecimiento;
import GUI.*;
import Modelo.DB.*;
import Modelo.UML.Asistentes;
import Modelo.UML.Empresa;
import Modelo.UML.Persona;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;



public class T8p1e2_v2 {
   
    private static Acontecimiento acontecimiento;
    private static Persona p;
    private static Empresa e;
    
    // Lista de acontecimientos que admiten personas.
    private static ArrayList<Acontecimiento> listaAcontecimientos;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    private static VentanaInscripcion vi;
    
    private static AcontecimientoJpaController AcontecimientoDB;
    private static PersonaJpaController PersonaDB;
    private static EmpresaJpaController EmpresaDB;
    private static AsistentesJpaController AsistentesDB;
    
    public static void main(String[] args) {
        AcontecimientoDB = new AcontecimientoJpaController(Persistence.createEntityManagerFactory("t8p1e2_v2PU"));
        PersonaDB = new PersonaJpaController(Persistence.createEntityManagerFactory("t8p1e2_v2PU"));
        EmpresaDB = new EmpresaJpaController(Persistence.createEntityManagerFactory("t8p1e2_v2PU"));
        AsistentesDB = new AsistentesJpaController(Persistence.createEntityManagerFactory("t8p1e2_v2PU"));
        vp = new VentanaPrincipal();
        vp.setVisible(true);
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
       
    public static void grabarAcontecimiento(String nombre, String lugar, String fecha, String horaI, String horaF, int nro)throws Exception{
       
        // Alta -- Crear objeto y enviarlo a AcontecimientoBD
        acontecimiento = new Acontecimiento(nombre, lugar , Date.valueOf(fecha),  Date.valueOf(horaI),Date.valueOf(horaF),nro);
        AcontecimientoDB.create(acontecimiento);
    }
    
   public static void terminar(){
       System.exit(0);
   }
   
   public static String listado() throws Exception{
       List lista = AcontecimientoDB.findAcontecimientoEntities();
       String textoFinal = "";
       for(int i=0; i > lista.size(); i++)
       {
           textoFinal += lista.get(i).toString() + "\n";
       }
       return textoFinal;
   }
   
   public static void borrarAcontecimiento(String nombre) throws Exception
   {
       // Primero lo consultamos, mostramos sus datos y luego pedimos confirmación.

       acontecimiento = AcontecimientoDB.findAcontecimiento(nombre);
       if (vp.mostrar(acontecimiento.toString()) == true)
            AcontecimientoDB.destroy(acontecimiento.getNombre());
   }
    
    public static void modificarAcontecimientoParteUno(String nombre) throws Exception
   {
       // Primero consultamos y mostramos sus datos
       acontecimiento = AcontecimientoDB.findAcontecimiento(nombre);
       ve = new VentanaAcontecimientos(acontecimiento.getNombre(),acontecimiento.getLugar(),String.valueOf(acontecimiento.getFecha()), String.valueOf(acontecimiento.getHoraI()), String.valueOf(acontecimiento.getHoraF()), String.valueOf(acontecimiento.getAforo()));
       ve.setVisible(true);
   }
    
   public static void modificarAcontecimientoParteDos(String nombre, String lugar, String fecha, String horaI, String horaF, int nro) throws Exception
   {
       // actualizamos objeto en memoria
       acontecimiento.setLugar(lugar);
       acontecimiento.setFecha(Date.valueOf(fecha));
       acontecimiento.setHoraI(Date.valueOf(horaI));
       acontecimiento.setHoraF(Date.valueOf(horaF));
       acontecimiento.setAforo(nro);
       AcontecimientoDB.edit(acontecimiento);
   }
   
   // Añadido al completo
   public static boolean visualizarVentanaInscripcion() throws Exception{
        // Pido ya a la base de datos información sobre los proximos acontecimientos con plazas libres.
        listaAcontecimientos = AcontecimientoDB.consultarProximosLibres();
        
        if (listaAcontecimientos.isEmpty())
            return false;
        
        // Dejo por debajo la principal
         vi = new VentanaInscripcion();
         vi.setVisible(true);
         return true;
    }
   
   public static int getNumeroAcontecimientosDisponibles()
    {
        return listaAcontecimientos.size();
    }
   
    public static String getNombreAcontecimiento(int x)
    {
        return listaAcontecimientos.get(x).getNombre();
    }
   
    public static String getFechaAcontecimiento(int x)
    {
        acontecimiento = listaAcontecimientos.get(x);
        return String.valueOf(acontecimiento.getFecha());
    }
    
    public static String getHoraAcontecimiento()
    {
        return String.valueOf(acontecimiento.getHoraI());
    }
    
    public static boolean buscarPersona(String dni) throws Exception{
    
       // Se puede pasar sólo el dni
       p = PersonaDB.findPersona(dni);
       if (p != null)
           return true;
       return false;
   }
   
   public static String getNombre(){
       return p.getNombre();
   }
   
   public static String getApellidos(){
       return p.getApellidos();
   }
   
   public static String getTelefono(){
       return p.getTelefono();
   }
   
   public static String getNombreEmpresa(){
       return p.getNifEmpresa().getNombre();
   }
   
   public static String getNif(){
       return p.getNifEmpresa().getNif();
   }
   
   public static String getCnae(){
       return String.valueOf(p.getNifEmpresa().getCnae());
   }
   
   public static String getRazonSocial(){
       return p.getNifEmpresa().getRazonSocial();
   }
   
   public static void altaAsistente() throws Exception{
       // Relaciones
       //acontecimiento.setAsistente(p);
       //p.setEvento(acontecimiento);
       Asistentes asi = new Asistentes(acontecimiento.getNombre(),p.getDni());
       // A la base de datos
       AsistentesDB.create(asi);
       
   }
   
   public static void altaPersonaEmpresa(String d,String n,String ap,String tel,String nif,String nEmp,String rs,String cnae) throws Exception{
     // Estructura de objetos y relaciones
       p = new Persona(d,n,ap,tel);
       
       // No se si la empresa es nueva
       e = new Empresa();
       e.setNif(nif);
       e.setNombre(nEmp);
       e.setRazonSocial(rs);
       e.setCnae(Integer.parseInt(cnae));
       
       p.setNifEmpresa(e);
       
       Asistentes asi = new Asistentes(nif, d);
       //acontecimiento.setAsistente(p);
       //p.setEvento(acontecimiento);
       
    // Vamos a la base de datos
       EmpresaDB.create(e);
       PersonaDB.create(p);
       AsistentesDB.create(asi);
   }
   
   public static String getAsistentes(String nombre) throws Exception
   {
       ArrayList<Persona> lista = PersonaDB.getAsistentes(nombre);
       String datos="";
        for(Persona obj:lista)
       {
           datos += obj.toString() + "\n";
       }
       //datos = lista.stream().map((obj) -> obj.toString() + "\n").reduce(datos, String::concat);
       return datos;
   }
}
