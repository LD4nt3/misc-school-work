/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Encuesta;
import entidades.Usuarios;
import entidades.Preguntas;
import modelo.Cuestonario;
import modelo.Tot_preg;
import modelo.Encuesta_term;
import controlador.LoginController;
import conexion.conexion;
import entidades.Opciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import modelo.Respuesta;
import modelo.login;

/**
 *
 * @author DELL INSP15
 */
@ManagedBean
@Named(value = "encuestraController")
@ApplicationScoped
public class EncuestraController {

   Encuesta e;
   int resp;
   short i=1;  
   int ii;
   Encuesta evc[]=new Encuesta[10];
   ArrayList<Preguntas> pr= new ArrayList<Preguntas>();
   ArrayList<Cuestonario> ArrayCuestion= new ArrayList<Cuestonario>();

    public ArrayList<Preguntas> getPr() {
        return pr;
    }

    public void setPr(ArrayList<Preguntas> pr) {
        this.pr = pr;
    }

    public ArrayList<Cuestonario> getArrayCuestion() {
        return ArrayCuestion;
    }

    public void setArrayCuestion(ArrayList<Cuestonario> ArrayCuestion) {
        this.ArrayCuestion = ArrayCuestion;
    }
  
   public Encuesta getSelected(){
       if(e==null){
           e=new Encuesta();
       }
    return e;
   }    
    public EncuestraController() {
        
    }
    
    
    @ManagedProperty("#{loginController}")
    private LoginController usu;
    
    public String crear_encuesta(){ 
        int id;
        short total;
        String nombre, contra, nombre_e;
        conexion conect= new conexion();
        
        Tot_preg.valuepreg=e.getNoPreguntas();
        Tot_preg.i=1;
        contra=login.contrasena;
        nombre=login.nombre;
        id=login.id;
        
        nombre_e=e.getNombre();
        total=e.getNoPreguntas();
        
        Usuarios us=new Usuarios();
        us.setContraseña(contra);
        us.setUsuario(nombre);
        us.setIdUsuario(id);
        
        int left=97;
        int right=122;
        int largo=19;
        Random random=new Random();
        StringBuilder buffer=new StringBuilder(largo);
        for(int z=0;z<largo; z++){
            int randomlimit=left +(int) (random.nextFloat()*(right-left+1));
            buffer.append((char) randomlimit);
        }
        String generado=buffer.toString();
        
        conect.c_enc(e, id, nombre, contra, generado);  
        
        List <Encuesta> resp=conect.enc_nueva(nombre_e, us , total);
        for (Encuesta en:resp){
            Encuesta_term.id=en.getIdEncuesta();
            Encuesta_term.nombre=en.getNombre();
            Encuesta_term.enlace=en.getEnlace();
            Encuesta_term.preg=en.getNoPreguntas();
            Encuesta_term.fk=login.id;
        }
        return "respuesta";
    }
    public String imprimir(){
        conexion conect= new conexion();
        Usuarios us=new Usuarios();
        us.setContraseña(login.contrasena);
        us.setUsuario(login.nombre);
        us.setIdUsuario(login.id);
        
        List<Encuesta> res=conect.look_enc(us, e.getNombre());
              if(res.size()>0){         
                for(Encuesta e2: res){
                  Encuesta_term.enlace=e2.getEnlace();
                  Encuesta_term.id=e2.getIdEncuesta();
                  Encuesta_term.nombre=e2.getNombre();
                  Encuesta_term.preg=e2.getNoPreguntas();
                  
                  e.setEnlace(e2.getEnlace());
                  e.setNoPreguntas(e2.getNoPreguntas());
                  e.setNombre(e2.getNombre());
                  e.setFkUsuario(us);
                  e.setIdEncuesta(e2.getIdEncuesta());
                }
                return "accion";
           }
              else{
                return "principal";
              }
    }
    public String eliminar(){   
      conexion conect = new conexion();
      Usuarios u= new Usuarios();
      u.setContraseña(login.contrasena);
      u.setIdUsuario(login.id);
      u.setUsuario(login.nombre);
      
      e.setEnlace(Encuesta_term.enlace);
      e.setFkUsuario(u);
      e.setNoPreguntas(Encuesta_term.preg);
      e.setIdEncuesta(Encuesta_term.id);
      e.setNombre(Encuesta_term.nombre);
      conect.c_del(e);      
      
      return "eliminado";
    }
    public String grafica(){   
            conexion conect = new conexion();
      Usuarios u= new Usuarios();
      u.setContraseña(login.contrasena);
      u.setIdUsuario(login.id);
      u.setUsuario(login.nombre);
      
      e.setEnlace(Encuesta_term.enlace);
      e.setFkUsuario(u);
      e.setNoPreguntas(Encuesta_term.preg);
      e.setIdEncuesta(Encuesta_term.id);
      e.setNombre(Encuesta_term.nombre);
      conect.grafica(e);    
      
      
      return "grafica";
    }
    
    public String v_cod(){
        conexion conect=new conexion();
        List<Preguntas> rp;
        List<Encuesta> enc=conect.look_enc(e.getEnlace());
        int v=enc.size();
        if(v<=0){
        return "principal";
        }
        else{
            int i=0;
            for(Encuesta ec:enc){
                Encuesta_term.enlace=ec.getEnlace();
                Encuesta_term.us=ec.getFkUsuario();
                Encuesta_term.id=ec.getIdEncuesta();
                Encuesta_term.nombre=ec.getNombre();
                Encuesta_term.preg=ec.getNoPreguntas();
                e=ec;
            }
            rp=conect.look_pregunta(e);
             int tamano=rp.size();
             Cuestonario.total=tamano;
             
             pr.clear();
             ArrayCuestion.clear();
             for(Preguntas preg: rp){
                 modelo.Respuesta.guardar(preg);
                 int var=preg.getFkTiporespuesta().getIdtipoResp();
                 Cuestonario c=new Cuestonario();
                 ArrayList<String> array=new ArrayList<String>();
                 array.clear();
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
            } 
                
        }
       /* return "index";
    }
    public String funcion(){
        return "encuesta";
    }*/
       ii=Cuestonario.incr;
       return "mostrar";
    }
}
