/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework1555;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import static javacoursework1555.subMenu.step1;
import static javacoursework1555.Functions.F2;
import static javacoursework1555.Functions.F3;
import static javacoursework1555.Functions.int2double;
import java.util.*;



/**
 *
 * @author barnabe
 */
public class JavaCoursework1555 
{

 
        
        
    public static void main(String args []) 
    {
        //Frame
        JFrame frame1 = new JFrame("page 1 - menu ");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600, 800);
        
        
        //Menu
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);
        
        
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.DARK_GRAY);
        
        JSeparator s = new JSeparator();
        s.setOrientation(SwingConstants.HORIZONTAL);
        //panel1.add(new JSeparator(SwingConstants.HORIZONTAL));
        
        JLabel label1 = new JLabel(" text label1 \n ", JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        
        
        JTextArea textArea1 = new JTextArea(1, 5);
        
        JTextArea textArea2 = new JTextArea(1, 5);
        
        ArrayList<Double> Temp = new ArrayList<Double>();
       
        
        
        JButton d = new JButton("comfirm range ");
        d.addActionListener(new ActionListener() 
        {
          
            @Override
            public void actionPerformed(ActionEvent a)
            {
             /// endroit of mettre action a faire
                
            
                
                //System.out.println(g1);
                
                
                    try
                    {
                        String g1 = textArea1.getText();
                        double d1 = Double.parseDouble(g1);
                        
                         String g2 = textArea2.getText();
                        double d2 = Double.parseDouble(g2);
                        
                        
                        //System.out.println(d1 +" "+ d2);
                        
                        if(d1 > d2)
                        {
                            System.out.println("you can't enter an impossible range ");
                        }
                        
                        Temp.add(d1);
                        Temp.add(d2);
                        
                    } catch(Exception e)
                    {

                        System.out.println(" the number you entered isn't valide ");
                        
                    }
                
                
                
            }
        });
        
       
        
         JButton a = new JButton(" 1. f(x)=x-x^2 ");
        a.addActionListener(new ActionListener() 
        {
          
            @Override
            public void actionPerformed(ActionEvent e)
            {
            /// endroit of mettre action a faire 
               int k = 1; 
              
              double k1 = Temp.get(0);
              double k2 = Temp.get(1);
              //System.out.println(k1 +" "+ k2);
              
              step1( k, k1, k2);
              System.out.println(step1( k, k1, k2));
                
            }
        });
                
        
        JButton b = new JButton(" 2. f(x)=ln(x+1)+1 ");
        b.addActionListener(new ActionListener() 
        {
          
            @Override
            public void actionPerformed(ActionEvent e)
            {
             /// endroit of mettre action a faire
                int k = 2; 
              
              double k1 = Temp.get(0);
              double k2 = Temp.get(1);
              //System.out.println(k1 +" "+ k2);
              
              step1( k, k1, k2);
              System.out.println(step1( k, k1, k2));
                
            }
        });
        
        JButton c = new JButton(" 3. f(x)=e^x-3x ");
        c.addActionListener(new ActionListener() 
        {
          
            @Override
            public void actionPerformed(ActionEvent e)
            {
             /// endroit of mettre action a faire
                int k = 3; 
              
              double k1 = Temp.get(0);
              double k2 = Temp.get(1);
              //System.out.println(k1 +" "+ k2);
              
              step1( k, k1, k2);
              System.out.println(step1( k, k1, k2));
                
            }
        });
        
       
     
        
        
         //add user input
        panel2.add(textArea1);
        
        panel2.add(d);
        
        panel2.add(textArea2);
        
        
        
        
        
        //add button
        panel3.add(a);
        panel3.add(b);
        panel3.add(c);
        
        //add text
        
        
        panel1.add(panel2);
        panel1.add(s);
        panel1.add(panel3);
        
        frame1.add(panel1);
        panel1.setVisible(true);
        frame1.setVisible(true);
        
        
        
        
        
        
        /// test zone biohazare and weird code Carefull

        
        
        
        
        
    }    
        
        
        
        
        
    
}


















    

    

    
    
