/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author parth
 */


/*
    FOR TESTING USE:
    Card no : 5040935978371095
    Pin: 5130 
*/



public class Login extends JFrame implements ActionListener{
    
    JButton login, signUp, clear;
    JTextField cardTextfield;        
    JPasswordField pinTextfield;
    
    Login() {
        setTitle("ATM");
        
        setLayout(null);
        
        // adding bank image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(70, 10, 100, 100);
        add(label1);
        
        //adding text:  "Welcom to ATM"
        JLabel text = new JLabel("Welecome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 30);
        add(text);
        
        
        // Adding label for Card Number
        JLabel cardno = new JLabel("Card No");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        // Adding text Field to enter card number
        cardTextfield = new JTextField();
        cardTextfield.setBounds(300, 150, 230, 30);
        cardTextfield.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextfield);
        
        // Adding label for Card PIN
        JLabel pin = new JLabel("PIN ");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 40);
        add(pin);
        
        // Adding text Field to enter PIN
        pinTextfield = new JPasswordField();
        pinTextfield.setBounds(300, 220, 230, 30);
        pinTextfield.setFont(new Font("Arial", Font.BOLD, 14));        
        add(pinTextfield);
        
        //creating Login Button
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        //creating clear Button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        //creating SignUp Button
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 350, 230, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
        //
        
        getContentPane().setBackground(Color.white);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    //Adding Action Listner function i.e ActionPerformed
    @Override
    public void actionPerformed(ActionEvent ae) {
        //login, signUp, clear
        if(ae.getSource() == clear) {
            cardTextfield.setText("");
            pinTextfield.setText("");
        }
        else if(ae.getSource() == login) {
            Conn conn = new Conn();
                String cardnumber = cardTextfield.getText();
                String pinnumber = pinTextfield.getText();
                String query = "select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";

                try{
                    ResultSet rs = conn.s.executeQuery(query);
                    if (rs.next()) {
                        setVisible(false);
                        new Transactions(pinnumber).setVisible(true);
                    } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                    }
                }
                catch(Exception e) {
                    System.err.println(e);
                }
                    
        }
        else if(ae.getSource() == signUp) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
    

}
