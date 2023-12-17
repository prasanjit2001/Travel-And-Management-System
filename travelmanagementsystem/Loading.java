/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystem;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread tr;
    JProgressBar bar;
    String user;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max=bar.getMaximum();
                int value=bar.getValue();
                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }
                else{
                    setVisible(false);
                    new Dashboard(user);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    Loading(String user){
        this.user=user;
        tr=new Thread(this);
        
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("Travel And Tourism Application");
        text.setBounds(50,20,600,40);
        add(text);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        
         bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
         JLabel loading=new JLabel("Loading, Please Wait....");
        loading.setBounds(230,130,150,30);
        add(loading);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway",Font.BOLD,16));
        
         JLabel username=new JLabel("Welcome" +user);
        username.setBounds(20,310,400,40);
        add(username);
        username.setForeground(Color.RED);
        username.setFont(new Font("Raleway",Font.BOLD,16));
        tr.start();
        setVisible(true);
        
    }
    public static void main(String[]args){
        new Loading("");
    }
}
