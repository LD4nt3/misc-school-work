package es.trapasoft.jaxws.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import es.trapasoft.jaxws.dao.DAOManager;
import es.trapasoft.jaxws.modelo.Persona;

@WebService
public class PersonService {
	
	DAOManager dao = new DAOManager();
	
	@WebMethod
	public Persona getPersona(int id) {
		
		Persona menda = new Persona();
		
		System.out.println("METODO getPersona("+id+")");
		
		
		menda = dao.getPersona(id);
		
		return menda;
	}
	
	@WebMethod
	public List<Persona> getPersonas(String nombreOapellido) {
		List<Persona> listamendas = new ArrayList<Persona>();
		
		System.out.println("METODO getListaPersonas("+nombreOapellido+")");
		
		listamendas = dao.getPersonas(nombreOapellido);
		
		return listamendas;
	}
	
	@WebMethod
	public List<Persona> getPersonasByDept(int deptid) {
		List<Persona> listamendas = new ArrayList<Persona>();
		
		System.out.println("METODO getPersonasByDept("+deptid+")");
		listamendas = dao.getPersonasByDept(deptid);
		
		return listamendas;
	}

}
