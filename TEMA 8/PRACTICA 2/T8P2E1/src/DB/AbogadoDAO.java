/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import UML.Abogado;
import java.sql.Connection;

/**
 *
 * @author 1gdaw05
 */
public class AbogadoDAO {
    Connection con;
    
    public static Abogado getByDni(Abogado a) throws Exception{
        ControladorDB.conectar();
        
    }
}
