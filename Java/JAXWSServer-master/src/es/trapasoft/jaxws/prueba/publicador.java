package es.trapasoft.jaxws.prueba;

import javax.xml.ws.Endpoint;

import es.trapasoft.jaxws.servicio.PersonService;



public class publicador {

	public static void main(String[] args) {
	       Endpoint.publish("http://localhost:8888/ws/server", new PersonService());
	       System.out.println("Servicio publicado y en ejecución");
	}

}
