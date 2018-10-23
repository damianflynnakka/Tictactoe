/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friday;

/**
 *
 * @author damo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package maxmina;

/**
 *
 * @author damo
 */
public class Country {
    
    
    String seed;
    String flower = ""; 
    char l;

    public void setSeed(String seed) {
        this.seed = seed;
    }
    
    public String GrowSeed (){
        
        for (int i=0; i<seed.length(); i++){
           l = seed.charAt(i); 
           
           if (l == 'a' || l== 'h')
           {
               flower += 'x';
               flower += '%';
           }
           
           if (l == 'b' || l == 'i')
           {
               flower += '1';
               flower += '!';
           }
           
           if (l == 'c' || l == 'j')
           {
               flower += 'f';
               flower += '3';
           }
           
           if (l == 'd' || l=='k')
           {
               flower += '^';
               flower += '9';
           }
           
           if (l == 'e' || l == 'l')
           {
               flower += '2';
               flower += '*';
           }
           
           if (l == 'f' || l == 'm')
           {
               flower += '/';
               flower += '$';
           }
           
           if (l == 'g' || l == 'n')
           {
               flower += '1';
               flower += '!';
           }
           
            if (l == 'o' || l == 'z')
           {
               flower += '@';
               flower += '3';
               flower += '3';
               
           }
            
             if (l == 'p' || l == 'y')
           {
               flower += 'Y';
               flower += '(';
               flower += '0';
           }
             
          
             if (l == 'q' || l == 'x')
           {
               flower += '#';
               flower += '&';
               flower += '7';
           }
             
              if (l == 'r' || l == 'w')
           {
               flower += 'a';
               flower += '&';
               flower += ';';
           }
              
               if (l == 's' || l == 'v')
           {
               flower += ':';
               flower += 'B';
               flower += '1';
           }
               
                if (l == 't' || l == 'u')
           {
               flower += 'A';
               flower += 'c';
               flower += '-';
           }
             
             
            
            
           
           
       /*    else {
               flower += l;
           }*/


        }
        

        return flower;
    }
    
}


