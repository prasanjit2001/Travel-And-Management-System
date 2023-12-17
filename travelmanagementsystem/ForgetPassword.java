/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ForgetPassword extends JFrame implements ActionListener{
    JTextField fusername,fname,fquestion,fanswer,fpassword;
    JButton search,retrive,back;
    public ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icons/padlock.png"));
        Image l2=l1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2) ;
        JLabel image=new JLabel(l3);
        image.setBounds(580,70,200,200);
        add(image);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        JLabel username=new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(username);
                
        fusername=new JTextField();
        fusername.setBounds(220,20,150,25);
        p1.add(fusername);
        fusername.setBorder(BorderFactory.createEmptyBorder());
        
        search=new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
       search.setBounds(380,20,100,25);
       search.addActionListener(this);
       p1.add(search);
       
        JLabel name=new JLabel("Name");
        name.setBounds(40,60,100,25);
       name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(name);
                
        fname=new JTextField();
        fname.setBounds(220,60,150,25);
        p1.add(fname);
        fname.setBorder(BorderFactory.createEmptyBorder());
        
         JLabel question=new JLabel("Seurity Question");
       question.setBounds(40,100,150,25);
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(question);
                
        fquestion=new JTextField();
        fquestion.setBounds(220,100,150,25);
        p1.add(fquestion);
        fquestion.setBorder(BorderFactory.createEmptyBorder());
        
          JLabel answer=new JLabel("Answer");
       answer.setBounds(40,140,150,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(answer);
                
        fanswer=new JTextField();
        fanswer.setBounds(220,140,150,25);
        p1.add(fanswer);
        fanswer.setBorder(BorderFactory.createEmptyBorder());
        
        
       retrive=new JButton("Retrive");
       retrive .setBackground(Color.GRAY);
        retrive.setForeground(Color.WHITE);
       retrive.setBounds(380,140,100,25);
       retrive.addActionListener(this);
       p1.add(retrive);
       
        JLabel password=new JLabel("Password");
       password.setBounds(40,180,150,25);
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(password);
                
        fpassword=new JTextField();
       fpassword .setBounds(220,180,150,25);
        p1.add(fpassword);
        fpassword.setBorder(BorderFactory.createEmptyBorder());
        
        back=new JButton("Back");
       back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
       back.setBounds(160,230,100,25);
       back.addActionListener(this);
       p1.add(back);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query="select * from account where username='"+fusername.getText()+"'";
                Conn c=new Conn();
               ResultSet rs= c.s.executeQuery(query);
               while(rs.next()){
                   fname.setText(rs.getString("name"));
                   fquestion.setText(rs.getString("question"));
               }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==retrive){
            try{
                String query="select * from account where answer='"+fanswer.getText()+"' AND username='"+fusername.getText()+"'";
                Conn c=new Conn();
               ResultSet rs= c.s.executeQuery(query);
               while(rs.next()){
                   fpassword.setText(rs.getString("password"));
                  // fquestion.setText(rs.getString("question"));
               }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else  {
            setVisible(false);
            new Login();
        }
    }
   public static void main(String[]args) {
       new ForgetPassword();
   }
}
