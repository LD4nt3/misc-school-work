/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjunto;

/**
 *
 * @author usuario
 */
public class Primos {
    public static boolean primo(int numer) {
        int p = 0;
        for (int i = 2; i <= numer / 2; i++) {
            if (numer % i == 0) {
               p = 0;
                break;
            } else {
                p = 1;
            }
        }
        if (p == 1) 
            return true;
        else
        return false;
   
    }
     public static boolean primop(int numer){
         int div = 0;
        int t=0;
        int j=0;
        int[] anArray;
        anArray = new int[200];

        for (int i = 1; i <= numer / 2; i++) {
            if (numer % i == 0) {
                div = numer/i;
                anArray[j] = div;
                j++;
            }
        }
        
         for (int i = 1; i <= numer / 2; i++) {
             t=t +anArray[i];
         }
         t++;
        // TODO code application logic here
    if (t == numer) 
        return true;
    else 
       return false;
    
     }
    
}
