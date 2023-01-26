/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_mouse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author che_d
 */
public class Eventos_mouse extends JFrame   implements   MouseListener 
{
public   
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK);
private
	JLabel et1;

private
	JTextField campoTxt1;
private
        JTextArea a1;

public
	Eventos_mouse()
	{

		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		et1 = new JLabel("Nombre");
		et1.setBounds(232, 5, 150, 25);
		add(et1);
                
                campoTxt1 = new JTextField();
		campoTxt1.setBounds(2, 5, 222, 25);
		add(campoTxt1);
                campoTxt1.setEditable(true); 

                a1 = new JTextArea("");
		 a1.setBounds(2, 35, 278, 100);
                 a1.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		 a1.setEditable(true); 
                add(a1);
                
		                addMouseListener(this);

		
            
             
                
	}
	// Fin del constructor

public
	static void main(String[] args)
	{
		Eventos_mouse ventana = new Eventos_mouse();
		ventana.setBounds(200, 200, 300, 181);
                
		ventana.setVisible(true);
	}


        //derecho=256
        //rueda=512
    @Override
    public void mouseClicked(MouseEvent e) {
           int i = e.getModifiersEx();
           if(i==0)
            campoTxt1.setText("Dante");               
               
           if(i==256)
                   et1.setText("Dante");
                   
               if(i==512)
               {
                   i=JOptionPane.showConfirmDialog(null, "Cerrar ventana?");
                  if(i==0)
                  System.exit(0);
               }  
         //  et1.setText(Integer.toString(i));
         
    }

    @Override
    public void mousePressed(MouseEvent e) {
         
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         if(e.getSource()==a1)
            JOptionPane.showMessageDialog(campoTxt1, "Puede introducir texto largo en esta ventana");
    }

    @Override
    public void mouseExited(MouseEvent e) { if(e.getSource()==a1)
            JOptionPane.showMessageDialog(null, "Ya no podra agregar texto");
         
    }



	
}