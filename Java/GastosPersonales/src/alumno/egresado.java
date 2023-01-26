/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;
//cetiworker

public class egresado extends Alumno {
    private int horas,sueldo;
    private String area;
    
    public egresado() {
        super("0", "0", "0", 0, 0);
        horas=0;
        sueldo=0;
        area="0";
    }
    	public void setSue(int e){
	sueldo=e;
	}
        public int getSue(){
	return sueldo;
	}
        public void setHor(int e){
	horas=e;
	}
        public int getHor(){
	return horas;
	}
       public void setAre(String e){
	area=e;
	}
        public String getAre(){
	return area;
	}
    
}
