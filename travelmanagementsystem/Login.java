/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton signup,login,forget;
    JTextField tfusername,tfpassword;
    public Login(){
        setSize(900,400);
        setLocation(350,200);
       setLayout(null);
       
       // setVisible(true);
       getContentPane().setBackground(Color.WHITE);
        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        add(p1);
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
        Image l2=l1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel image=new JLabel(l3);
        image.setBounds(100,100 ,200,200);
        p1. add(image);
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        JLabel username=new JLabel("Username");
        username.setBounds(60,20,100,25);
        username.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(username);
        tfusername=new JTextField();
         tfusername.setBounds(60,60,300,30);
         tfusername.setBorder(BorderFactory.createEmptyBorder());
         p2.add(tfusername);
         
         JLabel password=new JLabel("Password");
        password.setBounds(60,110,100,25);
        password.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(password);
         tfpassword=new JTextField();
         tfpassword.setBounds(60,150,300,30);
         tfpassword.setBorder(BorderFactory.createEmptyBorder());
         p2.add(tfpassword);
         login=new JButton("Login");
         login.setBounds(60,200,130,30);
         login.setBackground(new Color(133,193,233));
         login.setForeground(Color.WHITE);
         login.setBorder(new LineBorder(new Color(133,193,233)));
         login.addActionListener(this);
         p2.add(login);
         
          signup=new JButton("Signup");
         signup.setBounds(230,200,130,30);
         signup.setBackground(new Color(133,193,233));
         signup.setForeground(Color.WHITE);
         signup.setBorder(new LineBorder(new Color(133,193,233)));
         signup.addActionListener(this);
         p2.add(signup);
         
          forget=new JButton("Forget Password ");
         forget.setBounds(150,250,130,30);
         forget.setBackground(new Color(133,193,233));
         forget.setForeground(Color.WHITE);
         forget.setBorder(new LineBorder(new Color(133,193,233)));
         forget.addActionListener(this);
         p2.add(forget);
         
        
       JLabel text=new JLabel("Trouble in Login...");
        text.setBounds(300,250,150,20);
        p2.add(text);
        text.setForeground(Color.RED);
          setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            try{
                String username=tfusername.getText();
                String pass=tfpassword.getText();
                String query="select * from account where username='"+username+"' AND password='"+pass+"'";
                Conn c=new Conn();
              ResultSet rs=  c.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                  new Loading(username);
              }
              else{
                  JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
              }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==signup){
           setVisible(false) ;
           new Signup();
        }
        else{
            setVisible(false);
            new ForgetPassword();
        }
    }

   
    public static void main(String[]args) {
        new Login();
    }
}
