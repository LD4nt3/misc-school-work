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
 * @author che_d
 */
public class ejemplo8 extends JFrame {
    private JButton boton1 = new JButton("Boton 1");
    private JButton boton2 = new JButton("Boton 2");
    private JButton boton3 = new JButton("Boton 3");
    private JButton boton4 = new JButton("Boton 4");
    private JButton boton5 = new JButton("5");
  
    private JButton boton6 = new JButton("6");
    private JButton boton7 = new JButton("7");
    private JButton boton8 = new JButton("8");
    private JButton boton9 = new JButton("9");
 private JButton boton10 = new JButton("10");
     private JButton boton11 = new JButton("Boton 11");
    public ejemplo8 ()
    {
        super("Ejemplo de ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GroupLayout orden = new GroupLayout(this.getContentPane());
        
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
   
        orden.setHorizontalGroup
            (
                                //.addgroup imaginario
                                    orden.createParallelGroup()
                                        
                                        .addGroup//GRUPO SECUENCIAL
                                        (
                                                 orden.createSequentialGroup()
                                                      .addGroup   
                                                 
                                                 (
                                                 (
                                                          orden.createParallelGroup()
                                               
                                                          .addComponent(boton1)
                                                    .addComponent(boton3)    
                                                         )
                                                         
                                                                                      .addGroup(  //5 y 6
                                                                               orden.createSequentialGroup()
                                                          .addComponent(boton5)   
                                
                                                        .addComponent(boton6)                                                        
                                                                                                 
                              
                                                                                      )
                                                                                     .addGroup( 
                                                                           orden.createSequentialGroup()
                                  
                                                         .addComponent(boton7,17,17,17)
                                                           .addComponent(boton8,17,17,17)
                                                 
                                                         .addComponent(boton9,17,17,17)
                                                           .addComponent(boton10,17,17,17)
                                                 
                                                                                     )                                      
                                             
                                                                  
                         
                                             
                                                )        //inicio grupo y fin = .addgroup() dentro de otro            
                                                         .addGroup(
                                                                  orden.createParallelGroup()
                      
                                                          .addComponent(boton2)
                                                    .addComponent(boton4) //corteA  
                                                               )           
                                                           
                                            
                                  
                                                         )  .addComponent(boton11,160,160,160)
                                        
                
                   
                   
            );
        
        orden.setVerticalGroup
            (
                         orden.createSequentialGroup()
                                        
                                        .addGroup
                                        (
                                      
                                                orden.createParallelGroup()
                                                     .addComponent(boton1)
                                                  .addComponent(boton2)   
                                               
                                              )
                                                .addGroup
                                                (orden.createParallelGroup()
                                                     .addComponent(boton3)
                                                        //
                                  
                                                  .addComponent(boton4)   
                                               )
                                   
                                                                  .addGroup
                                        (
                              
                                       
                                                orden.createParallelGroup()
                                                 
                                                     .addComponent(boton5)
                                                           .addComponent(boton6)             
                                        )          
                                                                          .addGroup
                                        (   orden.createParallelGroup()
                                          .addComponent(boton7)
                                                   .addComponent(boton8)
                                
                                          .addComponent(boton9)
                                                   .addComponent(boton10)
                                        )
                                                        
                                       //
                                        
                                        
                                                .addComponent(boton11)
                
                   
            );
        setLayout(orden);
        this.pack();
    }
    
}
