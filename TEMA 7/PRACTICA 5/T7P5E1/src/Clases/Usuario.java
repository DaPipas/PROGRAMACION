/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author 1gdaw05
 */
public class Usuario {
    private String usuario;
    private String contrasena;
    private Empleado empleado;

    public Usuario(String usuario, String contrasena, Empleado empleado) {
        this.usuario = usuario;
        this.contrasena = DigestUtils.md5Hex(contrasena);
        this.empleado = empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
