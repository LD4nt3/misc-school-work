/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author che_d
 */
@Entity
@Table(name = "opciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Opciones.findAll", query = "SELECT o FROM Opciones o")
    , @NamedQuery(name = "Opciones.findByIdOpciones", query = "SELECT o FROM Opciones o WHERE o.idOpciones = :idOpciones")
    , @NamedQuery(name = "Opciones.findByRespuesta1", query = "SELECT o FROM Opciones o WHERE o.respuesta1 = :respuesta1")
    , @NamedQuery(name = "Opciones.findByRespuesta2", query = "SELECT o FROM Opciones o WHERE o.respuesta2 = :respuesta2")
    , @NamedQuery(name = "Opciones.findByRespuesta3", query = "SELECT o FROM Opciones o WHERE o.respuesta3 = :respuesta3")
    , @NamedQuery(name = "Opciones.findByRespuesta4", query = "SELECT o FROM Opciones o WHERE o.respuesta4 = :respuesta4")
    , @NamedQuery(name = "Opciones.findByRespuesta5", query = "SELECT o FROM Opciones o WHERE o.respuesta5 = :respuesta5")})
public class Opciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_opciones")
    private Integer idOpciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "respuesta1")
    private String respuesta1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "respuesta2")
    private String respuesta2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "respuesta3")
    private String respuesta3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "respuesta4")
    private String respuesta4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "respuesta5")
    private String respuesta5;
    @JoinColumn(name = "fk_pregunta", referencedColumnName = "id_pregunta")
    @ManyToOne(optional = false)
    private Preguntas fkPregunta;

    public Opciones() {
    }

    public Opciones(Integer idOpciones) {
        this.idOpciones = idOpciones;
    }

    public Opciones(Integer idOpciones, String respuesta1, String respuesta2, String respuesta3, String respuesta4, String respuesta5) {
        this.idOpciones = idOpciones;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuesta5 = respuesta5;
    }

    public Integer getIdOpciones() {
        return idOpciones;
    }

    public void setIdOpciones(Integer idOpciones) {
        this.idOpciones = idOpciones;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public String getRespuesta5() {
        return respuesta5;
    }

    public void setRespuesta5(String respuesta5) {
        this.respuesta5 = respuesta5;
    }

    public Preguntas getFkPregunta() {
        return fkPregunta;
    }

    public void setFkPregunta(Preguntas fkPregunta) {
        this.fkPregunta = fkPregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpciones != null ? idOpciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opciones)) {
            return false;
        }
        Opciones other = (Opciones) object;
        if ((this.idOpciones == null && other.idOpciones != null) || (this.idOpciones != null && !this.idOpciones.equals(other.idOpciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Opciones[ idOpciones=" + idOpciones + " ]";
    }
    
}
