
package es.trapasoft.jaxws.servicio.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPersonasByDept", namespace = "http://servicio.jaxws.trapasoft.es/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonasByDept", namespace = "http://servicio.jaxws.trapasoft.es/")
public class GetPersonasByDept {

    @XmlElement(name = "arg0", namespace = "")
    private int arg0;

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(int arg0) {
        this.arg0 = arg0;
    }

}
