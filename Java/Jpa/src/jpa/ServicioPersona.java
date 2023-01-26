/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import jpa.Personas;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

/**
 *
 * @author che_d
 */
public interface ServicioPersona {
	@WebMethod
	public Personas getPersona(int ID);
        
        @WebMethod
	public Personas setPersona(int ID);
	
	

        
}
