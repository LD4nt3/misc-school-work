/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasejemplos;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author co2
 */
public class ejemplo4 extends JFrame {
    private JButton boton1 = new JButton("Boton 1");
    private JButton boton2 = new JButton("Boton 2");
    private JButton boton3 = new JButton("Boton 3");
    private JButton boton4 = new JButton("Boton 4");
    private JButton boton5 = new JButton("Boton 5");
    private JButton boton6 = new JButton("Boton 6");
    private JButton boton7 = new JButton("Boton 7");
    private JButton boton8 = new JButton("Boton 8");
    
    public ejemplo4 ()
    {
        super("Ejemplo de ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GroupLayout orden = new GroupLayout(this.getContentPane());
        
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
   
        orden.setHorizontalGroup
            (
                    orden.createSequentialGroup()
                        .addComponent(boton1)
                        .addGroup
                            (
                                    orden.createParallelGroup()
                                        .addComponent(boton2,160,160,160)
                                        .addGroup
                                        (
                                             orden.createSequentialGroup()
                                                .addGroup
                                                (
                                                        orden.createParallelGroup()
                                                            .addComponent(boton3)
                                                            .addComponent(boton5)
                                                )
                                                .addComponent(boton4)
                                        )
                            )
                        .addGroup
                            (
                                    orden.createParallelGroup()
                                        .addComponent(boton6)
                                        .addComponent(boton7)
                            )
                        .addComponent(boton8)
            );
        
        orden.setVerticalGroup
            (
                    orden.createSequentialGroup()
                        .addGroup
                            (
                                    orden.createParallelGroup()
                                        .addComponent(boton1)
                                        .addComponent(boton2)
                                        .addComponent(boton6)
                                        .addComponent(boton8)
                            )
                        .addGroup
                            (
                                    orden.createParallelGroup()
                                        .addComponent(boton3)
                                        .addComponent(boton4)
                            )
                        .addGroup
                            (
                                    orden.createParallelGroup()
                                        .addComponent(boton5)
                                        .addComponent(boton7)
                            )
            );
        
        setLayout(orden);
        this.pack();
    }
    
}
