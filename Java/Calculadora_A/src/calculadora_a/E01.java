/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author che_d
 */
public class E01 implements ActionListener {
      public JTextField TEXT = new JTextField();

       @Override
            public void actionPerformed(ActionEvent e) {
                        TEXT.setText(TEXT.getText() + "1");

            }
    
}
