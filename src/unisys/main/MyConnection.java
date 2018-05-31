/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unisys.main;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author paulo
 */
public class MyConnection {
    
    public static Connection getConnection(){
    
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unis?user=root&password=pkjasi121");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return con;
}
}
