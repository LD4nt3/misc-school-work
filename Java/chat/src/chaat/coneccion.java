/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tonny
 */
public class coneccion {
             Connection con;
  public  void coneccion(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
            con = DriverManager.getConnection("jdbc:mysql://localhost/imagenes","root","");
                System.out.println("conectado");
            }
            catch(Exception ex)
            {   
                System.out.println("error2");
               // Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);                
            }
        }
        catch(Exception ex)
        {
            System.out.println("error1");
             //   Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
