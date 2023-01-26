/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_p4;

/**
 *
 * @author che_d
 */
import java.awt.Color;
import javax.swing.*;	
import java.awt.event.*; 
import javafx.scene.layout.Border;

public class Lista_p5 extends JFrame implements ItemListener, ActionListener
{
                     public   javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK);

public
	JLabel et1, et2, et3, et4;
public
	JTextArea T_area;

public
	JButton regis;

public
	JComboBox<String>   color, corte, talla,c_camisa, manga,kids, calceta,  edad; 
 JScrollPane scroll;
public
	Lista_p5()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		et1 = new JLabel("Pantalon");
		et1.setBounds(5, 5, 100, 25);
		add(et1);

		et2 = new JLabel("Camisas");
		et2.setBounds(105, 5, 100, 25);
		add(et2);

		et3 = new JLabel("Calcetas:");
		et3.setBounds(205, 5, 100, 25);
		add(et3);

		et4 = new JLabel("ROPA INF:");
		et4.setBounds(205, 60, 100, 25);
		add(et4);
		
		regis = new JButton("REGISTRAR PEDIDO");
		regis.setBounds(70, 170, 145, 30);
		add(regis);

		
		
		T_area = new JTextArea("");
                scroll = new JScrollPane(T_area);
                scroll.setBounds(325, 20, 325, 325);	
                add(scroll);
		//T_area.setBounds(325, 20, 325, 325);
                T_area.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		//T_area.setEditable(false);
		//add(T_area);
		
	
		talla = new JComboBox<String>();
		talla.setBounds(5, 60, 80, 25);
		add(talla);
                	talla.setEditable(true);
		talla.setSelectedItem("Talla");
		talla.setEditable(false);

		talla.addItem("S\n");
		talla.addItem("M\n");
		talla.addItem("L\n");
		talla.addItem("XL\n");
	
		color = new JComboBox<String>();
		color.setBounds(5, 30, 80, 25);
		add(color);
                color.setEditable(true);
		color.setSelectedItem("Color");
		color.setEditable(false);
		color.addItem("Azul\n");
		color.addItem("Cafe\n");
                color.addItem("Blanco\n");
		color.addItem("Negro\n");
		

		corte = new JComboBox<String>();
		corte.setBounds(5, 90, 80, 25);
		add(corte);
		corte.addItem("Amplio\n");
                corte.addItem("Skinny\n");
		corte.addItem("Recto\n");
		corte.setEditable(true);
		corte.setSelectedItem("Corte");
		corte.setEditable(false);

		c_camisa = new JComboBox<String>();
		c_camisa.setBounds(105, 30, 80, 25);
		add(c_camisa);
		c_camisa.addItem("Azul\n");
		c_camisa.addItem("Negro\n");
		c_camisa.addItem("Blanca\n");
		c_camisa.setEditable(true);
		c_camisa.setSelectedItem("Color");
		c_camisa.setEditable(false);

		manga = new JComboBox<String>();
		manga.setBounds(105, 60, 80, 25);
		add(manga);
                	manga.setEditable(true);
		manga.setSelectedItem("Manga");
		manga.setEditable(false);
		manga.addItem("Corta\n");
		manga.addItem("3/4\n");
		manga.addItem("Larga\n");
	

		calceta = new JComboBox<String>(); 
		calceta.setBounds(205, 30, 80, 25);
		add(calceta);
                calceta.setEditable(true);
		calceta.setSelectedItem("Genero");
		calceta.setEditable(false);
		calceta.addItem("Maculino\n");
		calceta.addItem("Femenino\n");
		


		kids = new JComboBox<String>();
		kids.setBounds(205, 110, 80, 25);
		add(kids);
		kids.addItem("Maculino\n");
		kids.addItem("Femenino\n");
		kids.setEditable(true);
		kids.setSelectedItem("Genero");
		kids.setEditable(false);

		edad = new JComboBox<String>(); 
		edad.setBounds(205, 80, 80, 25);
		add(edad);
                edad.setEditable(true);
		edad.setSelectedItem("Edad\n");
                edad.setEditable(false);
		edad.addItem("1\n");
                edad.addItem("2\n");
                edad.addItem("3\n");
                edad.addItem("6\n");
                edad.addItem("8\n");
                edad.addItem("12\n");
                
		
		regis.addActionListener(this);
		talla.addItemListener(this);
		color.addItemListener(this);
		corte.addItemListener(this);
		c_camisa.addItemListener(this);
		manga.addItemListener(this);
		calceta.addItemListener(this);
		kids.addItemListener(this);
		edad.addItemListener(this);
	} //end constructor
public
	void itemStateChanged(ItemEvent accion)
	{
	}

public
	void actionPerformed(ActionEvent accion)
	{
		if (accion.getSource() == regis) 
		{
			String sel_talla = talla.getSelectedItem().toString();		
			String sel_color = color.getSelectedItem().toString();		
			String sel_corte = corte.getSelectedItem().toString();		
			String sel_c_camisa = c_camisa.getSelectedItem().toString(); 
			String sel_manga = manga.getSelectedItem().toString();		 
			String sel_cal = calceta.getSelectedItem().toString();		 
			String sel_nin = kids.getSelectedItem().toString();		 
			String sel_edad = edad.getSelectedItem().toString();		 
			T_area.setText("Pedido: \n Pantalon \n Talla: " + sel_talla + "Color: " + sel_color + "Corte: " + sel_corte + "Camisa \nColor: " + sel_c_camisa + "Manga: " + sel_manga + "Calcetas \nGenero: " + sel_cal + "Ropa infantil \nGenero: " + sel_nin + "Edad: " + sel_edad);
		}
		

	} 


public
	static void main(String[] args)
	{
		Lista_p5 ventana;
		ventana = new Lista_p5();
		ventana.setBounds(200, 200, 700, 400);
		ventana.setVisible(true);

	} //end main
} 
