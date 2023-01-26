/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.conexion;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Respuestas;
import entidades.Encuesta;
import controlador.PreguntasController;
import entidades.Preguntas;
import modelo.Cuestonario;
import modelo.Encuesta_term;
import modelo.Respuesta;
/**
 *
 * @author DELL INSP15
 */
@Named(value = "respuestasController")
@ApplicationScoped
public class RespuestasController {
    ArrayList<String> array=new ArrayList<String>();
    String resp;
    Respuestas respuesta;
    int i;

    public int getI() {
        return i;
    } 

    public void setI(int i) {
        this.i = i;
    }
    
    public String getResp() {
        return resp;
    }
    public void setResp(String resp) {
        this.resp = resp;
    }

    public ArrayList<String> getArray() {
        return array;
    }

    public void setArray(ArrayList<String> array) {
        this.array = array;
    }
    
    public Respuestas Selected(){
        if(respuesta==null){
            respuesta=new Respuestas();
        }
        return respuesta;
    }
    /**
     * Creates a new instance of RespuestasController
     */
    public RespuestasController() {
    }
    public String guardar(){
        array.add(resp);
        if(Cuestonario.incr<Cuestonario.total-1){
            Cuestonario.incr++;
            i=Cuestonario.incr;
        //array=modelo.Respuesta.resp;
        return "mostrar";
        }
        else{
        conexion conect=new conexion();
        Encuesta enc=new Encuesta();
        enc.setEnlace(Encuesta_term.enlace);
        enc.setFkUsuario(Encuesta_term.us);
        enc.setIdEncuesta(Encuesta_term.id);
        enc.setNoPreguntas(Encuesta_term.preg);
        enc.setNombre(Encuesta_term.nombre);
        
        
        conect.respuesta_dentro(array,enc);
        return "mostrar1";
        }
    }
}
