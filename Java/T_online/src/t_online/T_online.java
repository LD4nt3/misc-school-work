/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_online;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

//try catch?vscode
//mouse hover key salir con esc comprar con enter?    focus?,color en combox regex en compra? 


/**
 *
 * @author che_d
 */
public
class T_online extends JFrame implements ActionListener
{   public 
           static  Map<Integer, JButton> JB_producto = new HashMap<Integer, JButton>();
    public
           static  Map<Integer, Integer> Cant_= new HashMap<Integer, Integer>();

    public 
           static  int id=0;


public JButton bt1;
public JTextField campoTxt1;

public
	JMenuBar barra;
public
	JLabel etiqueta,bns;
public
	JMenu menu1;
public
	JMenuItem op1, op2, op3;


public
	T_online()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Tienda ");
		
                barra = new JMenuBar();
		setJMenuBar(barra);
		
                menu1 = new JMenu("Departamentos y carrito:");
             
                barra.add(menu1);
		
                
		op1 = new JMenuItem("Electronicos");
		op2 = new JMenuItem("Ropa");//640
                op3 = new JMenuItem("Carrito");
                
              
		menu1.add(op1);
		menu1.add(op2);
                menu1.add(op3);
                
              

	      bns = new JLabel("Nuevo titulo:");
              add(bns);
              Font fuente = new Font("Arial", Font.BOLD, 22); 
              bns = new JLabel("<html>Bienvenidos <br> a la tienda!</html>");
              bns.setBounds(140,20,300,200);
              bns. setFont(fuente); 
              bns.setForeground(new Color(71,224,204));
              add(bns); 

                bt1= new JButton("Confirmar");
                add(bt1);
                bt1.setFocusPainted(false);
                
                campoTxt1= new JTextField();
                add(campoTxt1);
                
                bt1.addActionListener(this);
          
                	
                op1.addActionListener(this);
		op2.addActionListener(this);
		op3.addActionListener(this);
                
	
        }
   public
	static void main(String[] args)
	{
		T_online ventana;
		ventana = new T_online();
		ventana.setBounds(200, 200, 420, 400);
		ventana.setVisible(true);
	}

	@Override public void actionPerformed(ActionEvent e)
	{           //tam
		    if(e.getSource()==op1)
                    {
                        Electronicos pop;
                        pop=new Electronicos();
                        pop.setBounds(400, 300, 900, 350);
                        pop.setVisible(true);
                    }
                    if(e.getSource()==op2)
                    {
                        Ropa pop;
                        pop=new Ropa();
                        pop.setBounds(400, 300, 630, 350);
                        pop.setVisible(true);

                    }
                       if(e.getSource()==op3)
                    {   Carrito pop;
                        pop=new Carrito();
                        pop.setBounds(400, 300, 600, 350);
                        pop.setVisible(true);
                        
                    }
                    //color
        }          
               
}