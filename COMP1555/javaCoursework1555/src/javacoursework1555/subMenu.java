/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework1555;

/**
 *
 * @author barnabe
 */


import java.util.ArrayList;
import java.util.Scanner;
import static javacoursework1555.Functions.F1;
import static javacoursework1555.Functions.F2;
import static javacoursework1555.Functions.F3;
import static javacoursework1555.Functions.int2double;



public class subMenu 
{




     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
    }

   
    
    
    
    
    
    
    
    
    
        
    public static ArrayList<ArrayList<Double>> step1(int n, double m1, double m2)
    {
        
        double Brange = m1 ;
        double Erange = m2 ;
        
        ArrayList<Double> x =  new ArrayList<Double>();
        ArrayList<Double> y =  new ArrayList<Double>();
         

        
        
       int k = n;
        
       
        ///if k == 1 in the first while loop then 
        if(  k == 1 )
        {

                while (Brange <= Erange)
            {
                x.add(Brange);
                double f = F1(Brange);
                y.add(f);
                //Brange++;
                Brange = Brange + 0.25 ;
            }

            
        ///if k == 2 in the first while loop then
        }else if(  k == 2)
        {
        
               while (Brange <= Erange)
            {
                x.add(Brange);
                double f = F2(Brange);
                y.add(f);
                //Brange++;
                Brange = Brange + 0.25 ;
            }
         ///if k == 3 in the first while loop then
        } else if (  k == 3)
        {
        
               while (Brange <= Erange)
            {
                x.add(Brange);
                double f = F3(Brange);
                y.add(f);
                //Brange++;
                Brange = Brange + 0.25 ;
            }
        
        }
        else
        {
        
                System.out.println(" you haven't entered one of the options. ");
                
        }
       
       int l1 = (int) Erange;
       ArrayList<ArrayList<Double>> yolo = new ArrayList<ArrayList<Double>>();
       yolo.add(x);
       yolo.add(y);
       
       //System.out.println(yolo);
    
     return yolo;
        
    }
    
    
    //    static double step2()
    //    {
    //    
    //        double Brange = 0 ;
    //        double Erange = 0 ;
    //        Scanner scan = new Scanner(System.in);
    //        
    //         /// here we just define the range in an easy way for the user because he can enter int or double with no problem
    //        /// it save him the time of typing 1.0 if he just want 1
    //        /// here it s the first number of the range 
    //        int q = 0;
    //        while(q == 0)
    //        {
    //        
    //            System.out.println(" select the beginning of your range: \n");
    //         
    //            if(scan.hasNextDouble())
    //            {
    //
    //                Brange = scan.nextDouble();
    //                q = 1 ;
    //            }else if(scan.hasNextInt())
    //            {
    //                int l = 0;
    //                l = scan.nextInt();
    //                Brange = int2double(l);
    //                q = 1;
    //            }
    //            else
    //            {
    //
    //                System.out.println("the number you entered is invalid");
    //                q = 0;
    //
    //            }
    //            
    //        }
    //        
    //        /// here it s the end number of the range 
    //        int r = 0; 
    //        while( r == 0 )
    //        {
    //        
    //            System.out.println(" select the end of your range: \n");
    //         
    //            if(scan.hasNextDouble())
    //            {
    //
    //                Erange = scan.nextDouble();
    //                r = 1;
    //                
    //            }else if(scan.hasNextInt())
    //            {
    //                int m = 0;
    //                m = scan.nextInt();
    //                Erange = int2double(m);
    //                r = 1;
    //            }
    //            else
    //            {
    //
    //                System.out.println("the number you entered is invalid");
    //                r = 0;
    //            }
    //        
    //        }
    //    
    //    }
    
}
