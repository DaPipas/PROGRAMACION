/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 1gdaw05
 */
public class tablaEmpresa {
    private static Connection con;
    //
    public static void insertEmpresa(Empresa e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "INSERT INTO empresa VALUES(?, ?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNif());
        ps.setString(2, e.getNombre());
        
        int n = ps.executeUpdate();
        
        if(n!=1)
            throw new Exception("Se ha insertado mas de una Empresa.");
        
        System.out.println("Empresa insertada con exito.");
        ControladorBD.desconectar();
    }
    
    public static Empresa validarEmpresa(Empresa e) throws Exception{
        ControladorBD.conectar();
        con = ControladorBD.getCon();
        
        String plantilla = "SELECT * FROM empresa WHERE LOWER(nif) = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNif());
        
        ResultSet resultado = ps.executeQuery();
        Empresa rEmpresa = new Empresa();
        
        if(resultado==null)
        {
            rEmpresa = null;
            System.out.println("No se ha encontrado la empresa en la BD");
            ControladorBD.desconectar();
            return rEmpresa;
        }
        else
        {
            resultado.next();
            rEmpresa.setNif(resultado.getString("nif"));
            rEmpresa.setNombre(resultado.getString("nombre"));
            System.out.println("Empresa encontrada.");
            ControladorBD.desconectar();
            return rEmpresa;
        }
    }
    //
}
