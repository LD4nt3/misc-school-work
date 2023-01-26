/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "personas1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas1.findAll", query = "SELECT p FROM Personas1 p")
    , @NamedQuery(name = "Personas1.findById", query = "SELECT p FROM Personas1 p WHERE p.id = :id")
    , @NamedQuery(name = "Personas1.findByApellidoP", query = "SELECT p FROM Personas1 p WHERE p.apellidoP = :apellidoP")
    , @NamedQuery(name = "Personas1.findByApellidoM", query = "SELECT p FROM Personas1 p WHERE p.apellidoM = :apellidoM")})
public class Personas1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "apellido_p")
    private String apellidoP;
    @Basic(optional = false)
    @Column(name = "apellido_m")
    private String apellidoM;

    public Personas1() {
    }

    public Personas1(Integer id) {
        this.id = id;
    }

    public Personas1(Integer id, String apellidoP, String apellidoM) {
        this.id = id;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas1)) {
            return false;
        }
        Personas1 other = (Personas1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Personas1[ id=" + id + " ]";
    }
    
}
