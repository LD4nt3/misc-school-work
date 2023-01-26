package ventanasejemplos;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author co2
 */
public class ejemplo5 extends JFrame {
    private JButton boton1 = new JButton("Boton 1");
    private JButton boton2 = new JButton("Boton 2");
    private JButton boton3 = new JButton("Boton 3");
    private JButton boton4 = new JButton("Boton 4");
    private JButton boton5 = new JButton("Boton 5");

    
    public ejemplo5 ()
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
                                                .addComponent(boton3)
                                                .addComponent(boton4)                                                                                                
                                        )
                            )
                        .addComponent(boton5)
            );
        
        orden.setVerticalGroup
            (
                    orden.createParallelGroup()
                        .addComponent(boton1)
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
                        )
                        .addComponent(boton5,58,58,58)
            );
        
        setLayout(orden);
        this.pack();
    }
    
}