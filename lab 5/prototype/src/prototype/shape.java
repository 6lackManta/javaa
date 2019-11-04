/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author awais
 */
public abstract class shape implements Cloneable{
    
    String id;
    String type;
    
   public String gettype(){
       return type;
   }
   public abstract void draw();
   public String getId(){
   return id;
   } 
  
   public void setId(String id){
       this.id = id;
   }
   
   public Object clone(){
   Object clone = null;
   try{
       clone = super.clone();
   }catch(CloneNotSupportedException e ){
       e.printStackTrace();
   }
   return clone;
   }
    
}
