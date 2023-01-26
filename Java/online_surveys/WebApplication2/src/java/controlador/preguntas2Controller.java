/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Encuesta;
import entidades.Preguntas;
import entidades.Respuestas;
import modelo.Encuesta_term;
import conexion.conexion;
import java.util.List;

/**
 *
 * @author DELL INSP15
 */
@Named(value = "preguntas2Controller")
@ApplicationScoped
public class preguntas2Controller {
    Respuestas r;
    
    public Respuestas getSelected(){
       if(r==null){
           r=new Respuestas();
       }
       return r;
    }
    
   public String modificar(){
       Encuesta en=new Encuesta();
       en.setEnlace(Encuesta_term.enlace);
       
       conexion conect= new conexion();      
       List <Preguntas> resp=conect.look_pregunta(en);
       int var=resp.size();
       Preguntas array[]=new Preguntas[var];
       
       for(Preguntas p:resp){
           array[2].setPregunta(p.getPregunta());
       }
       return "rodo";
   }
   
   public void imprimir(Preguntas i[]){
       
   }
    public preguntas2Controller() {
    }
    
}
