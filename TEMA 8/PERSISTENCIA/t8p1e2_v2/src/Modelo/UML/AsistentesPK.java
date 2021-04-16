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
public class AsistentesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "dni")
    private String dni;
    @Basic(optional = false)
    @Column(name = "nif")
    private String nif;

    public AsistentesPK() {
    }

    public AsistentesPK(String dni, String nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dni != null ? dni.hashCode() : 0);
        hash += (nif != null ? nif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistentesPK)) {
            return false;
        }
        AsistentesPK other = (AsistentesPK) object;
        if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni))) {
            return false;
        }
        if ((this.nif == null && other.nif != null) || (this.nif != null && !this.nif.equals(other.nif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.UML.AsistentesPK[ dni=" + dni + ", nif=" + nif + " ]";
    }
    
}
