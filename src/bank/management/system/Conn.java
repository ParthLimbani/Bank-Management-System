/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system; 

import java.sql.*;



/**
 *
 * @author parth
 */
public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
    
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bankManagementSystem", "root", "1q2w3e4r");
            s = c.createStatement();
            
        }
        catch(Exception e) {
            System.err.println("");
        }
    }
}
