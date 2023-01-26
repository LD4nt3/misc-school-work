package javabeans;
import conexion.conexion;
import entidades.Usuarios;


public class PersonaBean {
     Usuarios e;
    private String nombre,contra;
    public PersonaBean() {
    }
    public Usuarios getSelected(){
        if(e==null){e=new Usuarios();}
        
    return e;
    }
    
    public void doGuardar(){
      conexion conect =new conexion();
      conect.c_enc(e);
        
}
    
   private static long idCounter = 0;

public static synchronized String createID()
{
    return String.valueOf(idCounter++);
}    

    /*https://www.tutorialspoint.com/jsf/jsf_managed_beans.htm
    package javabeans;
import java.util.;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.;
import javax.faces.event.;
import javax.faces.component.;
import javax.inject.Named;
import javax.servlet.http.*;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Encuesta;
import entidades.Usuarios;
import conexion.conexion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.faces.bean.RequestScoped;


@ManagedBean
@Named(value = "encuestraController")
@ApplicationScoped

public class PersonaBean {
    @ManagedProperty(value = "#{message}")
   private Message messageBean;
   private String message;
}
    */
}