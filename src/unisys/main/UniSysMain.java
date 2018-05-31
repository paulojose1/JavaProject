/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unisys.main;
import java.sql.*;
/**
 *
 * @author paulo
 */
public class UniSysMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        JLogin login = new JLogin();
        new JLogin().setVisible(true);
        
       // MyConnection con = new MyConnection();
        //System.out.println("saada");
     }
    
}
