/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tonny
 */
public class usuario {
    
    Connection con;
    
    public usuario()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
            con = DriverManager.getConnection("jdbc:mysql://localhost/imagenes","root","");
            }
            catch(Exception ex)
            {
               // Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);                
            }
        }
        catch(Exception ex)
        {
             //   Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

     }
        public ArrayList<chat> dato()
        {
            ArrayList<chat> resultado= new ArrayList<chat>();
            ResultSet r;
            chat x;
            try 
            {
                PreparedStatement sql = con.prepareStatement("INSERT INTO `usuarios`(`ID_Usuario`, `Nickname`, `Contrasena`, `Estado`) VALUES (null,,[value-3],[value-4])");
                r = sql.executeQuery();
                while(r.next())
                {
                    x = new chat();
                    /*x.ID = r.getString("ID");
                    x.Nombre = r.getString("Nombre");
                    x.Apellido=r.getString("Apellido");
                    x.correo=r.getString("Correo");
                    x.Login=r.getInt("Login_fk");
                    x.Edad=r.getInt("Edad");
                    */
                    x.ID_Usuario=r.getInt("ID_Usuario");
                    x.Nickname=r.getNString("Nickname");
                    x.Contrasena=r.getNString("Contrasena");
                    x.Estado=r.getInt("Estado");
                    resultado.add(x);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            return resultado;
        }
}
