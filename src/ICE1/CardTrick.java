/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICE1;

/** Veerinderjit Kaur  991654376 */
import java.util.Random;

import java.util.Scanner;


/**step 1: generate 7 random cards and store in array 
 * 52 deck size: 
 * 2 spades
 * 5 hearts
 * 1 clubs
 * ... 7 cards
 *
 * @author Jassu01
 * 
 */
public class CardTrick {

    
    
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);    
      Card[] magicHand = new Card[7];//Array of object 
            
              
                       
                 for (int i=0 ; i<magicHand.length ; i++)
      {
        // step 1: generate 7 random cards and store in array
         Card c= new Card();
          c.setNumbers((int)(Math.random()*14)); //random generation for number/use method
 
      String [] Suit  = {"hearts", "spades","diamonds","clubs"};
      
       
                   Random random = new Random ();
      
                int n = random.nextInt(3); // stores the card object  in array
               
         System.out.println(c.getNumbers() + " " + Suit[n]);
    }
      
      //step 2: take input guess the card 2 spades find in array - print your card is found
           
      
  
     System.out.println("Enter a number 1 to 13 ");
       int x = input.nextInt();
       
        System.out.println("Enter a suit >hearts , diamonds,clubs,spades ");
       String y = input.next();
   
    
       System.out.println ("Your card is generated");
       

      System.out.println ("Your card is generated");
  
       // step 3 do change in remote repository. hard coded card details card number =2,hearts to find in array
                        
    }     
}
