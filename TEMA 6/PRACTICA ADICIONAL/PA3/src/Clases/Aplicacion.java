/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Luyan
 */
public class Aplicacion {
    private char nombre;
    
    private ArrayList<Usuario> listaUsuarios;
    private ServidorWeb servidorWeb;
    private Database database;

    public Aplicacion(char nombre) {
        this.nombre = nombre;
        
        listaUsuarios = new ArrayList();
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ServidorWeb getServidorWeb() {
        return servidorWeb;
    }

    public void setServidorWeb(ServidorWeb servidorWeb) {
        this.servidorWeb = servidorWeb;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
    
    public void recuperarDatos(){}
    
    public void datosProceso(){}
    
    public void convertirDatos(){}
    
    public void soliciteContenidoDatabase(){}
}
