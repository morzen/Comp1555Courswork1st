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
    
    ArrayList<Double> intel = GUI.Temp2;
    String[] Sintel = new String[7];
    


    
    public void table1() 
    {
        //System.out.println("Temp2 full: "+intel);
        //System.out.println("empty: "+Arrays.toString(Sintel));
        
        
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
        int n = 0;
        
        while(n != 7)
        {
            if(n == 0)
            {
                //System.out.println("0: "+Arrays.toString(Sintel));
                Sintel[n] = "range minX: " + Double.toString(intel.get(n));
            }else if(n == 1)
            {
                //System.out.println("1: "+Arrays.toString(Sintel));
                Sintel[n] = "range maX: " + Double.toString(intel.get(n));
            }else if(n == 2)
            {
                //System.out.println("2: "+Arrays.toString(Sintel));
                Sintel[n] = "function: " + Double.toString(intel.get(n));
            }else if(n == 3)
            {
                //System.out.println("3: "+Arrays.toString(Sintel));
                Sintel[n] = "minY: " + Double.toString(intel.get(n));
            }else if(n == 4)
            {
                //System.out.println("4: "+Arrays.toString(Sintel));
                Sintel[n] = "maxY: " + Double.toString(intel.get(n));
            }else if(n == 5)
            {
                //System.out.println("5: "+Arrays.toString(Sintel));
                Sintel[n] = "root1: " + Double.toString(intel.get(n));
            }else if(n == 6)
            {
                //System.out.println("6: "+Arrays.toString(Sintel));
                Sintel[n] = "root2: " + Double.toString(intel.get(n));
            }
            else
            {
                //System.out.println("7: "+Arrays.toString(Sintel));
                return;
            }
            
            
            
            n++;
        }
        //System.out.println("ArX: "+ Arrays.toString(ArX) +"\n"+"ArY: "+Arrays.toString(ArY));
            
        
        graphframe.setTitle(" table ");
    
        
    
        model.addColumn(" X ", ArX);
        model.addColumn(" Y ", ArY);
        model.addColumn("other intel", Sintel );
        

        //System.out.println("list intel: "+Arrays.toString(Sintel));
        
        graphframe.add(new JScrollPane(table1));
        
        
        graphframe.setVisible(true);
        
        table1.setVisible(true);
        
        
    }   
    

    
   
    
        
}

  
    
    
  