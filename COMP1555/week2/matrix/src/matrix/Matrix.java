/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.io.*;
import java.lang.reflect.Array;
//import java.io.Console;

//import BreezyGUI.*;
import java.util.*;
import java.util.Scanner;




       
/**
 *
 * @author barnabe
 */

public class Matrix {
    
    /**
     * @param args the command line arguments
     */
    
    
  
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int rowA = 0;
        int columnA = 0;
        
        int rowB = 0;
        int columnB = 0;
        
        
 
        
        int o = 15;  
         
         while(o == 15){ 
                Scanner input = new Scanner(System.in);
                
                System.out.println("the matrix A being an nxn please enter n no larger than 5:");
                int number = input.nextInt();
                
                while(number > 5){
                    System.out.println("the matrix A being an nxn please enter n no larger than 5:");
                    number = input.nextInt();
                }
                
                rowA = number;
                columnA = number;
                o = 14;
                
                //System.out.println(rowA + "and "+ columnA);
         
         }
         
         
         int p = 15;
         while(p == 15){ 
                Scanner input = new Scanner(System.in);
                
                System.out.println("the matrix B being an nxn please enter n no larger than 5:");
                int number = input.nextInt();
                
                while(number > 5){
                    System.out.println("the matrix B being an nxn please enter n no larger than 5:");
                    number = input.nextInt();
                }
                
                rowB = number;
                columnB = number;
                p = 14;
                
                //System.out.println(rowA + "and "+ columnA);
         
         }
        
            

            
                
            
            
            
            
    
        int [][] matrixA = new int [rowA][columnA];
        
        int [][] matrixB = new int [rowB][columnB];
        
        
        /// filling up matrix A
        
        

        
        int row = 0;
        int q = 15;
        while( q == 15 ){
        
            
           
//            int arr [] = new int[rowA];
//            Scanner scan = new Scanner(System.in);//.useDelimiter(",");
//            System.out.println("please enter the  row for matrixA");
//
//                for(int i=0; i < rowA; i++){
//                    arr[i]=scan.nextInt();
//                }
//
//                for(int i: arr){
//
//                    System.out.println(i);
//                    
//
//                }
                
                
        int arr [] = new int[rowA];
        Scanner scan = new Scanner(System.in);//.useDelimiter(",");

        for(int n = 0; n < rowA; n++){
            
            System.out.println("please enter the " + n + " row for matrixA");
                for(int i=0; i < rowA; i++){
                    arr[i]=scan.nextInt();
                }
                System.out.println(Arrays.toString(arr) + "is row " + n);
            
            for(int m = 0; m < columnA; m++)
                
                
                
                
                matrixA[n][m] = arr[m];
            }
        
        
        /// filling matrixB
        
        int arr2 [] = new int[rowB];
       

        for(int n = 0; n < rowB; n++){
            
            System.out.println("please enter the " + n + " row for matrixB");
                for(int i=0; i < rowB; i++){
                    arr2[i]=scan.nextInt();
                }
                System.out.println(Arrays.toString(arr2) + "is row " + n + "\n");
            
            for(int m = 0; m < columnB; m++)
                
               
                
                
                matrixB[n][m] = arr2[m];
            }
        
            
                
        
                
                 
                
            
            
            
            

            
            
            
            
            q = 14;
            
        }


        
          ///print the matrix
          System.out.println(Arrays.deepToString(matrixA).replace("],","]\n") + "    matrixA\n");
          System.out.println(Arrays.deepToString(matrixB).replace("],","]\n") + "    matrixB\n");
        
        
        
       
        
          /// calculs
          
          
          
//          System.out.println("which calcul would you like to realise a.A+B b.A-B c.AxA d.B^2 e.B^6 f.A^10");
//          Scanner ans = new Scanner(System.in);
//          String answer = ans.nextLine();
          int r = 0;
          int [][] result = new int [rowA][columnA];
          int [][] resultA = new int [rowA][columnA];
          int [][] resultB = new int [rowB][columnB];
          
         while( r == 0){
             
             System.out.println("which calcul would you like to realise 1.A+B 2.A-B 3.AxA 4.B^2 5.B^6 6.A^10 \n");
             Scanner ans = new Scanner(System.in);
             int answer = ans.nextInt();
             //System.out.println(answer);
             
                if(answer == 1){
                ///a. A+B
                
                    if(rowA + columnA == rowB + columnB)
                    {
                        
                        for(int j = 0; j < rowA; j++){
                            for(int i = 0; i < columnA; i++){
                                //System.out.println("was here"+ i + j + "time");
                                result[j][i] = matrixA[j][i] + matrixB[j][i];
                                
                                    }
                    
                                }
                         System.out.println(Arrays.deepToString(result).replace("],","]\n") + "    result");
                    }
                     
                    else{
                    System.out.println(" the matrix are incompatible they need to be the same size \n");
                    }

                
                    r = 1;
                } 
                //A-B
                else if(answer == 2){
                    
                    if(rowA + columnA == rowB + columnB)
                    {
                        
                        for(int j = 0; j < rowA; j++){
                            for(int i = 0; i < columnA; i++){
                                //System.out.println("was here"+ i + j + "time");
                                result[j][i] = matrixA[j][i] - matrixB[j][i];
                                
                                    }
                    
                                }
                         System.out.println(Arrays.deepToString(result).replace("],","]\n") + "    result");
                    }
                     
                    else{
                    System.out.println(" the matrix are incompatible they need to be the same size \n");
                    }

                
                    r = 1;

                }
                
                ///A^2
                else if(answer == 3){
                     
                    
                    for(int j = 0; j < rowA; j++){
                            for(int i = 0; i < columnA; i++){
                                //System.out.println("was here"+ i + j + "time");
                                result[j][i] = matrixA[j][i] * matrixA[j][i];
                                
                                    }
                    
                                }
                         System.out.println(Arrays.deepToString(result).replace("],","]\n") + "    result");
                    
                    r = 1;
                }
                //B^2
                else if(answer == 4){
                    
                    
                    for(int j = 0; j < rowB; j++){
                            for(int i = 0; i < columnB; i++){
                                //System.out.println("was here"+ i + j + "time");
                                result[j][i] = matrixB[j][i] * matrixB[j][i];
                                
                                    }
                    
                                }
                         System.out.println(Arrays.deepToString(result).replace("],","]\n") + "    result");
                    
                         r = 1;
                    
                }
                //B^6
                else if(answer == 5){
                    //int k = 0 ;
                  // while( k <= 6){ 
                    for(int j = 0; j < rowB; j++){
                            for(int i = 0; i < columnB; i++){
                                System.out.println("was here"+ j + i + "time");
                                System.out.println(matrixB[j][i]);
                                int nombre1 = matrixB[j][i];
                                double nombre2 = nombre1;
                                        double nombre3 = (Math.pow(nombre2 , 6));
                                        int nombre4 = (int) nombre3;
                                        System.out.println(nombre4);
                                        resultB[j][i] = nombre4;
                                          
                                            }
                                
                                    }
                                // k++;       
                               // }
                         System.out.println(Arrays.deepToString(resultB).replace("],","]\n") + "    result");
                    r = 1;

                }
                //A^10
                else if(answer == 6){
                    
                    for(int j = 0; j < rowA; j++){
                            for(int i = 0; i < columnA; i++){
                                //System.out.println("was here"+ j + i + "time");
                                //System.out.println(matrixA[j][i]);
                                int nombre1 = matrixA[j][i];
                                double nombre2 = nombre1;
                                        double nombre3 = (Math.pow(nombre2 , 10));
                                        int nombre4 = (int) nombre3;
                                        //System.out.println(nombre4);
                                        resultA[j][i] = nombre4;
                                          
                                            }
                                
                                    }
                       System.out.println(Arrays.deepToString(resultA).replace("],","]\n") + "    result");
                       r = 1;
                }

                else{
                       System.out.println("please enter one of the possible option 1,2,3,4,5 or 6 \n");
                       r = 0;
                       }
          
            } 
          
          
        
        
        
        
    }

    
        
            
            
   
        
        
        
    

}
