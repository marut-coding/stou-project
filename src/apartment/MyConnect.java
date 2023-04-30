/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MARUT
 */
public class MyConnect {
public static Connection getConnection() {
    
    
    try {
        
    Class.forName(com.mysql.jdbc.Driver.class.getName());
    return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_apartment", "root", "1234");
    } catch (ClassNotFoundException | SQLException e) {
    }       
    
    return null;
    
    
    }
    
    
}
