/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjunto;

import static conjunto.Primos.primo;
import static conjunto.Primos.primop;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuario
 */
public class Conjunto {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);
        System.out.println("Selecione una opcion: \n 1.Numero primo \n 2.Numero primo perfecto \n 3.Operaciones con fracciones  \n 4.Operaciones con numeros coplejos\n ");
        int opcion = cin.nextInt();
        int numero = 0;
int randomNum = ThreadLocalRandom.current().nextInt(10000, 99999 + 1);
         System.out.println(randomNum);

         switch (opcion) {
            case 1:
                System.out.println("Ingrese su numero \n");
                numero = cin.nextInt();
                if (primo(numero) == true) {
                    System.out.println("El numero " + numero + " es primo");
                } else {
                    System.out.println("El numero " + numero + " no es primo");
                }
                break;

            case 2:
                System.out.println("Ingrese su numero \n");
                numero = cin.nextInt();
                if (primop(numero) == true) {
                    System.out.println("El numero " + numero + " es primo perfecto ");
                } else {
                    System.out.println("El numero " + numero + " no es primo perfecto");
                }

                break;

            case 3:
                System.out.println("Selecione una opcion: \n 1.Sumar  2.Restar \n 3.Multiplicar  4.Dividir \n ");
                int opcionF = cin.nextInt();
                Fraccion f1,
                 f2,
                 r;
                f1 = new Fraccion();
                r = new Fraccion();
                System.out.println("Ingrese el numerador de la 1era fraccion\n");
                f1.setFraccion1(cin.nextInt());
                System.out.println("Ingrese el denominador de la 1era fraccion \n");
                f1.setFraccion2(cin.nextInt());

                f2 = new Fraccion();
                System.out.println("Ingrese el numerador de la 2da fraccion\n");
                f2.setFraccion1(cin.nextInt());
                System.out.println("Ingrese el denominador de la 2da fraccion\n");
                f2.setFraccion2(cin.nextInt());

                r.setFraccion1(0);
                r.setFraccion2(0);

                switch (opcionF) {

                    case 1:
                        r = r.suma(f1, f2);
                        System.out.println(r.getN());
                        System.out.println("/");
                        System.out.println(r.getD());
                        break;
                    case 2:
                        r = r.resta(f1, f2);
                        System.out.println(r.getN());
                        System.out.println("/");
                        System.out.println(r.getD());
                        break;
                    case 3:
                        r = r.multiplicacion(f1, f2);
                        System.out.println(r.getN());
                        System.out.println("/");
                        System.out.println(r.getD());
                        break;
                    case 4:
                        r = r.division(f1, f2);
                        System.out.println(r.getN());
                        System.out.println("/");
                        System.out.println(r.getD());
                        break;

                }

                break;

            case 4:
                System.out.println("Selecione una opcion: \n 1.Sumar  2.Restar \n 3.Multiplicar  4.Dividir \n ");
                int opcion_F = cin.nextInt();
                Op_complejos g1,
                 g2,
                 R;
                R = new Op_complejos();
                g1 = new Op_complejos();

                System.out.println("Ingrese el numero del 1er termino\n");
                g1.setOp1(cin.nextInt());
                System.out.println("Ingrese el numero complejo\n");
                g1.setOp2(cin.nextInt());
                g1.setOp3(0);
                g2 = new Op_complejos();
                System.out.println("Ingrese el  numero del 2do termino\n");
                g2.setOp1(cin.nextInt());
                System.out.println("Ingrese el numero complejo\n");
                g2.setOp2(cin.nextInt());
                g2.setOp3(0);

                R.setOp1(0);
                R.setOp2(0);
                R.setOp3(0);
                switch (opcion_F) {

                    case 1:
                        R = R.suma(g1, g2);
                        System.out.println(R.getA());
                        System.out.println("+");
                        System.out.println(R.getiA());
                        System.out.println("i");
                        break;
                    case 2:
                        R = R.resta(g1, g2);
                        System.out.println(R.getA());
                           System.out.println("+");
                        System.out.println(R.getiA());
                        System.out.println("i");
                        break;
                    case 3:
                         
                        R = R.multiplicacion(g1, g2);
                        System.out.println(R.getA()+" + "+R.getiA()+"i");
                     
                        break;
                    case 4:
                        System.out.println("/n");
                        R = R.division(g1, g2);
                        System.out.println(R.getA());
                        System.out.println("/");
                        System.out.println(R.getiA());

                        System.out.println("+");
                        System.out.println(R.getX());
                        System.out.println("/");
                        System.out.println(R.getiA());
                        break;
                }

        }

    }
    
}
