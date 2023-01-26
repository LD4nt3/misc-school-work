/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import entidades.Preguntas;
import entidades.Encuesta;
import entidades.Usuarios;
import entidades.Opciones;
import modelo.Tot_preg;
import modelo.Tipo;
import conexion.conexion;
import entidades.Tiporespuesta;
import modelo.Cuestonario;
import controlador.EncuestraController;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import modelo.Encuesta_term;
import modelo.Pregunta;
import modelo.login;
/**
 *
 * @author DELL INSP15
 */
@Named(value = "preguntasController")
@ApplicationScoped

public class PreguntasController {

    int total=Tot_preg.valuepreg;
    int y=Tot_preg.i;
    int i=0;
    int tipor[]=new int[total+1];
    boolean x;
    private String preg;
    Preguntas preu =new Preguntas();
    Preguntas p[]=new Preguntas[total+1];
    ArrayList<Preguntas> pr= new ArrayList<Preguntas>();
    ArrayList<Cuestonario> ArrayCuestion= new ArrayList<Cuestonario>();

    
    
    public int getI() {
        return i;
    }

    public ArrayList<Cuestonario> getArrayCuestion() {
        return ArrayCuestion;
    }

    public void setArrayCuestion(ArrayList<Cuestonario> ArrayCuestion) {
        this.ArrayCuestion = ArrayCuestion;
    }

    ArrayList<Preguntas> res= new ArrayList<Preguntas>();

    public ArrayList<Preguntas> getPr() {
        return pr;
    }

    public ArrayList<Preguntas> getRes() {
        return res;
    }
    
    public PreguntasController() {
    }
    
    public Preguntas getSelected(){
        if(p[y]==null){
            p[y]=new Preguntas();
        }
        return p[y];
    }

    public String getPreg() {
        return preg;
    }

    public void setPreg(String preg) {
        this.preg = preg;
    }

    public int getTipor() {
        return tipor[y];
    }

    public void setTipor(int tipor) {
        this.tipor[y] = tipor;
    }

    public String sipuede(){
        //primero se guarda en la base de datos 
        conexion conect= new conexion();
        List <Tiporespuesta> resp=conect.look_tipor(tipor[y]);
        for(Tiporespuesta tip:resp){
            Tipo.id=tip.getIdtipoResp();
            Tipo.nombre=tip.getNombre();
        }
        Pregunta.preg=p[y].getPregunta();
//        p[y]=new Preguntas();
//        p[y].setPregunta(preg);
        conect.set_preg(p[y].getPregunta(), Tipo.nombre, Tipo.id);
        y++;
        if(Tipo.id==3){
            return "prueba";
        }
        x=Tot_preg.seguir();
        if(x==true){
            return "respuesta";
        }
        else{
            return "respuesta2";
        }
    }
   public String modificar(){
       Encuesta enc= new Encuesta();
       enc.setEnlace(Encuesta_term.enlace);
       conexion conect=new conexion();
       Encuesta en=new Encuesta();
       Tiporespuesta aqui=new Tiporespuesta();
       
       Usuarios u=new Usuarios();
       u.setContraseña(login.contrasena);
       u.setIdUsuario(login.id);
       u.setUsuario(login.nombre);
       
       en.setEnlace(Encuesta_term.enlace);
       en.setIdEncuesta(Encuesta_term.id);
       en.setNoPreguntas(Encuesta_term.preg);
       en.setNombre(Encuesta_term.nombre);
       en.setFkUsuario(u);
       
       Preguntas tip= new Preguntas();
       tip.setFkEncuesta(en);
       tip.setFkTiporespuesta(aqui);
       tip.setIdPregunta(total);
       tip.setPregunta(preg);
       
       List <Preguntas> resp=conect.look_pregunta(en);
       Cuestonario.total=resp.size();
       
       pr.clear();
       ArrayCuestion.clear();
       int z=0;
       for(Preguntas preg:resp){
           int var=preg.getFkTiporespuesta().getIdtipoResp();
           int k=preg.getIdPregunta();
           Cuestonario c=new Cuestonario();
           ArrayList<String> array=new ArrayList<String>();
           if(var==1){     
           array.add("si");
           array.add("no");
           }
           if(var==2){
           array.add("1");
           array.add("2");
           array.add("3");
           array.add("4");
           array.add("5");
           }
           if(var==3){
           List<Opciones> op= conect.look_op(preg);
           for(Opciones opc: op){
               array.add(opc.getRespuesta1());
               array.add(opc.getRespuesta2());
               array.add(opc.getRespuesta3());
               array.add(opc.getRespuesta4());
               array.add(opc.getRespuesta5());              
           }
           }
           c.setOpcion(array);
           c.setPregunta(preg.getPregunta());
           ArrayCuestion.add(c);
           pr.add(preg);
           z++;
       }
       
       
       /*List <Tiporespuesta> otramas=conect.look_tipor();
       for(Preguntas otro: otramas){
           res.add(otro);
       }
       */
       i=Cuestonario.incr;
       return "mostrarcom";
   }
}
