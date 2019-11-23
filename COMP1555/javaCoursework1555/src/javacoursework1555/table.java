/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework1555;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barnabe
 */

public class table{


    JFrame graphframe;
    DefaultTableModel model = new DefaultTableModel();
    JTable table1 = new JTable(model);

    ArrayList<ArrayList<Double>> listXY = GUI.XYlist;
    ArrayList<Double> listX = listXY.get(0);
    ArrayList<Double> listY = listXY.get(1);
    String[] ArX;
    String[] ArY;
    
            


    
    public void table1() 
    {
        
        JFrame graphframe = new JFrame();
        graphframe.setSize(600, 600);
        graphframe.setTitle(" table ");
        graphframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        graphframe.setLocationRelativeTo(null); 
   
        //graphframe.setVisible(true);
        
        //System.out.print("listX: "+listX+ "\n" + "listY: "+listY+"\n");

        int g1 = 0;
        int g3 =0;
        int g2 = listX.size();
    
        while(g1 != listX.size())
        {     
            g1++;
        }
        
        ArX = new String[g1];
        ArY = new String[g1];
        
                
        while(g3 != listX.size())
        {     
            ArX[g3] = Double. toString(listX.get(g3));
            ArY[g3] = Double. toString(listY.get(g3));
            g3++;
        }
        
        
        
        //System.out.println("ArX: "+ Arrays.toString(ArX) +"\n"+"ArY: "+Arrays.toString(ArY));
            
        
        graphframe.setTitle(" table ");
    
        
    
        model.addColumn(" X ", ArX);
        model.addColumn(" Y ", ArY);
        

        
        
        graphframe.add(new JScrollPane(table1));
        
        
        graphframe.setVisible(true);
        
        table1.setVisible(true);
        
        
    }   
    

    
   
    
        
}

  
    
    
  