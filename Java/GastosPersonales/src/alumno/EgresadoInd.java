/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;
//cetiworker

public class EgresadoInd extends Alumno {
    private int salrio;
    private String empresa;
    
    
    public EgresadoInd() {
        super("0", "0", "0", 0, 0);
        salrio=0;
        empresa="0";
    }
    	public void setSal(int e){
	salrio=e;
	}
        public int getSal(){
	return salrio;
	}
       public void setEmp(String e){
	empresa=e;
	}
        public String getEmp(){
	return empresa;
	}
    
}
