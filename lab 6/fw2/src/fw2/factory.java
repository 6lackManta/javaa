/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fw2;

import java.util.HashMap;

/**
 *
 * @author awais
 */
public class factory {
    public static   HashMap <String, player> hm = new HashMap<String , player>();
    
    public static player getplayer(String type){
    
        player p = null;
        
        if(hm.containsKey(type)){
        
            p=hm.get(type);
        }else{
        
        switch(type){
        
          case "Terrorist": 
                System.out.println("Terrorist Created"); 
                p = new terrorist(); 
                break; 
            case "CounterTerrorist": 
                System.out.println("Counter Terrorist Created"); 
                p = new counterterrorist(); 
                break; 
            default : 
                System.out.println("Unreachable code!"); 
            } 
  
            // Once created insert it into the HashMap 
            hm.put(type, p); 
        } 
        
        return p;
    }
    
}
