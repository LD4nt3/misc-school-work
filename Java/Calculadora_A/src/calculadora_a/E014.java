/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author che_d
 */
public class E014 implements ActionListener {
      public JTextField TEXT = new JTextField();

       @Override
            public void actionPerformed(ActionEvent e) {
                       String TXT = TEXT.getText();
                    int Op = 0, Op2 = 0, Opval = 1, j = 0, haz = 0, err = 0;
                    int a[] = new int[4];

                    //String[] datoS = TXT.split("[ ]+");
                    for (int i = 0; i < TXT.length(); i++) {
                        Op = TXT.charAt(i);
                        if (i < TXT.length() - 1) {
                            Op2 = TXT.charAt(i + 1);
                        }

                        //char ch2 = TXT.charAt(i+1);//try catch menor a TXT.length calculadora recursivadd a +b + errorrrll
                        //4+5-+-4+5
                        if (Op < 48) {
                            if (Op == 45)//-
                            {
                                Opval = Opval * -1;
                            }

                            /*
                   if(j!=2){
         if (Op != 45 &&Op != 43)
                   error=1;
                   }
                             */
                        } else {

                            a[j] = a[j] * 10 + (Op - 48);
                            if (Op2 < 48) {

                                a[j] = a[j] * Opval;
                                j++;
                                Opval=1;
                                if (j == 2) {
                                    if (Op2 == 43)//+
                                    { 
                                        haz = 1;
                                    }
                                    if (Op2 == 45)//-
                                    {
                                      Opval=-1;
                                        haz = 2;
                                    }
                                    if (Op2 == 42)//*
                                    {
                                        haz = 3;
                                    }
                                    if (Op2 == 47)//%
                                    {
                                        haz = 4;
                                    }
                                    
                                }
                            }
                        }

                    }
                    a[j] = a[j] * Opval;
                    /*
                    for (int i = 0; i < 4; i++) {
                        System.out.println(a[i]);
                    }*/
                    Imagine_ops R;
                    R = new Imagine_ops();
                    if (haz == 1) {
                        R = R.suma(a);
                    }
                    if (haz == 2) {
                        R = R.resta(a);
                    }
                    if (haz == 3) {
                        R = R.multiplicacion(a);
                    }
                    if (haz == 4) {
                        R = R.division(a);
                    }/*
                    System.out.println(R.getA());

                    System.out.println("+");
                    System.out.println(R.getiA());
                    System.out.println("i");
*/
                   
                          if (haz == 4){
                              TXT = R.getA()+"/"+R.getX()+"+"+R.getiA()+"i"+"/"+R.getX();
                        TEXT.setText(TXT);  
                          }
                          else
                          {
                        TXT = R.getA()+"+"+R.getiA()+"i";
                        TEXT.setText(TXT);  
                          }
                    }
 
            
    
}
