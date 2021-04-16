/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.UML;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1gdaw05
 */
@Entity
@Table(name = "acontecimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acontecimiento.findAll", query = "SELECT a FROM Acontecimiento a")
    , @NamedQuery(name = "Acontecimiento.findByNombre", query = "SELECT a FROM Acontecimiento a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Acontecimiento.findByLugar", query = "SELECT a FROM Acontecimiento a WHERE a.lugar = :lugar")
    , @NamedQuery(name = "Acontecimiento.findByFecha", query = "SELECT a FROM Acontecimiento a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Acontecimiento.findByHoraI", query = "SELECT a FROM Acontecimiento a WHERE a.horaI = :horaI")
    , @NamedQuery(name = "Acontecimiento.findByHoraF", query = "SELECT a FROM Acontecimiento a WHERE a.horaF = :horaF")
    , @NamedQuery(name = "Acontecimiento.findByAforo", query = "SELECT a FROM Acontecimiento a WHERE a.aforo = :aforo")})
public class Acontecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "lugar")
    private String lugar;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "horaI")
    @Temporal(TemporalType.TIME)
    private Date horaI;
    @Basic(optional = false)
    @Column(name = "horaF")
    @Temporal(TemporalType.TIME)
    private Date horaF;
    @Basic(optional = false)
    @Column(name = "aforo")
    private int aforo;

    public Acontecimiento() {
    }

    public Acontecimiento(String nombre) {
        this.nombre = nombre;
    }

    public Acontecimiento(String nombre, String lugar, Date fecha, Date horaI, Date horaF, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.aforo = aforo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraI() {
        return horaI;
    }

    public void setHoraI(Date horaI) {
        this.horaI = horaI;
    }

    public Date getHoraF() {
        return horaF;
    }

    public void setHoraF(Date horaF) {
        this.horaF = horaF;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acontecimiento)) {
            return false;
        }
        Acontecimiento other = (Acontecimiento) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.UML.Acontecimiento[ nombre=" + nombre + " ]";
    }
    
}
