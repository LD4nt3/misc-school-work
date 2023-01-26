/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author che_d
 */
public class HASH {
  public int calcular(String X) {
        int K = 0, resultado = 0;
        for (int i = X.length() - 1; i >= 0; i--) {
            K += (X.charAt(i) - 95);

        }
        resultado = K % 30;
        if (resultado > 30) {
            resultado = 30;
        }
        if (resultado < 0) {
            resultado = 0;
        }
        return (resultado);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
         HASH R=new HASH();
        int y = 0, x = 0, resultado = 0;
        int arr[];
        arr = new int[900];//arreglo axuiliar
             Indice[] arrAX;
             arrAX=new Indice[30];
        for (int j = 0; j < 30; j++) {
                arrAX[j] = new Indice();
            }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String D = "";

        datos[][] arreglo;
        arreglo = new datos[30][];
        for (int i = 0; i < 30; i++) {
            arreglo[i] = new datos[30];
        }

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                arreglo[i][j] = new datos();
            }
        }
        while   (true){
        loop:   while (true) {
            System.out.println("Selecione una opcion: \n 1.Ingresar dato \n 2.Mostrar dato ");
            int opcion = cin.nextInt();
          switch (opcion) {
                case 1:
                      cin.nextLine();
                    System.out.println("Ingrese un nombre");
                    D= cin.nextLine();
                    resultado=R.calcular( D);
                    System.out.println(resultado);
                    for (int i = 0; (i < arr.length && arr[i] != -1); i++) {
                        
                        if (arr[i] == resultado) {
                         
                            y++;
                        }
                    }
                    
                    arreglo[resultado][y].x = D;
                    arr[x] = resultado;
                   arrAX[resultado].pos=y; //actualizo Y si es el mismo resultado(posicion) o le pongo valor
                
                   x++;
                    
                    y = 0;

                    break loop;
                case 2:
                    cin.nextLine();
                    System.out.println("Ingrese el dato a buscar");
                    D=cin.nextLine();
                     resultado=R.calcular( D);
                    
                     if (arreglo[resultado][ arrAX[resultado].pos].x.equals(D))
                      System.out.println("El dato fue encontrado con exito en ["+resultado+"]"+"["+arrAX[resultado].pos+"]");
                     else
                        System.out.println("No se encontro");
                     }
                    break loop;
            }
       }
    }
   }

