
package mabsprojectzero;

import java.util.Scanner;

public class Reciept {
 
     public void getRecipe(){
           
            Scanner input = new Scanner (System.in);
          
         String Product;
         int pname, quan, price, cash, cname, ;
         
         
         System.out.print("Customer: ");
         cname = input.nextLine(); 
         
          System.out.print("Product NAme: ");
         pname = input.nextLine(); 
         
          System.out.print("Quantity: ");
         quan = input.nextLine();
         
          System.out.print("Price: ");
          price=input.nextInt (); 
         
         System.out.print("Enter cash ammount: ");
         cash = input.nextInt (); 
         
              System.out.println("\n--------------------------- ");
              System.out.println("Recipe");
              System.out.println("\n--------------------------- "); 
              
                 System.out.println("\nCostumer: "+cname+"\nProduct: "+product+"\nQuantity; "+quan);
                 
                 System.out.print("\n--------------------------- ");
                 
                    System.out.print("\nTotal Due: "+(quan*price)+"\nCash"+(cash));
                    
                       System.out.print("\nChange: "+(cash*price));
                 
                 
              
              
         
         
         
         
    
}
