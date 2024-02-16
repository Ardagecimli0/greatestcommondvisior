
package greatestcommondivisor;

import java.util.Scanner;

public class Greatestcommondivisor {
    
    
    
    public static void gcd(int a, int b) {
        
       int gcd = 1;
     
        
         
       for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                
                gcd = i;
                
                
                
            }
            
      
    }
        
        System.out.println("The greatest common divisor is" + gcd);
        
        
        
    }

    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       
       
       
        System.out.println("Find the greatest common with  divisor with in 2 numebrs program");
        System.out.println("********************************************");
        
        
        System.out.println("Enter first number");
        int a = scn.nextInt();
        System.out.println("Enter second number");
        int b = scn.nextInt();
        
        gcd(a, b);
        
        
        
        
        
        
        
        
        
    }
    
}
