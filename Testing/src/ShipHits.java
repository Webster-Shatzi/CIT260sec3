/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShatziWebster
 */
public class ShipHits {
    
      
    
    int getShipHits()
    {
         
        
        int totalBoat = 4;//Testing for the length of the battleship which is 4 spaces long
        int totalHit = 0;
        int hit = totalBoat - totalHit;
        
        if(hit == 2)  
        {
            System.out.println("\nYou have hit the battleship 1 time. You have 3 hits left\n");  
            return -1;
        }
        else if(hit == 2) 
        {
            System.out.println("\nYou have hit my battleship 2 times. You have 2 hits left.\n");
            return -1;
        }
        else if (hit == 3) 
        { 
            System.out.println("\nYou have hit my battleship 3 times. You have 1 hit lef.\n");
        }
        else if (hit == 4)
            
                    {
                    System.out.println("\n You have sunk my battleship!\n");
                    }
        else
        {
            System.out.println("\nThere has been an error. Please try again.");
         }
        return 0;
        
    }
   
    
}
    

