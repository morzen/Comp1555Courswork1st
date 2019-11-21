/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsmean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ic01
 */
// Program to find the mean of a set of numbers stored in an array
class statsmean
{
    public static void main(String[] args)
    {
    double[] a = new double[101];
    int i,numbers;
    double sum,mean;
    numbers=100;
    // initialise the array a using the loop counter
    for (i=1; i<=numbers; i++)
      {
      a[i]=(double)i;
      }
    sum=0;
    for (i=1; i<=numbers; i++) 
      {
      // do summation
      sum = sum + a[i];
      }
         
    // calculate mean
    mean = sum/((double)numbers);
    
    ///VARIANCE
    
    int k;
    List<Double> SumV = new ArrayList<>();
    for (k=1; k<=100; ){
        double variance = (a[k]-mean)/numbers;
            SumV.add(variance);
            k++;
        //System.out.println(SumV.size());
    }
    
    //System.out.println(a[0]);
    double o;
    double y = 0;
    for (o=1; o<=100;){
        y = y + SumV.get(0);
        o++;
                
    }
        //Variance
        double p = Math.pow(y, 2);
    //System.out.println(p);
        //standart deviation
        double standart = Math.sqrt(p);
        //System.out.println(standart);
       
    
    
    System.out.println("mean of numbers between 1 and "+numbers+" is "+mean+ "standart deviation is " +standart );
    }
}
