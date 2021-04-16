/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.UML;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1gdaw05
 */
@Entity
@Table(name = "asistentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asistentes.findAll", query = "SELECT a FROM Asistentes a")
    , @NamedQuery(name = "Asistentes.findByDni", query = "SELECT a FROM Asistentes a WHERE a.asistentesPK.dni = :dni")
    , @NamedQuery(name = "Asistentes.findByNif", query = "SELECT a FROM Asistentes a WHERE a.asistentesPK.nif = :nif")})
public class Asistentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsistentesPK asistentesPK;

    public Asistentes() {
    }

    public Asistentes(AsistentesPK asistentesPK) {
        this.asistentesPK = asistentesPK;
    }

    public Asistentes(String dni, String nif) {
        this.asistentesPK = new AsistentesPK(dni, nif);
    }

    public AsistentesPK getAsistentesPK() {
        return asistentesPK;
    }

    public void setAsistentesPK(AsistentesPK asistentesPK) {
        this.asistentesPK = asistentesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asistentesPK != null ? asistentesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistentes)) {
            return false;
        }
        Asistentes other = (Asistentes) object;
        if ((this.asistentesPK == null && other.asistentesPK != null) || (this.asistentesPK != null && !this.asistentesPK.equals(other.asistentesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.UML.Asistentes[ asistentesPK=" + asistentesPK + " ]";
    }
    
}
