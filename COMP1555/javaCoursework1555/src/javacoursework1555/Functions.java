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

import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;


public class Functions 
{
    
    public static void main( String[] args)
    {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x:");
   
        int x1 = scan.nextInt();
        double x = int2double(x1);
        //System.out.println(F1(x));
        //System.out.println(F2((int) x));
        //System.out.println(F3(x));
 
    }

    /// x-x^2
    static double F1( double a)
    {
//        System.out.println("1:" + a);
        a = a - power( a , 2);
//        System.out.println("2:" + power( a, 2));
//        System.out.println("3:" + a);
        return a ;  
        
    }
    
    //derivative of F1 f'(x)=-2x
    static double F1derive( double a)
    {
    
        a = -2 * a;
        return a;
        
    }
    
    /// ln(x+1)+1
    static double F2(double a)
    {
        
        a = ln( a + 1 ) + 1;
        //System.out.println("1" + a);
        return a;
        
    }
    
    // derivative of F2 f'(x) = 1 / x + 1
    static double F2derive(double a)
    {
    
        a = 1 / a+1;
        return a;
    
    }
    
    static double F3(double a)
    {
    
        a = expo(a) - 3*a;
        return a;
        
    }
    
    // derivative of F3 it end up being the same as F3 but 
    //to not get comfuse when coding i did a method for it 
    static double F3derive(double a)
    {
    
        a = expo(a) - 3;
        return a;
        
    }   
    
    static double int2double(int a)
    {
    
        Double b = new Double(a) ;
        return b;
        
    }
    
    static double power(double a, double b )
    {
        
        a =  Math.pow(a, b);
        //System.out.println(a);
        return a;
        
    }

    static double ln(double a) 
    {
        //System.out.println("2 " + a);
        a = Math.log(a);
        //System.out.println("3 " + a);
        return (double) a;
    
    }
    
    static double expo(double i)
    {
    
        i = Math.exp(i);
        return i;
        
    }
    
//    private static String decimalNumb(double i)
//    {
//    
//        DecimalFormat numberFormat = new DecimalFormat("#.00");
//        //System.out.println(numberFormat.format( i ));
//        String a = numberFormat.format(i);
//        
//        return a;
//    }

}
