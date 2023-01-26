package ventanasejemplos;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author co2
 */
public class ejemplo6 extends JFrame {
    private JButton boton1 = new JButton("Boton 1");
    private JButton boton2 = new JButton("Boton 2");
    private JButton boton3 = new JButton("Boton 3");
    private JButton boton4 = new JButton("Boton 4");
    private JButton boton5 = new JButton("Boton 5");
    private JButton boton6 = new JButton("Boton 6");
    private JButton boton7 = new JButton("Boton 7");
    private JButton boton8 = new JButton("Boton 8");
    private JButton boton9 = new JButton("Boton 9");
    
    public ejemplo6 ()
    {
        super("Ejemplo de ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GroupLayout orden = new GroupLayout(this.getContentPane());
        
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
   
        orden.setHorizontalGroup
            (
                    orden.createParallelGroup()
                        .addGroup
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
                                                            .addComponent(boton3)
                                                            .addComponent(boton4)
                                                )
                                                .addComponent(boton5,160,160,160)
                                                .addGroup
                                                (
                                                      orden.createSequentialGroup()
                                                            .addComponent(boton6)
                                                            .addComponent(boton7)
                                                )
                                    )
                                    .addComponent(boton8)
                        )
                        .addComponent(boton9,320,320,320)
            );
        
        
        orden.setVerticalGroup
            (
                    orden.createSequentialGroup()
                        .addGroup
                            (
                                    orden.createParallelGroup()
                                        .addComponent(boton1,122,122,122)
                                        .addGroup
                                            (
                                                    orden.createSequentialGroup()
                                                        .addComponent(boton2)
                                                        .addGroup
                                                        (
                                                                orden.createParallelGroup()
                                                                    .addComponent(boton3)
                                                                    .addComponent(boton4)                                                                
                                                        )
                                                        .addComponent(boton5)
                                                        .addGroup
                                                        (
                                                                orden.createParallelGroup()
                                                                    .addComponent(boton6)
                                                                    .addComponent(boton7)                                                                
                                                        )
                                                        
                                            )
                                        .addComponent(boton8,122,122,122)
                            )
                        .addComponent(boton9)
            );
        
        setLayout(orden);
        this.pack();
    }
    
}