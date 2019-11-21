/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumofarray;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author ic01
 */
// Program to find the maximum element of an array
class maximumofarray
{
    public static void main(String[] args)
    {
    double maximum;
    int i;
    double [] a={1.5,2.3,4.2,-9.4,2.0,12.9,-5.0,12.9,-0.1,-15.0,0.0};
    maximum=a[0];
    for (i = 1; i <= 10; i++) 
      {
      if (a[i] > maximum)
        {
        maximum = a[i];
        }
      }
    
    
    int k = 0;
    List<Integer> location = new ArrayList<>();
    ///System.out.println(a[0]);
    for (int j = 0; j <= 10; j++){
       
        if (a[j] == maximum){
          /// System.out.println(j);
           location.add(j);
          
           k++;
           
        }
    }
          
    
    
    
    
    
    System.out.println("The maximum element is "+maximum +"and it s location is/are " + location);
    }
}
