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
public class ejemplo9 extends JFrame {
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
     private JButton boton11 = new JButton("11");
          private JButton boton12 = new JButton("");
    public ejemplo9 ()
    {
        super("Ejemplo de ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GroupLayout orden = new GroupLayout(this.getContentPane());
        
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
   
        orden.setHorizontalGroup
            (
                                //.addgroup imaginario
                             
                                                 orden.createSequentialGroup()
                                                      .addGroup   
                                                 
                                                 (
                                                 
                                                          orden.createParallelGroup()
                                                 .addGroup   
                                                 
                                                 (
                                                 
                                                        orden.createSequentialGroup()
                                               
                                                          .addComponent(boton1,80,80,80)
                                                                   
                                                      .addGroup                                       
                                                 ( 
                                                                   orden.createParallelGroup() 
                                                                              .addComponent(boton2,160,160,160)  
                                                                   .addGroup                                       
                                                 ( 
                                                         orden.createSequentialGroup()
                                                    .addComponent(boton3)  
                                                                   .addComponent(boton4)     
                                                         
                                                      )
                                                                                
                                                 )  .addComponent(boton5,80,80,80)  
                                                                                                              
                                                                                                 
                              
                                                                                      ).addComponent(boton7,333,333,333)  
                                                                                     .addGroup( 
                                                                           orden.createSequentialGroup()
                                  
                                                     
                                                         .addComponent(boton8,111,111,111)                                                 
                                                         .addComponent(boton9,111,111,111)    
                                                        .addComponent(boton10,111,111,111)
                                                 
                                                                                     )                                      
                                             
                                                                  
                         
                                             
                                                )         .addGroup
                                        (
                                      
                                                orden.createParallelGroup()
                                                 .addComponent(boton6)
                                                .addComponent(boton11)
                                          
                                        )
                        
                                                           
                                            
                                  
                                        
                
                   
                   
            );
        
        orden.setVerticalGroup
            (
                         orden.createSequentialGroup()
                                        
                                        .addGroup
                                        (
                                      
                                                orden.createParallelGroup()
                                                    .addComponent(boton1,60,60,60)
                                                
                                                
                                                .addGroup
                                                ( orden.createSequentialGroup()
                                                      .addComponent(boton2) 
                                                          .addGroup
                                                ( orden.createParallelGroup()
                                                 .addComponent(boton3)   

                                                  .addComponent(boton4)   
                                               )
                                                     
                                              .addComponent(boton7)      
                                                
                                                )                   
                                                        .addComponent(boton5,60,60,60)   .addComponent(boton6,85,85,85) 
                                                  
                                        )           
                                        
                                                     
                                                                  .addGroup
                                        (
                                                orden.createParallelGroup()
                                        .addComponent(boton8)     
                                                 .addComponent(boton9)     
                                                 .addComponent(boton10)   
                                                  .addComponent(boton11)   
                                               
                                        )
                
                   
            );
        setLayout(orden);
        this.pack();
    }
    
}
