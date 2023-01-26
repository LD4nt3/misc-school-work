package ventanasejemplos;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author co2
 */
public class ejemplo7 extends JFrame {
    private JButton boton1 = new JButton("Boton 1");
    private JButton boton2 = new JButton("Boton 2");
    private JButton boton3 = new JButton("Boton 3");
    private JButton boton4 = new JButton("Boton 4");
    private JButton boton5 = new JButton("Boton 5");
    private JButton boton6 = new JButton("Boton 6");
    private JButton boton7 = new JButton("Boton 7");
    private JButton boton8 = new JButton("Boton 8");
    
    
    public ejemplo7 ()
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
                                .addGroup
                                (
                                        orden.createParallelGroup()
                                            .addGroup
                                                (
                                                        orden.createSequentialGroup()
                                                            .addGroup
                                                            (
                                                                    orden.createParallelGroup()
                                                                        .addComponent(boton1)
                                                                        .addComponent(boton3,160,160,160)
                                                            )
                                                            .addComponent(boton2)
                                                )
                                            .addGroup
                                                (
                                                        orden.createSequentialGroup()
                                                            .addComponent(boton5)
                                                            .addComponent(boton6,160,160,160)
                                                )
                                            .addComponent(boton7,240,240,240)
                                )
                                .addComponent(boton4)
                    )
                    .addComponent(boton8,320,320,320)
            );
        
        
        orden.setVerticalGroup
            (
                    orden.createSequentialGroup()
                        .addGroup
                        (
                                orden.createParallelGroup()
                                    .addGroup
                                    (
                                            orden.createSequentialGroup()
                                                .addGroup
                                                (
                                                        orden.createParallelGroup()
                                                            .addGroup
                                                                (
                                                                        orden.createSequentialGroup()
                                                                            .addComponent(boton1)
                                                                            .addComponent(boton3)
                                                                )
                                                            .addComponent(boton2,58,58,58)
                                                )
                                                .addGroup
                                                    (
                                                            orden.createParallelGroup()
                                                                .addComponent(boton5)
                                                                .addComponent(boton6)
                                                    )
                                                .addComponent(boton7)
                                    )
                                    .addComponent(boton4,120,120,120)
                        )
                        .addComponent(boton8)
            );
        
        setLayout(orden);
        this.pack();
    }
    
}