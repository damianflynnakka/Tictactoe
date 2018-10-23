/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tictactoe;

import java.util.Scanner;

/**
 *
 * @author damo
 */
public class TictactoeApp {
    
    public static void main(String[] args)
    
    {
        char a = 'a'; char b ='b'; char c = 'c';
        char d = 'd'; char e = 'e'; char f = 'f';
        char g = 'g'; char h = 'h'; char i = 'i';
        
        table tblo = new table (); 
        
        Scanner sc = new Scanner(System.in);
       
        
   //     for (int x= 1; i< 10; i++)
        
   //     {
            
            System.out.println("heellleooo");
            
            System.out.println(a + "\t" + b + "\t" + c + "\t");
            System.out.println(d + "\t" + e + "\t" + f + "\t");
            System.out.println(g + "\t" + h + "\t" + i + "\t");         
   //     }
   
   
    System.out.println("please choose a letter");
        
        String z = sc.nextLine();
        
        System.out.println(z);
        
        if (z.equals("a")){
            
            tblo.setA('x');
            
        }else  if (z.equals("b")){
            
           tblo.setB('x');
  
            
        } else  if (z.equals("c")){
            
           tblo.setC('x');
  
            
        }
        
        tblo.ShowTable();
        
        
        
        
        
    }
    
    
 
    
    
}
