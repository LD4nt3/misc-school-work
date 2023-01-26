/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import entidades.Encuesta;
import java.util.ArrayList;
import entidades.Preguntas;
/**
 *
 * @author DELL INSP15
 */
public class Cuestonario {
    public  String pregunta;
    public  int idPreg;
    public  int idRespeusta;
    public  String Respuesta;
    public  int idenc; 
    public Preguntas preg;
    public static int total;
    public static int incr;


    
    public Preguntas getPreg() {
        return preg;
    }

    public void setPreg(Preguntas preg) {
        this.preg = preg;
    }

    ArrayList<String> opcion= new ArrayList<String>();

    public ArrayList<String> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<String> opcion) {
        this.opcion = opcion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    
}
