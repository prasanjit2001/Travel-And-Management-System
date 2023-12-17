/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelmanagementsystem;
import javax.swing.*;
import java.awt.*;

public  class  Splash extends JFrame implements Runnable{
    Thread thread;
     Splash(){
        // setSize(1200,600);
        // setLocation(200,100);
         ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icons/beach-1236581.jpg"));
        
         Image l2= l1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
         ImageIcon l3=new ImageIcon(l2);
          JLabel image=new JLabel(l3);
         add(image);
         setVisible(true);
         thread=new Thread(this);
         thread.start();
     }
     public void run(){
         try{
             Thread.sleep(7000);
            // new Login();
            setVisible(false);
         } 
         catch(Exception e){
             
         }
     }
   
    public static void main(String[] args) {
      Splash frame= new Splash();
      int x=1;
      for(int i=1;i<=500;x+=7,i+=6){
          frame.setLocation(750-(x+i)/2,400-(x/2));
          frame.setSize(x+i,i);
          try{
              Thread.sleep(8);
          }
          catch(Exception e){
              e.getMessage();
          }
      }
    }
    
}
