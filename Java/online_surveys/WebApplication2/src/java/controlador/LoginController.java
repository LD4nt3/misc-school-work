/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Usuarios;
import entidades.Encuesta;
import conexion.conexion;
import java.util.ArrayList;
import java.util.List;
import modelo.login;

/**
 *
 * @author DELL INSP15
 */
@Named(value = "loginController")
@ApplicationScoped
public class LoginController {
    Usuarios us;
    public LoginController() {
    }
    public Usuarios getSelected(){
       if(us==null){
           us=new Usuarios();
       }
    return us;
   }  
    public String validar(){
        String contra="", nombre="";
        int id=0;
        
        conexion conect= new conexion();
       List<Usuarios> resp=conect.us_consulta(us.getUsuario(), us.getContraseña());
        if(resp.size()<=0){
            return "index";
        }
        else{
            for(Usuarios u:resp){
                contra=u.getContraseña();
                nombre=u.getUsuario();
                id=u.getIdUsuario();
            }
            login.contrasena=contra;
            login.nombre=nombre;
            login.id=id;
            
            us.setContraseña(contra);
            us.setUsuario(nombre);
            us.setIdUsuario(id);
            
            return "principal";
        }
    }
    
}
