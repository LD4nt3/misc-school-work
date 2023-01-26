
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_a;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author che_d
 */
public class ventana3 extends JFrame {

    public JTextField TxbRes = new JTextField("");
    String text = "";
    private JButton boton0 = new JButton("0");
    private JButton boton1 = new JButton("1");
    private JButton boton2 = new JButton("2");
    private JButton boton3 = new JButton("3");
    private JButton boton4 = new JButton("4");
    private JButton boton5 = new JButton("5");
    private JButton boton6 = new JButton("6");
    private JButton boton7 = new JButton("7");
    private JButton boton8 = new JButton("8");
    private JButton boton9 = new JButton("9");

    private JButton boton10 = new JButton("+");
    private JButton boton11 = new JButton("-");
    private JButton boton12 = new JButton("*");
    private JButton boton13 = new JButton("/");
    private JButton boton14 = new JButton("=");
    private JButton botonC = new JButton("C");

    public ventana3() {
        // super("Ejemplo de ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GroupLayout orden = new GroupLayout(this.getContentPane());

        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);

        orden.setHorizontalGroup(
                orden.createParallelGroup()
                        .addComponent(TxbRes, 227, 227, 227)
                        //.addgroup imaginario
                        .addGroup(
                                orden.createSequentialGroup()
                                        .addGroup(
                                                orden.createParallelGroup()
                                                        .addComponent(boton7)
                                                        .addComponent(boton4)
                                                        .addComponent(boton1)
                                                        .addComponent(boton0)
                                        ).addGroup(//incio paralelo!
                                                orden.createParallelGroup()
                                                        .addGroup(
                                                                orden.createSequentialGroup()
                                                                        .addGroup(
                                                                                orden.createParallelGroup()
                                                                                        .addComponent(boton8)
                                                                                        .addComponent(boton5)
                                                                                        .addComponent(boton2)
                                                                        )
                                                                        .addGroup(
                                                                                orden.createParallelGroup()
                                                                                        .addComponent(boton9)
                                                                                        .addComponent(boton6)
                                                                                        .addComponent(boton3)
                                                                        )
                                                                        .addGroup(
                                                                                orden.createParallelGroup()
                                                                                        .addGroup//GRUPO SECUENCIAL
                                                                                        (
                                                                                                orden.createSequentialGroup()
                                                                                                        .addGroup(
                                                                                                                orden.createParallelGroup()
                                                                                                                        .addComponent(boton10)
                                                                                                                        .addComponent(boton12)
                                                                                                        )
                                                                                                        .addGroup(
                                                                                                                orden.createParallelGroup()
                                                                                                                        .addComponent(boton11)
                                                                                                                        .addComponent(boton13)
                                                                                                        )
                                                                                        ).addComponent(boton14, 85, 85, 85)
                                                                        )
                                                        ).addComponent(botonC, 182, 182, 182)
                                        )
                        )
        );

        orden.setVerticalGroup(
                orden.createSequentialGroup()
                        .addComponent(TxbRes)
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton7)
                                        .addComponent(boton8)
                                        .addComponent(boton9)
                                        .addComponent(boton10)
                                        .addComponent(boton11)
                        )
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton4)
                                        .addComponent(boton5)
                                        .addComponent(boton6)
                                        .addComponent(boton12)
                                        .addComponent(boton13)
                        )
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton1)
                                        .addComponent(boton2)
                                        .addComponent(boton3)
                                        .addComponent(boton14)
                        )
                        .addGroup(
                                orden.createParallelGroup()
                                        .addComponent(boton0)
                                        .addComponent(botonC)
                        )
        );

        setLayout(orden);
        this.pack();
        inicia();
    }//  TxbRes.setText(aNewText puede ser una string);   

    void inicia() {
        this.setSize(280, 207);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.getContentPane().setBackground(Color.blue);
        this.setLayout(null);
        E0 e0 = new E0();
        E01 e1 = new E01();
        E02 e2 = new E02();
        E03 e3 = new E03();

        E04 e4 = new E04();
        E05 e5 = new E05();

        E06 e6 = new E06();
        E07 e7 = new E07();

        E08 e8 = new E08();
        E09 e9 = new E09();
        E012 e12 = new E012();
        E010 e10 = new E010();

        E011 e11 = new E011();
        E013 e13 = new E013();

        E014 e14 = new E014();
        E015 eC = new E015();
        
        e0.TEXT = TxbRes;
       e1.TEXT = TxbRes;
        e2.TEXT = TxbRes;
        e3.TEXT = TxbRes;
        e4.TEXT = TxbRes;
        e5.TEXT = TxbRes;
        e6.TEXT = TxbRes;
        e7.TEXT = TxbRes;
        e8.TEXT = TxbRes;
        e9.TEXT = TxbRes;
        e10.TEXT = TxbRes;
        e11.TEXT = TxbRes;
        e12.TEXT = TxbRes;
        e13.TEXT = TxbRes;
        e14.TEXT = TxbRes;
        eC.TEXT = TxbRes;

        boton0.addActionListener(e0);
        boton1.addActionListener(e1);
        boton2.addActionListener(e2);
        boton3.addActionListener(e3);
        boton4.addActionListener(e4);
        boton5.addActionListener(e5);
        boton6.addActionListener(e6);
        boton7.addActionListener(e7);
        boton8.addActionListener(e8);
        boton9.addActionListener(e9);
        boton10.addActionListener(e10);
        boton11.addActionListener(e11);
        boton12.addActionListener(e12);
        boton13.addActionListener(e13);
        boton14.addActionListener(e14);
        botonC.addActionListener(eC);
        /*   
        mitex = new JTextField("ayudame estoy sufriendo esto no es un meme");
        mitex.setSize(1000, 60);
        mitex.setLocation(60, 300);
        this.add(mitex);
         */
    }

}
