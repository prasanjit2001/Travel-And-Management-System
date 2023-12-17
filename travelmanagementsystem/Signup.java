/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField fusername,fpassword,rname,fans;
    Choice fsecurity;
    public Signup(){
       setBounds(350,200,900,360); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lusername=new JLabel("Username");
        lusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lusername.setBounds(50,20,125,25);
       p1.add(lusername);
       
       fusername=new JTextField();
       fusername.setBounds(190,20,180,25);
       fusername.setBorder(BorderFactory.createEmptyBorder());
       p1.add(fusername);
       
       
        JLabel name=new JLabel("Name");
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        name.setBounds(50,60,125,25);
       p1.add(name);
       
       rname=new JTextField();
       rname.setBounds(190,60,180,25);
       rname.setBorder(BorderFactory.createEmptyBorder());
       p1.add(rname);
           
       JLabel password=new JLabel("Password");
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        password.setBounds(50,100,125,25);
       p1.add(password);
       
       fpassword=new JTextField();
       fpassword.setBounds(190,100,180,25);
       fpassword.setBorder(BorderFactory.createEmptyBorder());
       p1.add(fpassword); 
       
        JLabel security=new JLabel("Security Query");
        security.setFont(new Font("Tahoma",Font.BOLD,14));
        security.setBounds(50,140,125,25);
       p1.add(security);
       
       fsecurity=new Choice();
       fsecurity.add("Your DOB");
       fsecurity.add("Your Pet Name");
       fsecurity.add("Your Fav Character");
       fsecurity.add("Your First School");
       fsecurity.setBounds(190,140,180,25);
       p1.add(fsecurity);
       
        JLabel ans=new JLabel("Answer");
        ans.setFont(new Font("Tahoma",Font.BOLD,14));
        ans.setBounds(50,180,125,25);
       p1.add(ans);
       
        fans=new JTextField();
       fans.setBounds(190,180,180,25);
       fans.setBorder(BorderFactory.createEmptyBorder());
       p1.add(fans); 
      
        create= new JButton("Create");
       create.setBackground(Color.WHITE);
       create.setForeground(new Color(133,193,233));
       create.setFont(new Font("Tahoma",Font.BOLD,14));
       create.setBounds(80,250,100,30);
       create.addActionListener(this);
       p1.add(create);
       
         back= new JButton("Back");
       back.setBackground(Color.WHITE);
       back.setForeground(new Color(133,193,233));
       back.setFont(new Font("Tahoma",Font.BOLD,14));
       back.setBounds(270,250,100,30);
       back.addActionListener(this);
       p1.add(back);
       
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image l2=l1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel image=new JLabel(l3);
        image.setBounds(580,50 ,250,250);
        
         add(image);

       
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==create) {
           String username=fusername.getText();
           String name=rname.getText();
           String password=fpassword.getText();
           String question=fsecurity.getSelectedItem();
           String answer=fans.getText();
           String query="Insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
           try{
               Conn c=new Conn();
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Account Created Successfully");
               setVisible(false);
               new Login();
           }
           catch(Exception e){
               e.printStackTrace();
           }
       }
       else if(ae.getSource()==back){
           setVisible(false);
           new Login();
       }
    }
    public static void main(String[]args){
        new Signup();
    }
}
