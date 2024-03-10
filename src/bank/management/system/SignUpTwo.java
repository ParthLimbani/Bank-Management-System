/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;


import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author parth
 */
public class SignUpTwo extends JFrame implements ActionListener{
    
    
    JTextField  panNumberTextField, aadharNumberTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox categoryComboBox, incomeComboBox, educationQualificationComboBox, occupationComboBox, religionComboBox;
    String formno;
    
    
    SignUpTwo(String formno) {
        
        this.formno = formno;
        
        setLayout(null);
        
        //setting title of page
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        // Creating Label for Additional details
        JLabel additionalDetials = new JLabel("Page 2: Additional Detials");
        additionalDetials.setFont(new Font("Raleway", Font.BOLD, 22));       
        additionalDetials.setBounds(290, 80, 400, 30);
        add(additionalDetials);
        
        
        
        // Creating Label for religion
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));       
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        
        //creating string fro religion
        String valReligion[] = {"Hindu", "Musilm", "Sikh", "Christian", "Other"};        
        
        // Creating Combo box for religion
         religionComboBox = new JComboBox(valReligion);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);
        
        
        
        // Creating Label for category
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));       
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        //creating string fro category
        String valCategory[] = {"General", "SC", "ST", "OBC", "Other"};        
        
        // Creating Combo box for category
        categoryComboBox = new JComboBox(valCategory);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        
        // Creating Label for Income:
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));       
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        //creating string fro Income
        String valIncome[] = {"null", "< 150000", "<250000", "<500000", "Upto 1000000"};        
        
        // Creating Combo box for Income
         incomeComboBox = new JComboBox(valIncome);
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        
        
        
        // Creating Label for Education Qualification
        JLabel education = new JLabel("Education");
        education.setFont(new Font("Raleway", Font.BOLD, 20));       
        education.setBounds(100, 290, 200, 30);
        add(education);
        
       
        // Creating Label for Qualification
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));       
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        //creating string for Education Qualification
        String valEducationQualification[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};        
        
        // Creating Combo box for Education Qualification
         educationQualificationComboBox = new JComboBox(valEducationQualification);
        educationQualificationComboBox.setBounds(300, 305, 400, 30);
        educationQualificationComboBox.setBackground(Color.WHITE);
        add(educationQualificationComboBox);
        
        
        
        // Creating Label for Occupation
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));       
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        //creating string fro Occupation
        String valOccupation[] = {"Salaried", "Self-Employed", "Buisness", "Student", "Retiered", "Other"};        
        
        // Creating Combo box for Occupation
         occupationComboBox = new JComboBox(valOccupation);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        
        
        

        
        // Creating Label for Pan Number
        JLabel panNumber = new JLabel("Pan Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));       
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);
        
        // Creating TextField for Pan Number
        panNumberTextField = new JTextField ();
        panNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        panNumberTextField.setBounds(300, 440, 400, 30);
        add(panNumberTextField);
        
        
        // Creating Label for Aadhar Number
        JLabel aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));       
        aadharNumber.setBounds(100, 490, 200, 30);
        add(aadharNumber);
        
        // Creating TextField for Aadhar Number
        aadharNumberTextField = new JTextField ();
        aadharNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));       
        aadharNumberTextField.setBounds(300, 490, 400, 30);
        add(aadharNumberTextField);
        
        
        // Creating Label for Senior Citizen
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));       
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);
        
        //Creating RadioButton to select Senior Citizen -yes, no
         syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
       
        //Adding yes and no buttons to button group
        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);
        
        
        
        // Creating Label for Existing Account
        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));       
        existingAccount.setBounds(100, 590, 200, 30);
        add(existingAccount);
        
        //Creating RadioButton to Existing Account -yes, no
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
       
        //Adding yes and no buttons to button group
        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);
        
        
        
        
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
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "";
        
        String sreligion = (String)religionComboBox.getSelectedItem();
       
        String scategory = (String)categoryComboBox.getSelectedItem();
        String sincome = (String)incomeComboBox.getSelectedItem();
        String seducation = (String)educationQualificationComboBox.getSelectedItem();
        String soccupation = (String)occupationComboBox.getSelectedItem();
        
        String pan = panNumberTextField.getText();
        String aadhar = aadharNumberTextField.getText();
        
        String scitizen = "";
        if(syes.isSelected()){ 
            scitizen = "Yes";
        }
        else if(sno.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(eyes.isSelected()){ 
            eaccount = "Yes";
        }else if(eno.isSelected()){ 
            eaccount = "No";
        }
        
        try{
           if(aadharNumberTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpThree(formno).setVisible(true);
                
        }
                
        }
            
        catch(Exception ex){
             ex.printStackTrace();
        }
        
 
    }

    
    public static void main(String[] args) {
        new SignUpTwo("");
    }
}