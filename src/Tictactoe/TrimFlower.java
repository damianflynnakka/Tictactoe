/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friday;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package maxmina;

import java.util.Scanner;

/**
 *
 * @author damo
 */


public class TrimFlower {
    
    // remember to make private
    String Flower;
    String Trimmed = ""; 
    char letter; 
    // default answer should be no contininent selected
    int x =10;
    int index; 
    
    Scanner scnz = new Scanner(System.in);

    public void setFlower(String Flower) {
        this.Flower = Flower;
    }

  public void Question ()
          
  {
      System.out.println("Which continent do you want to strore your pw?");
      System.out.println("1 for Europe, 2 Asis, 3, Africa");
      x = scnz.nextInt(); 
     // return x;
  }
  
  public String Trim()
          
  {
      if (x==1)
      {
          letter = Flower.charAt(3);
          Trimmed += letter;
          
          index = Flower.length() -1; 
          
          // print out the length and index -1 
          // because length might be one greater than the highest index
          // System.out.println(index);
          
          letter = Flower.charAt(index);
          Trimmed += letter;
          Trimmed += 'Z';
      }
      
      if (x==2)
      {
          letter = Flower.charAt(1);
          Trimmed += letter;
          
          index = Flower.length() -2; 
          
          // print out the length and index -1 
          // because length might be one greater than the highest index
          // System.out.println(index);
          
          letter = Flower.charAt(index);
          Trimmed += letter;
          Trimmed += 'P';
      }
      
      if (x==3)
      {
          letter = Flower.charAt(4);
          Trimmed += letter;
          
          index = Flower.length() -3; 
          
          // print out the length and index -1 
          // because length might be one greater than the highest index
          // System.out.println(index);
          
          letter = Flower.charAt(index);
          Trimmed += letter;
          Trimmed += 'A';
      }
      
      return Trimmed; 
  }
    
    
    
    
}

