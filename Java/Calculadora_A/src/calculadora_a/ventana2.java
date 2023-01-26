/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_a;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author che_d
 */
public class ventana2 extends JFrame implements ActionListener {

    public JTextField TxbRes = new JTextField("");
    String text = "";
    private JButton boton0 = new JButton("0");
    private JButton boton1 = new JButton("1");
    private JButton boton2 = new JButton("2");
    private JButton boton3 = new JButton("3");
    private JButton boton4 = new JButton("4");
    private JButton boton5 = new JButton("5");
    private JButton boton6 = new JButton("6");
    private JButton boton7 = new JButton("7");
    private JButton boton8 = new JButton("8");
    private JButton boton9 = new JButton("9");

    private JButton boton10 = new JButton("+");
    private JButton boton11 = new JButton("-");
    private JButton boton12 = new JButton("*");
    private JButton boton13 = new JButton("/");
    private JButton boton14 = new JButton("=");
    private JButton botonC = new JButton("C");

    public ventana2() {
        // super("Ejemplo de ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GroupLayout orden = new GroupLayout(this.getContentPane());

        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);

        orden.setHorizontalGroup(
                orden.createParallelGroup()
                        .addComponent(TxbRes, 227, 227, 227)
                        //.addgroup imaginario
                        .addGroup(
                                orden.createSequentialGroup()
                                        .addGroup(
                                                orden.createParallelGroup()
                                                        .addComponent(boton7)
                                                        .addComponent(boton4)
                                                        .addComponent(boton1)
                                                        .addComponent(boton0)
                                        ).addGroup(//incio paralelo!
                                                orden.createParallelGroup()
                                                        .addGroup(
                                                                orden.createSequentialGroup()
                                                                        .addGroup(
                                                                                orden.createParallelGroup()
                                                                                        .addComponent(boton8)
                                                                                        .addComponent(boton5)
                                                                                        .addComponent(boton2)
                                                                        )
                                                                        .addGroup(
                                                                                orden.createParallelGroup()
                                                                                        .addComponent(boton9)
                                                                                        .addComponent(boton6)
                                                                                        .addComponent(boton3)
                                                                        )
                                                                        .addGroup(
                                                                                orden.createParallelGroup()
                                                                                        .addGroup//GRUPO SECUENCIAL
                                                                                        (
                                                                                                orden.createSequentialGroup()
                                                                                                        .addGroup(
                                                                                                                orden.createParallelGroup()
                                                                                                                        .addComponent(boton10)
                                                                                                                        .addComponent(boton12)
                                                                                                        )
                                                                                                        .addGroup(
                                                                                                                orden.createParallelGroup()
                                                                                                                        .addComponent(boton11)
                                                                                                                        .addComponent(boton13)
                                                                                                        )
                                                                                        ).addComponent(boton14, 85, 85, 85)
                                                                        )
                                                        ).addComponent(botonC, 182, 182, 182)
                                        )
                        )
        );

        orden.setVerticalGroup(
                orden.createSequentialGroup()
                        .addComponent(TxbRes)
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton7)
                                        .addComponent(boton8)
                                        .addComponent(boton9)
                                        .addComponent(boton10)
                                        .addComponent(boton11)
                        )
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton4)
                                        .addComponent(boton5)
                                        .addComponent(boton6)
                                        .addComponent(boton12)
                                        .addComponent(boton13)
                        )
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton1)
                                        .addComponent(boton2)
                                        .addComponent(boton3)
                                        .addComponent(boton14)
                        )
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton0)
                                        .addComponent(botonC)
                        )
        );
        setLayout(orden);
        this.pack();
        inicia();
    }//  TxbRes.setText(aNewText puede ser una string);   

    void inicia() {

        this.setSize(280, 207);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculadora");

        this.getContentPane().setBackground(Color.blue);

        this.setLayout(null);
   boton0.addActionListener(this);
         boton1.addActionListener(this);
            boton2.addActionListener(this);
         boton3.addActionListener(this);
            boton4.addActionListener(this);
   boton5.addActionListener(this);
         boton6.addActionListener(this);
            boton7.addActionListener(this);
         boton8.addActionListener(this);
            boton9.addActionListener(this);
  boton10.addActionListener(this);
  boton11.addActionListener(this);
    boton12.addActionListener(this);
      boton13.addActionListener(this);
        boton14.addActionListener(this);
    botonC.addActionListener(this);
        /*   
        mitex = new JTextField("ayudame estoy sufriendo esto no es un meme");
        mitex.setSize(1000, 60);
        mitex.setLocation(60, 300);
        this.add(mitex);
         */
    }
   @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton0) {
            text = text + "0";
            TxbRes.setText(text);
        } else if (e.getSource() == boton1) {
            text = text + "1";
            TxbRes.setText(text);
        } else if (e.getSource() == boton2) {
            text = text + "2";
            TxbRes.setText(text);
        } else if (e.getSource() == boton3) {
            text = text + "3";
            TxbRes.setText(text);
        } else if (e.getSource() == boton4) {
            text = text + "4";
            TxbRes.setText(text);
        } else if (e.getSource() == boton5) {
            text = text + "5";
            TxbRes.setText(text);
        } else if (e.getSource() == boton6) {
            text = text + "6";
            TxbRes.setText(text);
        } else if (e.getSource() == boton7) {
            text = text + "7";
            TxbRes.setText(text);
        } else if (e.getSource() == boton8) {
            text = text + "8";
            TxbRes.setText(text);
        } else if (e.getSource() == boton9) {
            text = text + "9";
            TxbRes.setText(text);
        } else if (e.getSource() == boton10) {
            text = text + "+";
            TxbRes.setText(text);
        } else if (e.getSource() == boton11) {
            text = text + "-";
            TxbRes.setText(text);
        } else if (e.getSource() == boton12) {
            text = text + "*";
            TxbRes.setText(text);
        } else if (e.getSource() == boton13) {
            text = text + "/";
            TxbRes.setText(text);
        } else if (e.getSource() == boton14) {
                    text = TxbRes.getText();
                    int Op = 0, Op2 = 0, Opval = 1, j = 0, haz = 0, err = 0;
                    int a[] = new int[4];

                    //String[] datoS = text.split("[ ]+");
                    for (int i = 0; i < text.length(); i++) {
                        Op = text.charAt(i);
                        if (i < text.length() - 1) {
                            Op2 = text.charAt(i + 1);
                        }

                        //char ch2 = text.charAt(i+1);//try catch menor a text.length calculadora recursivadd a +b + errorrrll
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
                              text = R.getA()+"/"+R.getX()+"+"+R.getiA()+"i"+"/"+R.getX();
                        TxbRes.setText(text);  
                          }
                          else
                          {
                        text = R.getA()+"+"+R.getiA()+"i";
                        TxbRes.setText(text);  
                          }
                    
                    //contador de (- y +) y la operacionconvertir a int
                    //TxbRes.setText(getValue); 
                    //System.out.println(getValue);
                
        } else if (e.getSource() == botonC) {
                    text = "";
                    TxbRes.setText(text);
        }
    }
}
