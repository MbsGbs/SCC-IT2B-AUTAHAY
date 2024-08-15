
package mabsprojectzero;

import java.util.Scanner;

public class AgeCalculatorAUTAHAY {
    
    public void getAge (){
            Scanner input = new Scanner (System.in);
        
         String fname;
         int byear; 
         
         System.out.print("Enter your name: ");
         fname = input.nextLine(); 
        
          System.out.print("Enter birth year: ");
          byear = input.nextLine();
          
        System.out.println("HELLO " +fname+"\nyour age is "+(byear));
    }
}
