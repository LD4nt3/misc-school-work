/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Encuesta;
import entidades.Preguntas;
import entidades.Tiporespuesta;
import java.util.ArrayList;

/**
 *
 * @author DELL INSP15
 */
public class Respuesta {
   public static Preguntas p=new Preguntas();
   public static Encuesta e=new Encuesta();
   public static Tiporespuesta tr=new Tiporespuesta();
   public static String respuesta;
   public static ArrayList<Preguntas> lista= new ArrayList<Preguntas>();
   public static ArrayList<String> resp= new ArrayList<String>();
   
   public static void guardar(Preguntas p){
       lista.add(p);
   }
   
   public static void guardarr(String res){
       resp.add(res);
   }
}
