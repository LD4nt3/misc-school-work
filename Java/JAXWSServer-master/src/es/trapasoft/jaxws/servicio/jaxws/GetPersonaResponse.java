
package es.trapasoft.jaxws.servicio.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPersonaResponse", namespace = "http://servicio.jaxws.trapasoft.es/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonaResponse", namespace = "http://servicio.jaxws.trapasoft.es/")
public class GetPersonaResponse {

    @XmlElement(name = "return", namespace = "")
    private es.trapasoft.jaxws.modelo.Persona _return;

    /**
     * 
     * @return
     *     returns Persona
     */
    public es.trapasoft.jaxws.modelo.Persona getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(es.trapasoft.jaxws.modelo.Persona _return) {
        this._return = _return;
    }

}
