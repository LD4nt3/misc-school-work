/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DELL INSP15
 */
public class Tot_preg {
    public static int valuepreg;
    public static int i;
    public static String pregunta;
    public static String tipor;
   
    public static boolean seguir(){
    if(i<valuepreg){
        i++;
        return true;
        }else{
        return false;
    }
   }
    
    public static void tenerp(String pr){
        String array[];
        array=new String[valuepreg];
        array[i]=pr;
    }
}
