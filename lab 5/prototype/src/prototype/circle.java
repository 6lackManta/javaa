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
public class circle extends shape {

//    String type;
    
    public circle(){
        
        type = "circle";
    }
    
    
    @Override
    public void draw() {
        System.out.println("Circle Draw() method::");
    }
    
}
