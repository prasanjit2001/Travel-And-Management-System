/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton personalDetails, viewPersonalDetails,updatePersonalDetails,checckPackage, viewPackage,viewHotels, destinations,bookHotels,viewbookHotels,payments,calculators,notepad,about;
    String user;
    Dashboard(String user){
        this.user=user;
    // setBounds(0,0,1600,1000);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);
    
    JPanel p1=new JPanel();
    p1.setLayout(null);
    p1.setBackground(new Color (0,0,102));
    p1.setBounds(0,0,1600,65);
    add(p1);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
    Image i2= i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel icon=new JLabel(i3);
    icon.setBounds(5,0,70,70);
    p1.add(icon);
    
    JLabel heading=new JLabel("Dashboard");
    heading.setBounds(80,10,300,40);
    heading.setForeground(Color.WHITE);
    heading.setFont(new Font("Tahoma",Font.BOLD,30));
    p1.add(heading);
    
     JPanel p2=new JPanel();
    p2.setLayout(null);
    p2.setBackground(new Color (0,0,102));
    p2.setBounds(0,65,300,900);
    add(p2);
    
    
     personalDetails=new JButton("Add Personal Details");
    personalDetails.setBounds(0,0,300,50);
     personalDetails.setBackground(new Color(0,0,102));
      personalDetails.setForeground(Color.white);
       personalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        personalDetails.setMargin(new Insets(0,0,0,60));
        personalDetails.addActionListener(this);
   p2. add( personalDetails);
   
   updatePersonalDetails=new JButton("Update Personal Details");
    updatePersonalDetails.setBounds(0,50,300,50);
     updatePersonalDetails.setBackground(new Color(0,0,102));
     updatePersonalDetails.setForeground(Color.white);
       updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,40));
   p2. add( updatePersonalDetails);
   
   viewPersonalDetails=new JButton("View Details");
    viewPersonalDetails.setBounds(0,100,300,50);
    viewPersonalDetails.setBackground(new Color(0,0,102));
     viewPersonalDetails.setForeground(Color.white);
       viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,140));
         viewPersonalDetails.addActionListener(this);
   p2. add( viewPersonalDetails);
   
   JButton deletePersonalDetails=new JButton("Delete Personal Details");
   deletePersonalDetails.setBounds(0,150,300,50);
    deletePersonalDetails.setBackground(new Color(0,0,102));
     deletePersonalDetails.setForeground(Color.white);
      deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,50));
   p2. add( deletePersonalDetails);
   
 checckPackage=new JButton("Check Packages");
    checckPackage.setBounds(0,200,300,50);
    checckPackage.setBackground(new Color(0,0,102));
    checckPackage.setForeground(Color.white);
    checckPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
    checckPackage.setMargin(new Insets(0,0,0,115));
    checckPackage.addActionListener(this);
    p2. add( checckPackage);
   
   JButton bookPackage=new JButton("Book Package");
   bookPackage.setBounds(0,250,300,50);
   bookPackage.setBackground(new Color(0,0,102));
   bookPackage.setForeground(Color.white);
   bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
   bookPackage.setMargin(new Insets(0,0,0,135));
   p2. add( bookPackage);
   
    viewPackage=new JButton("View Package");
   viewPackage.setBounds(0,300,300,50);
  viewPackage.setBackground(new Color(0,0,102));
   viewPackage.setForeground(Color.white);
   viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
  viewPackage.setMargin(new Insets(0,0,0,135));
   viewPackage.addActionListener(this);
   p2. add( viewPackage);
   
     viewHotels=new JButton("View Hotels");
  viewHotels.setBounds(0,350,300,50);
 viewHotels.setBackground(new Color(0,0,102));
   viewHotels.setForeground(Color.white);
   viewHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
  viewHotels.setMargin(new Insets(0,0,0,155));
  viewHotels.addActionListener(this);
   p2. add( viewHotels);
   
   bookHotels=new JButton("Book Hotel");
  bookHotels.setBounds(0,400,300,50);
bookHotels.setBackground(new Color(0,0,102));
   bookHotels.setForeground(Color.white);
   bookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
  bookHotels.setMargin(new Insets(0,0,0,160));
  bookHotels.addActionListener(this);
   p2. add( bookHotels);
   
    viewbookHotels=new JButton("View Booked Hotel");
  viewbookHotels.setBounds(0,450,300,50);
viewbookHotels.setBackground(new Color(0,0,102));
   viewbookHotels.setForeground(Color.white);
  viewbookHotels.setFont(new Font("Tahoma",Font.PLAIN,20));
  viewbookHotels.addActionListener(this);
  viewbookHotels.setMargin(new Insets(0,0,0,95));
   p2. add( viewbookHotels);
   
    destinations=new JButton("Destinations");
  destinations.setBounds(0,500,300,50);
destinations.setBackground(new Color(0,0,102));
   destinations.setForeground(Color.white);
  destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
  destinations.setMargin(new Insets(0,0,0,150));
   destinations.addActionListener(this);
   p2. add( destinations);
   
    payments=new JButton("Payments");
  payments.setBounds(0,550,300,50);
payments.setBackground(new Color(0,0,102));
   payments.setForeground(Color.white);
  payments.setFont(new Font("Tahoma",Font.PLAIN,20));
  payments.setMargin(new Insets(0,0,0,175));
  payments.addActionListener(this);
   p2. add( payments);
   
    calculators=new JButton("Calculator");
  calculators.setBounds(0,600,300,50);
calculators.setBackground(new Color(0,0,102));
   calculators.setForeground(Color.white);
 calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
  calculators.setMargin(new Insets(0,0,0,170));
  calculators.addActionListener(this);
   p2. add( calculators);
   
    notepad=new JButton("Notepad");
  notepad.setBounds(0,650,300,50);
notepad.setBackground(new Color(0,0,102));
   notepad.setForeground(Color.white);
 notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
 notepad.setMargin(new Insets(0,0,0,185));
 notepad.addActionListener(this);
   p2. add( notepad);
   
     about=new JButton("About");
  about.setBounds(0,700,300,50);
about.setBackground(new Color(0,0,102));
   about.setForeground(Color.white);
about.setFont(new Font("Tahoma",Font.PLAIN,20));
 about.setMargin(new Insets(0,0,0,200));
 about.addActionListener(this);
   p2. add( about);
   
   ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
   Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
   ImageIcon i6=new ImageIcon(i5);
   JLabel image=new JLabel(i6);
   image.setBounds(0,0,1650,1000);
   add(image);
   
   JLabel text=new JLabel("Travel And Tourism Management System");
   text.setBounds(400,70,1200,70);
   text.setForeground(Color.white);
   text.setFont(new Font("Raleway",Font.PLAIN,55));
   image.add(text);
   
   
   
   
   
   
     setVisible(true);
     
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==personalDetails){
            new AddCustomer(user);
        }
        else if(ae.getSource()== viewPersonalDetails){
            new ViewCustomer(user);
        }
        else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(user);
        }
        else if(ae.getSource()==checckPackage){
            new CheckPackage();
        }
        else if(ae.getSource()== viewPackage){
            new ViewPackage(user);
        }
         else if(ae.getSource()== viewHotels){
            new CheckHotels();
        }
         else if(ae.getSource()== destinations){
            new Destinations();
        }
         else if(ae.getSource()== bookHotels){
            new BookHotel(user);
        }
         else if(ae.getSource()==viewbookHotels ){
            new ViewBookedHotel(user);
        }
         else if(ae.getSource()==payments ){
            new Payment();
        }
         else if(ae.getSource()==calculators ){
            try{
             Runtime.getRuntime().exec("calc.exe");
         }catch(Exception e){
             e.printStackTrace();
         }
        }
         else if(ae.getSource()==notepad ){
             try{
             Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e){
             e.printStackTrace();
         }
        }
         else if(ae.getSource()==about ){
           new About();
        }
        
    }
   
    public static void main(String[]args){
        new Dashboard("");
        
    }
}
