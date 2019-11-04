
package fw2;

import java.util.Random;


public class Fw2 {

  private static String player[]={"Terrorist","CounterTerrorist"};
  private static String weapons[]={"AK","SMG"};
    public static void main(String[] args) {
        
         for (int i = 0; i < 10; i++) 
        { 
            /* getPlayer() is called simply using the class 
               name since the method is a static one */
            player p = factory.getplayer(getRandPlayerType()); 
  
            /* Assign a weapon chosen randomly uniformly 
               from the weapon array  */
            p.assignweapon(getRandWeapon()); 
  
            // Send this player on a mission 
            p.mission(); 
        } 
        
    }
     public static String getRandPlayerType() 
    { 
        Random r = new Random(); 
  
        // Will return an integer between [0,2) 
        int randInt = r.nextInt(player.length); 
  
        // return the player stored at index 'randInt' 
        return player[randInt]; 
    } 
    public static String getRandWeapon() 
    { 
        Random r = new Random(); 
  
        // Will return an integer between [0,5) 
        int randInt = r.nextInt(weapons.length); 
  
        // Return the weapon stored at index 'randInt' 
        return weapons[randInt]; 
    } 
}
