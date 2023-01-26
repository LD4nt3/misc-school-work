/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import entidades.Preguntas;
import java.util.ArrayList;
import modelo.Tot_preg;
/**
 *
 * @author DELL INSP15
 */
public class Pregunta {
    public static String preg;
    public static int tipo;
    ArrayList<Preguntas> pr= new ArrayList<Preguntas>();
    
    public void insertapreg(String pre){
        this.preg=pre;
    }
    
    public void insertipo(int t){
        this.tipo=t;
    }
}
