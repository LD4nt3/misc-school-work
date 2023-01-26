/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Opciones;
import entidades.Encuesta;
import entidades.Preguntas;
import conexion.conexion;
import entidades.Usuarios;
import java.util.List;
import modelo.Encuesta_term;
import modelo.Pregunta;
import modelo.Tot_preg;
import modelo.login;

/**
 *
 * @author DELL INSP15
 */
@Named(value = "multiplesController")
@ApplicationScoped
public class MultiplesController {
    Opciones o;
    boolean x;        
    public MultiplesController() {       
    }
    
    public Opciones getSelected(){
      if(o==null){
        o=new Opciones();       
      }
      return o;
    }
    
    public String guardar(){
        conexion conect=new conexion();
        
        Usuarios us=new Usuarios();
        us.setContraseña(login.contrasena);
        us.setUsuario(login.nombre);
        us.setIdUsuario(login.id);
        
        Encuesta e=new Encuesta();
        e.setEnlace(Encuesta_term.enlace);
        e.setNombre(Encuesta_term.nombre);
        e.setIdEncuesta(Encuesta_term.id);
        e.setNoPreguntas(Encuesta_term.preg);
        e.setFkUsuario(us);
        
        Preguntas pr=new Preguntas();
        String r=Pregunta.preg;       
        List <Preguntas> resp= conect.look_preg(r, e);
        for(Preguntas p:resp){
            pr.setFkEncuesta(e);
            pr.setIdPregunta(p.getIdPregunta());
            pr.setFkTiporespuesta(p.getFkTiporespuesta());
            pr.setPregunta(p.getPregunta());
            
        }
        conect.smultiples(pr, o);
        
        x=Tot_preg.seguir();
        if(x==true){
            return "respuesta";
        }
        else{
            return "respuesta2";
        }
    }
}
