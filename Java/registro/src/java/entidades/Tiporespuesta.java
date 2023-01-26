/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author OeS Gossamer
 */
@Entity
@Table(name = "tiporespuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiporespuesta.findAll", query = "SELECT t FROM Tiporespuesta t")
    , @NamedQuery(name = "Tiporespuesta.findByIdtipoResp", query = "SELECT t FROM Tiporespuesta t WHERE t.idtipoResp = :idtipoResp")
    , @NamedQuery(name = "Tiporespuesta.findByNombre", query = "SELECT t FROM Tiporespuesta t WHERE t.nombre = :nombre")})
public class Tiporespuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_resp")
    private Integer idtipoResp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkTiporespuesta")
    private Collection<Preguntas> preguntasCollection;

    public Tiporespuesta() {
    }

    public Tiporespuesta(Integer idtipoResp) {
        this.idtipoResp = idtipoResp;
    }

    public Tiporespuesta(Integer idtipoResp, String nombre) {
        this.idtipoResp = idtipoResp;
        this.nombre = nombre;
    }

    public Integer getIdtipoResp() {
        return idtipoResp;
    }

    public void setIdtipoResp(Integer idtipoResp) {
        this.idtipoResp = idtipoResp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Preguntas> getPreguntasCollection() {
        return preguntasCollection;
    }

    public void setPreguntasCollection(Collection<Preguntas> preguntasCollection) {
        this.preguntasCollection = preguntasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoResp != null ? idtipoResp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiporespuesta)) {
            return false;
        }
        Tiporespuesta other = (Tiporespuesta) object;
        if ((this.idtipoResp == null && other.idtipoResp != null) || (this.idtipoResp != null && !this.idtipoResp.equals(other.idtipoResp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tiporespuesta[ idtipoResp=" + idtipoResp + " ]";
    }
    
}
