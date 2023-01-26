/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_online;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static t_online.T_online.Cant_;
import static t_online.T_online.JB_producto;
import static t_online.T_online.id;

//articulo, descripcion,precio,cantidad, maximo 10 articulos,crrerar vista compra
//checkbox oxxo 7ven etc,excepcioones,color combo elegir?,popup.mouse key.focus, menus submenus carrazo?
//combo.boton.textarea.etiquetas

/**
 *
 * @author che_d
 */

public class Electronicos extends JFrame implements  ActionListener
{
        

public
	JLabel et1, et2, et3, et4,et5,et6;
public
        JSpinner cant,cant2,cant3,cant4,cant5,cant6; 

public
	JButton car1,car2,car3,car4,car5,car6;

public
	JComboBox<String>   color, corte, talla,c_camisa, manga,zapatos, calceta,tallaz; 
 public JScrollPane scroll;
public
	Electronicos()
	{
		setLayout(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE );
		et1 = new JLabel("<html>Computadora(PC): Z32T <br> Descripcion: <br> PC Gamer Xtreme<br> Nvidia GeForce GTX 1050 TI<br> Intel I5<br> 8GB 1TB HDD RGB<br>Precio: 18mil$</html>");
		et1.setBounds(5, 5, 130, 140);
		add(et1);
                cant = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant.setBounds(90, 170, 50, 40);
                add(cant);
                
		et2 = new JLabel("<html>Laptop: Asus X571GD <br> Descripcion: <br> 15.6 pulgadas <br>Intel i5 8GB RAM 1 TB HDD <br> Nvidia GeForce GTX 1050 <br>Precio: 15mil$</html>");
		et2.setBounds(145, 5, 130, 140);
		add(et2);
                      cant2 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant2.setBounds(240, 170, 50, 40);
                add(cant2);
		et3 = new JLabel("<html>Celular: Iphone 11 Pro<br> Descripcion: <br> 256 GB de alamacenamiento 4GB ram <br>Precio: 20mil$</html>");
		et3.setBounds(295, 5, 130, 140);
		add(et3);
                 cant3 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant3.setBounds(380, 141, 50, 40);
                add(cant3);
                et4 = new JLabel("<html>Television: LG<br> Descripcion: <br>  Pantalla OLED 55'' 4K<br> modelo: OLED55C9PUA <br>Precio: 35mil$</html>");
		et4.setBounds(445, 5, 130, 140);
		add(et4);
                
                cant4 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant4.setBounds(530, 141, 50, 40);
                add(cant4);
                
                et5 = new JLabel("<html>Monitor: Alienware <br> Descripcion: <br> Monitor de gaming FreeSync LED FHD de 25''<br> modelo: AW2518HF <br>Precio: 7mil$ </html>");
		et5.setBounds(583, 5, 130, 140);
		add(et5);
                 cant5 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant5.setBounds(666, 150, 50, 40);
                add(cant5);
                et6 = new JLabel("<html>Impresora: Epson L5190<br> Descripcion: <br> Impresora Multifuncional EcoTank <br>Inyección tinta color <br>Precio: 4mil$</html>");
		et6.setBounds(748, 5, 130, 140);
		add(et6);
                 cant6 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant6.setBounds(830, 150, 50, 40);
                add(cant6);
                
                car1 = new JButton("<html>Agregar <br> al carro</html>");
		car1.setBounds(5, 165, 80, 45);
		add(car1);   
                
	                
                car2 = new JButton("<html>Agregar <br> al carro</html>");
		car2.setBounds(145, 165, 80, 45);
		add(car2);   

		
                car3 = new JButton("<html>Agregar <br> al carro</html>");
		car3.setBounds(295, 135, 80, 45);
		add(car3);   


		
                
                car4 = new JButton("<html>Agregar <br> al carro</html>");
		car4.setBounds(445, 135, 80, 45);
		add(car4);   

		   car5 = new JButton("<html>Agregar <br> al carro</html>");
		car5.setBounds(583, 145, 80, 45);
		add(car5);   

                   car6 = new JButton("<html>Agregar <br> al carro</html>");
		car6.setBounds(748, 145, 80, 45);
		add(car6);   

		car1.addActionListener(this);
		 car2.addActionListener(this);
		car3.addActionListener(this);
		car4.addActionListener(this);
                car5.addActionListener(this);
		car6.addActionListener(this);
	} //end constructor

public
	void actionPerformed(ActionEvent accion)
	{
		id+=1;
                int d;
                if(JB_producto.size()<10){
		if (accion.getSource() == car1) 
		{      d=(Integer)cant.getValue();
			String datos="<html><div style=\"color:red\">X</div>Computadora:<br>(PC) Z32T <br>Cantidad: "+d+"<br>Precio:<br> $18000</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                Cant_.put(id,(Integer)cant.getValue());

                    }
		if (accion.getSource() == car2) 
		{       d=(Integer)cant2.getValue();
			String datos="<html><div style=\"color:red\">X</div> Laptop:<br> Asus X571GD<br>Cantidad: "+d+" <br> Precio:<br> $15000</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                Cant_.put(id,(Integer)cant2.getValue());

                    }
                    	if (accion.getSource() == car3) 
		{       d=(Integer)cant3.getValue();
			String datos="<html><div style=\"color:red\">X</div> Celular:<br>Iphone 11 Pro<br>Cantidad: "+d+" <br> Precio:<br> $20000</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                Cant_.put(id,(Integer)cant3.getValue());

                    }
                        	if (accion.getSource() == car4) 
		{       d=(Integer)cant4.getValue();
			String datos="<html><div style=\"color:red\">X</div> TV-OLED LG:<br>55C9PUA<br>Cantidad: "+d+" <br> Precio:<br> $35000</html>";		
                                               Cant_.put(id,(Integer)cant4.getValue());

                        JB_producto.put(id,new JButton(datos));
                    }
		if (accion.getSource() == car5) 
		{       d=(Integer)cant5.getValue();
			String datos="<html><div style=\"color:red\">X</div> Monitor: Alienware <br> AW2518HF<br>Cantidad: "+d+" <br> Precio:<br> $7000</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                Cant_.put(id,(Integer)cant5.getValue());

                    }
                        	if (accion.getSource() == car6) 
		{       d=(Integer)cant6.getValue();
			String datos="<html><div style=\"color:red\">X</div> Impresora:<br>Epson L5190<br>Cantidad: "+d+" <br> Precio:<br> $4000</html>";
                    
                        Cant_.put(id,(Integer)cant6.getValue());
                        JB_producto.put(id,new JButton(datos));
                    }
                }        else
                    JOptionPane.showMessageDialog(null, "Carrito lleno maximo 10 articulos diferentes");
	} 


}
