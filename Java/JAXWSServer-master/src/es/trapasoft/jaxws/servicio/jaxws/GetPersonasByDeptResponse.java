
package es.trapasoft.jaxws.servicio.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPersonasByDeptResponse", namespace = "http://servicio.jaxws.trapasoft.es/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonasByDeptResponse", namespace = "http://servicio.jaxws.trapasoft.es/")
public class GetPersonasByDeptResponse {

    @XmlElement(name = "return", namespace = "")
    private List<es.trapasoft.jaxws.modelo.Persona> _return;

    /**
     * 
     * @return
     *     returns List<Persona>
     */
    public List<es.trapasoft.jaxws.modelo.Persona> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<es.trapasoft.jaxws.modelo.Persona> _return) {
        this._return = _return;
    }

}
