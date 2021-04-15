/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.UML;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author 1gdaw05
 */
@Embeddable
public class AcontecimientoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "lugar")
    private String lugar;

    public AcontecimientoPK() {
    }

    public AcontecimientoPK(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        hash += (lugar != null ? lugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcontecimientoPK)) {
            return false;
        }
        AcontecimientoPK other = (AcontecimientoPK) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        if ((this.lugar == null && other.lugar != null) || (this.lugar != null && !this.lugar.equals(other.lugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.UML.AcontecimientoPK[ nombre=" + nombre + ", lugar=" + lugar + " ]";
    }
    
}
