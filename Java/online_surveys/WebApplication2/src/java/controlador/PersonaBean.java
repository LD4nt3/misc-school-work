/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import entidades.Usuarios;
import conexion.conexion;
/**
 *
 * @author DELL INSP15
 */
@Named(value = "personaBean")
@ApplicationScoped
public class PersonaBean {

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }
    Usuarios e;
    private String nombre,contra;

    public Usuarios getSelected(){
        if(e==null){e=new Usuarios();}
        
    return e;
    }
    
    public String doGuardar(){
      conexion conect =new conexion();
      conect.c_us(e);
       return "index";
    }
}
