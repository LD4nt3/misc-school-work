/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_online;

import java.awt.Color;
import java.awt.Point;
import java.util.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.HashMap;
import javax.swing.JOptionPane;
import static t_online.T_online.Cant_;
import static t_online.T_online.JB_producto;
/**
 *
 * @author che_d
 */

public class Carrito extends JFrame implements ActionListener, KeyListener, FocusListener, MouseListener{
                     public   javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK);
public
	JTextArea T_area;
public JLabel  nom ,dom ,fon,car,tpago,thot,peso;
public JTextField nombre, domiclio, tel,tot;
 public JScrollPane scroll;
 public JRadioButton tarjeta,oxxo, seven, efectivo;
 public ButtonGroup grupoOpciones;
 public
	JButton compra,bt1,bt2;
 
 public 
         int total,one=0;

public Carrito(){
                setLayout(null);
                setTitle("Carro"); 
                setDefaultCloseOperation(DISPOSE_ON_CLOSE );
               
                car = new JLabel("Carro:");
		car.setBounds(325, 18, 150, 15);
		add(car);
                
                T_area = new JTextArea("");
                scroll = new JScrollPane(T_area);
                scroll.setBounds(325, 35, 250, 200);	
                add(scroll);
                T_area.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
                
                String ss;
                int x=10,j=1;
                
                    for (int i : JB_producto.keySet()) {
                        ss=T_area.getText();
                     T_area.setText(ss+" \n\n\n\n\n\n\n\n\n\n\n ");
                        String str; 
                        str= JB_producto.get(i).getText();
                        String[] arra;
                        arra = str.split("\\$|</html>");
                        
                        total=total+Cant_.get(i)*Integer.parseInt(arra[1]);
                        
                       JB_producto.get(i).setBounds(10, x, 105, 160);
                       T_area.add(JB_producto.get(i));
                       JB_producto.get(i).addActionListener(this);
                        x= j*(JB_producto.get(i).getHeight()+20);
                        j++;
                     }
                		T_area.setEditable(false);

                thot = new JLabel("Subtotal:");
		thot.setBounds(325, 250, 150, 25);
		add(thot);
                
                tot = new JTextField();
		tot.setBounds(380, 250, 150, 25);
		add(tot);
                
                tot.setText(Integer.toString(total)); 
                tot.setEditable(false);
                
                peso = new JLabel("$");
		peso.setBounds(535, 250, 25, 25);
		add(peso);
                
                compra = new JButton("ACEPTAR COMPRA");
		compra.setBounds(382, 284, 145, 20);
		add(compra);
                
                
         
                
                nom = new JLabel("Nombre");
		nom.setBounds(210, 25, 150, 25);
		add(nom);

		dom = new JLabel("Domicilio");
		dom.setBounds(210, 70, 150, 15);
		add(dom);

		fon = new JLabel("Telefono");
		fon.setBounds(210, 110, 150, 15);
		add(fon);
                
          
                
                
		nombre = new JTextField();
		nombre.setBounds(50, 25, 150, 25);
		add(nombre);

		domiclio = new JTextField();
		domiclio.setBounds(50, 70, 150, 25);
		add(domiclio);

		tel = new JTextField();
		tel.setBounds(50, 110, 150, 25);
		add(tel);
                
                tpago = new JLabel("Tipo de pago:");
		tpago.setBounds(20, 170, 150, 15);
		add(tpago);
                
                  grupoOpciones = new ButtonGroup();
                tarjeta = new JRadioButton("Tarjeta c/d");
                
                tarjeta.setBounds(20, 200, 95, 25);
                add(tarjeta); 
                grupoOpciones.add(tarjeta);



                oxxo = new JRadioButton("Oxxo");
                oxxo.setBounds(120, 260, 80, 25);
                add(oxxo); 
                grupoOpciones.add(oxxo);

                		

              
                seven = new JRadioButton("7ven");
                seven.setBounds(120, 200, 100, 25);
                add(seven); 
                grupoOpciones.add(seven);
	
                efectivo = new JRadioButton("Efectivo");
                efectivo.setBounds(20, 260, 100, 25);
                add(efectivo); 
                grupoOpciones.add(efectivo);
                compra.addActionListener(this);
                nombre.addKeyListener(this);
                dom.addKeyListener(this);
                tel.addKeyListener(this);
                tot.addKeyListener(this);
                        T_area.addKeyListener(this);
                        tarjeta.addKeyListener(this);
                        oxxo.addKeyListener(this);
                        seven.addKeyListener(this);
                        efectivo.addKeyListener(this);
                           nombre.addFocusListener(this);
                dom.addFocusListener(this);
                tel.addFocusListener(this);
                addMouseListener(this);
    } //Fin del Constructor

@Override public void actionPerformed(ActionEvent e)
            {   //regex update? y scroll
                int t=0;
                if(compra==e.getSource()){
                            t=compra(t);

                   }
                
             String ss;
             if(t==0)
                for (int i : JB_producto.keySet()) {
                                 
                   if(JB_producto.get(i)==e.getSource())
                       {Carrito pop;
                        String str; 
                        str= JB_producto.get(i).getText();
                        String[] arra;
                        arra = str.split("\\$|</html>");
                        total=total-Cant_.get(i)*Integer.parseInt(arra[1]);
                        JB_producto.get(i).setVisible(false);
                        JB_producto.remove(i);
                        Cant_.remove(i);
                        ss=T_area.getText();
                        this.dispose();
                        pop=new Carrito();
                        pop.setBounds(400, 300, 600, 350);
                        pop.setVisible(true);
                         break;
                       }
                   }            

           }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyChar()==10)
        compra(0);
  
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
     if (e.getSource() == nombre)
		{
			String[] StrArra = (nombre.getText()).split(" ");
			for (String a : StrArra)
			{
				System.out.println(a);
				if (a.matches(".*\\d.*") == true || a.matches(".*\\W.*") == true){
                                    nombre.setText("");
                                    JOptionPane.showMessageDialog(null, "Ingreso caracter invialido");
                                            }
                        }
		}
            
                if (e.getSource() == tel)
		{
			String[] StrArra = (tel.getText()).split(" ");
			for (String a : StrArra)
			{
				System.out.println(a);
				if (a.matches(".*\\D.*") == true)
                                {   
                                    tel.setText("");
                                    JOptionPane.showMessageDialog(null, "Ingreso caracter invialido");
                                }
		}          } 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(one!=1)
        JOptionPane.showMessageDialog(null, "Bievenido al carrito! \n Para eliminar un articulo del carrito dele click al articulo mostrado \n Puede tambien finalizar al compra usando la tecla de enter");    
        one=1;
        }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private int compra(int t) {
        if("".equals(nombre.getText())){
                                             JOptionPane.showMessageDialog(null, "No lleno el nombre");
                t=1;}
                
                if("".equals(tel.getText())){
                      JOptionPane.showMessageDialog(null, "No lleno el telefono");
                t=1;}
                
                if("".equals(domiclio.getText())){
                    JOptionPane.showMessageDialog(null, "No lleno el domicilio");
                 t=1;}
                
                if(efectivo.isSelected()||seven.isSelected()||oxxo.isSelected()||tarjeta.isSelected())
                    ;else
                {   
                    JOptionPane.showMessageDialog(null, "No seleciono metodo de pago");
                  t=1;              
                } 
                   if(t!=1)
                   if("0".equals(tot.getText()))
                    JOptionPane.showMessageDialog(null, "No hay nada por comprar");
                   else{
                    JOptionPane.showMessageDialog(null, "Gracias por comprar");
                       JB_producto.clear();
                       Cant_.clear();
                       total=0;
                      // id=0;
                       this.dispose();
                       t=1;
                   }
                   return t;
    }
}

