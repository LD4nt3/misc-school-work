/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_p3;

/**
 *
 * @author che_d
 */
import java.util.Scanner;
import javax.swing.*; 
import java.awt.event.*;

public class Calc_p3 extends JFrame implements ActionListener {

public JLabel v1, v2, igual, resultado, resu;
public JButton suma, resta, mul, div, cerrar;
public JTextField c_v1, c_v2;

public Calc_p3(){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);

v1= new JLabel("Variable 1" );
v1.setBounds(50,0,100,25);
add(v1);

v2= new JLabel("Variable 2" );
v2.setBounds(50,60,100,25);
add(v2);

igual = new JLabel("=");
igual.setBounds(50,135,100,25);
add(igual);

resultado= new JLabel("Resultado");
resultado.setBounds(50,115,100,25);
add(resultado);

resu= new JLabel("0");
resu.setBounds(60,135,100,25);
add(resu);


//Botones

suma= new JButton ("Suma");
suma.setBounds (50,170,100,25);
add(suma);

resta= new JButton ("Resta");
resta.setBounds (50,200,100,25);
add(resta);

mul= new JButton ("Multiplicacion");
mul.setBounds (160,170,120,25);
add(mul);

div= new JButton ("Division");
div.setBounds (160,200,100,25);
add(div);

c_v1= new JTextField();
c_v1.setBounds(50,30,150,25);
add (c_v1);

c_v2= new JTextField();
c_v2.setBounds(50,90,150,25);
add (c_v2);

suma.addActionListener(this);
resta.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
} 

public void actionPerformed( ActionEvent accion){
   float x, y, res;
   if(accion.getSource()==suma){
      x = Float.parseFloat(c_v1.getText());
      y = Float.parseFloat(c_v2.getText());
      res=x+y;
      String re= Float.toString(res);
      resu.setText(re);
  }
  if(accion.getSource()==resta){
     x = Float.parseFloat(c_v1.getText());
     y = Float.parseFloat(c_v2.getText());
     res=x-y;
     String re= Float.toString(res);
     resu.setText(re);
 }
 if(accion.getSource()==mul){
    x = Float.parseFloat(c_v1.getText());
    y = Float.parseFloat(c_v2.getText());
    res=x*y;
    String re= Float.toString(res);
    resu.setText(re);
}
if(accion.getSource()==div){
   x = Float.parseFloat(c_v1.getText());
   y = Float.parseFloat(c_v2.getText());
   res=x/y;
   String re= Float.toString(res);
   resu.setText(re);
 }

}

public static void main(String[] args) {
  Calc_p3 cal;

  cal= new Calc_p3 ();
  cal.setBounds(200,200,400,300);
  cal.setVisible(true);
}


}
