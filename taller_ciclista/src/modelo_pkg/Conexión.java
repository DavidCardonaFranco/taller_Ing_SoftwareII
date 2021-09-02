/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *  
 * @author David Cardona Franco
 */
public class Conexión {
    Connection connection;

    public Conexión(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/taller_ing_software", "root", "");
            if (connection!=null) {
                System.out.println("Conexión exitosa");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    public Connection getConection(){
        return connection;
    }
}
