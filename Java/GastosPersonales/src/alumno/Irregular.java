/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author che_d
 */
public class Irregular extends Alumno {
    private String materia, justiifcacion;
    int calificacion;
    boolean titulo;//0 titulo 1 carta
    
    public Irregular() {
        super("0", "0", "0", 0, 0);
        materia="0";
        justiifcacion="0";
        calificacion=0;

    }
    public void setCal(int e){
	calificacion=e;
	}
        public int getCal(){
	return calificacion;
	}
        public void setMat(String e){
	materia=e;
	}
        public String getMat(){
	return materia;
	}
        public void setJus(String e){
	justiifcacion=e;
	}
        public String getJus(){
	return justiifcacion;
	}
}
