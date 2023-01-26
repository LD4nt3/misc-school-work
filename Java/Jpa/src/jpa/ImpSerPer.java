/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;
import jpa.Personas;
import javax.jws.WebService;
/**
 *
 * @author che_d
 */
@WebService(endpointInterface = "jpa.jaxws.ServicioPersona")  
public class ImpSerPer implements ServicioPersona{
private Personas persons = new Personas();

    @Override
    public Personas getPersona(int E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personas setPersona(int sI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
