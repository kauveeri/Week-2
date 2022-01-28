/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/**
 *
 * @author Jassu01
 */
public class CardTrick {

    /** Step1 : GENERATE 7 random cards and store in array
     * 52 deck size: 
     * 2 spades 
     * 5 hearts
     * ...7 cards
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card [] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length;i++)
        {//generate 7 random cards and store in array
            Card c = new Card();
            c.setNumbers(2);//(random gen for number/use method);
             c.setSuit("suit by random suit generation");
          magicHand[i]=c; // stores the card object  in arra
           // step: take input gues the card 2 spades find in array- print your card is found
           // do change in remote repository. hard coded details card number =2 hearts found in array  
        }
    }
    
}
