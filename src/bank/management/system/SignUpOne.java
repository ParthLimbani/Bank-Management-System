package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinCodeTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;
    
    SignUpOne() {
        
        setLayout(null);
        
        //creating a random application number
        Random ran = new Random();
        random =  Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        // Creating Label For Application From Number
        JLabel formNo = new JLabel("Application Form Number: " + random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));       
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        // Creating Label for Personal details
        JLabel personalDetails = new JLabel("Page 1: Personal Detials");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));       
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        
        // Creating Label for name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));       
        name.setBounds(100, 140, 100, 30);
        add(name);

        // Creating TextField for name
        nameTextField = new JTextField ();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        
        // Creating Label for father's name
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));       
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        // Creating TextField for father's name
         fnameTextField = new JTextField ();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        
        // Creating Label for Date of Birth:
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));       
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        // Creating calendar for choosing DOB
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        
        // Creating Label for gender 
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));       
        gender.setBounds(100, 290, 100, 30);
        add(gender);
        
        //Creating RadioButton to select gender -male, female
         male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
       
        //Adding male and female buttons to button group
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        
        // Creating Label for Email
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));       
        email.setBounds(100, 340, 100, 30);
        add(email);
        

        // Creating TextField for email
        emailTextField = new JTextField ();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        
        // Creating Label for MAritial Status
        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));       
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);
        
        //Creating RadioButton to select MArital Status -married, unmarried, other
         married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         other = new JRadioButton("Other");
        other.setBounds(600, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
       
        //Adding married unmarried, other buttons to button group
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        

        
        // Creating Label for address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));       
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        // Creating TextField for address
         addressTextField = new JTextField ();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        
        // Creating Label for city
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));       
        city.setBounds(100, 490, 100, 30);
        add(city);
        
        // Creating TextField for city
         cityTextField = new JTextField ();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        
        // Creating Label for State
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));       
        state.setBounds(100, 540, 100, 30);
        add(state);
        
        // Creating TextField for state
         stateTextField = new JTextField ();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        
        // Creating Label for pinCode
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));       
        pinCode.setBounds(100, 590, 100, 30);
        add(pinCode);
        
        // Creating TextField for pinCode
         pinCodeTextField = new JTextField ();
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        pinCodeTextField.setBounds(300, 590, 400, 30);
        add(pinCodeTextField);
        
        
        // Creating Button the goto Next Page
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));       
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        //setting background color to white
        getContentPane().setBackground(Color.WHITE);
        
        setSize(950, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    
    
    //Adding Action Listner function i.e ActionPerformed
    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        
        String name = nameTextField.getText();
       
        String fname = fnameTextField.getText();
        
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }      
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pinCode = pinCodeTextField.getText();
        String state = stateTextField.getText();    
        
        
        try{
           
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                
                //establishing connection with db
                
                Conn c = new Conn();
                String query = "insert into signUp values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pinCode+"','"+state+"')";
                c.s.executeUpdate(query);
                
//                new Signup2(first).setVisible(true);
               setVisible(false);
               new SignUpTwo(formno).setVisible(true);
            }
            
        }catch(Exception e){
             System.err.println(e);
        }
        
    }
 
        
    
    public static void main(String[] args) {
        new SignUpOne();
    }
}
