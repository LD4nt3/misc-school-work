/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_online;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import javafx.scene.layout.Border;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static t_online.T_online.Cant_;
import static t_online.T_online.JB_producto;
import static t_online.T_online.id;


/**
 *
 * @author che_d
 */

public class Ropa extends JFrame implements ItemListener, ActionListener
{
        

public
	JLabel et1, et2, et3, et4;
public
        JSpinner cant,cant2,cant3,cant4;

public
	JButton car1,car2,car3,car4;

public
	JComboBox<String>   color, corte, talla,c_camisa, manga,zapatos, calceta,tallaz; 
 public JScrollPane scroll;
public
	Ropa()
	{
		setLayout(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE );
		et1 = new JLabel("<html>Pantalon <br> Descripcion: <br> Bordado edicion limitada de mezclilla<br>Precio: 900$</html>");
		et1.setBounds(5, 5, 130, 90);
		add(et1);
                
		et2 = new JLabel("<html>Camisa <br> Descripcion: <br> Tipo polo importada<br>Precio: 700$</html>");
		et2.setBounds(145, 5, 130, 90);
		add(et2);

		et3 = new JLabel("<html>Calcetas <br> Descripcion: <br> Econyl 100% recicables<br>Precio: 110$</html>");
		et3.setBounds(275, 5, 130, 90);
		add(et3);
                
                et4 = new JLabel("<html>Zapatos<br>Descripcion: <br> yeezy boost 350<br>core black red<br>Precio: 3700$ </html>");
		et4.setBounds(420, 5, 130, 90);
		add(et4);
	
	
		
		//T_area.setEditable(false);
		//add(T_area);
		
	
		talla = new JComboBox<String>();
		talla.setBounds(5, 100, 80, 25);
		add(talla);
                	talla.setEditable(true);
		talla.setSelectedItem("Talla");
		talla.setEditable(false);

		talla.addItem("S\n");
		talla.addItem("M\n");
		talla.addItem("L\n");
		talla.addItem("XL\n");
	
		color = new JComboBox<String>();
		color.setBounds(5, 130, 80, 25);
		add(color);
                color.setEditable(true);
		color.setSelectedItem("Color");
		color.setEditable(false);
		color.addItem("Azul\n");
		color.addItem("Cafe\n");
                color.addItem("Blanco\n");
		color.addItem("Negro\n");

		corte = new JComboBox<String>();
		corte.setBounds(5, 160, 80, 25);
		add(corte);
		corte.addItem("Amplio\n");
                corte.addItem("Skinny\n");
		corte.addItem("Recto\n");
		corte.setEditable(true);
		corte.setSelectedItem("Corte");
		corte.setEditable(false);
                
                car1 = new JButton("<html>Agregar <br> al carro</html>");
		car1.setBounds(5, 195, 80, 45);
		add(car1);   
                cant = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant.setBounds(90, 200, 50, 40);
                add(cant);
		
                c_camisa = new JComboBox<String>();
		c_camisa.setBounds(145, 100, 80, 25);
		add(c_camisa);
		c_camisa.addItem("Azul\n");
                //.setBackground(new Color(0,0,255))
		c_camisa.addItem("Roja\n");
		c_camisa.addItem("Verde\n");
		c_camisa.setEditable(true);
		c_camisa.setSelectedItem("Color");
		c_camisa.setEditable(false);

		manga = new JComboBox<String>();
		manga.setBounds(145, 130, 80, 25);
		add(manga);
                	manga.setEditable(true);
		manga.setSelectedItem("Manga");
		manga.setEditable(false);
		manga.addItem("Corta\n");
		manga.addItem("3/4\n");
		manga.addItem("Larga\n");
                
                car2 = new JButton("<html>Agregar <br> al carro</html>");
		car2.setBounds(145, 165, 80, 45);
		add(car2); 
                cant2 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant2.setBounds(228, 170, 50, 40);
                add(cant2);

		calceta = new JComboBox<String>(); 
		calceta.setBounds(275, 100, 80, 25);
		add(calceta);
                calceta.setEditable(true);
		calceta.setSelectedItem("Genero");
		calceta.setEditable(false);
		calceta.addItem("Maculino\n");
		calceta.addItem("Femenino\n");
		
                car3 = new JButton("<html>Agregar <br> al carro</html>");
		car3.setBounds(282, 135, 80, 45);
		add(car3); 
                
                cant3 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant3.setBounds(365, 140, 50, 40);
                add(cant3);
                
                
		tallaz = new JComboBox<String>();
		tallaz.setBounds(420, 100, 90, 25);
		add(tallaz);
                tallaz.setEditable(true);
	
                tallaz.setSelectedItem("Talla(mx):");
		tallaz.setEditable(false);

		tallaz.addItem("4");
		tallaz.addItem("4.5");
		tallaz.addItem("5");
		tallaz.addItem("5.5");
                tallaz.addItem("6");
		tallaz.addItem("6.5");
		
                car4 = new JButton("<html>Agregar <br> al carro</html>");
		car4.setBounds(430, 135, 80, 45);
		add(car4);
                cant4 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
                cant4.setBounds(515, 140, 50, 40);
                add(cant4);

		
		car1.addActionListener(this);
                car2.addActionListener(this);
		car3.addActionListener(this);
		car4.addActionListener(this);

		talla.addItemListener(this);
		color.addItemListener(this);
		corte.addItemListener(this);
		c_camisa.addItemListener(this);
		manga.addItemListener(this);
		calceta.addItemListener(this);
	} //end constructor
public
	void itemStateChanged(ItemEvent accion)
	{if (accion.getSource() == c_camisa) 
		{
              String seleccion = c_camisa.getSelectedItem().toString();
              
              if(seleccion=="Azul\n")
              c_camisa.setBackground(new Color(0,0,255));
              
              if(seleccion=="Verde\n")
              c_camisa.setBackground(new Color(0,255,0));
                            
               if(seleccion=="Roja\n")
               c_camisa.setBackground(new Color(255,0,0));

                
                }
        if (accion.getSource() == color) 
		{
              String seleccion = color.getSelectedItem().toString();
              
              if(seleccion=="Azul\n")
              color.setBackground(new Color(0,0,255));
              
              if(seleccion=="Cafe\n")
              color.setBackground(new Color(150, 75, 0));
                            
               if(seleccion=="Negro\n")
               color.setBackground(new Color(55,55,55));
                
                      if(seleccion=="Blanco\n")
               color.setBackground(new Color(222,222,222));
                
                }
	}

public
	void actionPerformed(ActionEvent accion)
	{       
            id+=1;
                int d;
          if(JB_producto.size()<10){
		if (accion.getSource() == car1) 
		{       d=(Integer)cant.getValue();
			String datos="<html><div style=\"color:red\">X</div> <p style=\"font-size:8.45px\">Pantalon:<br> Talla: <br>"+talla.getSelectedItem().toString()+"<br>Color: <br> " + color.getSelectedItem().toString()+"<br>Corte: <br> "+corte.getSelectedItem().toString()+"<br>Cantidad: "+d+"</p>Precio: $900</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                                        Cant_.put(id,(Integer)cant.getValue());

                    }
		if (accion.getSource() == car2) 
		{       d=(Integer)cant.getValue();
			String datos="<html><div style=\"color:red\">X</div> Camisa:<br> Color: <br>"+c_camisa.getSelectedItem().toString()+"<br>Manga: <br> "+manga.getSelectedItem().toString()+"<br>Cantidad: "+d+"<br>Precio: $700</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                                        Cant_.put(id,(Integer)cant2.getValue());

                    }
                    	if (accion.getSource() == car3) 
		{       d=(Integer)cant.getValue();
			String datos="<html><div style=\"color:red\">X</div> Calcetas:<br> Genero: <br>"+calceta.getSelectedItem().toString()+"<br>Cantidad: "+d+"<br>Precio: $110</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                                        Cant_.put(id,(Integer)cant3.getValue());

                    }
                        	if (accion.getSource() == car4) 
		{       d=(Integer)cant.getValue();
			String datos="<html><div style=\"color:red\">X</div> Zapatos yeezy:<br> Talla: <br>"+tallaz.getSelectedItem().toString()+"<br>Cantidad: "+d+"<br>Precio: $3700</html>";		
                        JB_producto.put(id,new JButton(datos));
                                                                        Cant_.put(id,(Integer)cant4.getValue());

                    }
               }
                                else
                    JOptionPane.showMessageDialog(null, "Carrito lleno maximo 10 articulos diferentes");
	} 


}
