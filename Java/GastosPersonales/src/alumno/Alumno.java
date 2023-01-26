package alumno;

import java.util.Scanner;


public class Alumno
{	
	String nombre;
	int promedio;
	String domicilio;
	long registro;
	String carrera;
        int semestre;
	
	public Alumno(String m,String n,String d,int e, long t){
	promedio=e;
	nombre=n;
	domicilio=d;
	registro=t;
	promedio=e;
	carrera=m;
	}
	
	public void setCar(String m){
	carrera=m;
	}
	
	public void setNombre(String n){
	nombre=n;
	}	
	
	public void setDomicilio(String d){
	domicilio=d;
	}
	public void setEdad(int e){
	promedio=e;
	}
	public void setSem(int e){
	semestre=e;
	}
        public int getSem(){
	return semestre;
	}
	public void setReg(long t){
	registro=t;
	}
	public String getCar(){
	return carrera;
	}
	
	public String getNombre(){
	return nombre;
	}	
	
	public String getDomicilio(){
	return domicilio;
	}
	public int getEdad(){
	return promedio;
	}
	
	public long getReg(){
	return registro;
	}


public static void main(String[] args)
        
  {	Scanner entrada = new Scanner(System.in);
	int opc;
        String d,n,m;
	int e;
	long t;
	Alumno pers=new Alumno("0","dante","por ahi",21,0000);
	pers.setDomicilio("por aca");  
 	pers.setReg(15559475);

	e=pers.getEdad();
  	t=pers.getReg();
	n=pers.getNombre();
	m=pers.getCar();
	d=pers.getDomicilio();

	
  
        
        do{	
		System.out.printf("Opciones:\n 1.Mostrar datos \n 2.Retiros \n 3.Depositos \n 4.Salir\n ");		
		System.out.printf("Ingresa la opcion\n ");	
		opc = entrada.nextInt();
		
		switch(opc){
		case 1:
		e=cuenta.getEdad();
  		t=cuenta.getTel();
		n=cuenta.getNombre();
		m=cuenta.getMail();
		d=cuenta.getDomicilio();
		saldo_ac=cuenta.getSaldo();
		System.out.printf("Hola: %s \n",n);  
		System.out.printf("Tu telefono es: %d \n",t);
		System.out.printf("Tienes: %d años \n",e);
		System.out.printf("Tu domicilio es: %s \n",d);
		System.out.printf("Tu email es: %s \n",m);
		System.out.printf("Tienes: %d pesos \n",saldo_ac);
		break;

		case 2:
		
		System.out.println("\n Ingresa el valor a retirar");
		a=entrada.nextInt();
		saldo_ac=cuenta.getSaldo();
		
		if(saldo_ac>=a){
		saldo_ac-=a;
		cuenta.setSaldo(saldo_ac);
		}
		else
		System.out.println("\n Creditos insuficientes");

		saldo_ac=0;	
		break;

		case 3:
		saldo_ac=cuenta.getSaldo();
		System.out.println("\n Ingresa el valor a depositar");
		a=entrada.nextInt();
		saldo_ac+=a;
		cuenta.setSaldo(saldo_ac);
		saldo_ac=0;
		break;

                case 4:
		return;	
		default:	
		System.out.println("Opcion erronea");

		}
		
	}while(opc!=4);	
        
        
        
        
  
  }
}
