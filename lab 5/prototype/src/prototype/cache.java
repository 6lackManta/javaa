/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.Hashtable;

/**
 *
 * @author awais
 */
public class cache {
    
    private static Hashtable <String,shape> ht = new Hashtable<String,shape>();
   
    public static shape getshape(String id){
        shape shapes = (shape)ht.get(id);
        return (shape)shapes.clone();
    }
public  static void loadcache(){
   circle cs = new circle();
   cs.setId("1");
   ht.put(cs.getId(),cs);
   
   circle cst = new circle();
   cst.setId("5");
   ht.put(cst.getId(), cst);
   rect rs = new rect();
  rs.setId("2");
  ht.put(rs.getId(), rs);
   
     square sr = new square();
 sr.setId("3");
  ht.put(sr.getId(), sr);
   
    
    
    
}    

}
