/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fw2;

/**
 *
 * @author awais
 */
public class terrorist implements player{
String task;
public String weapon;

public terrorist(){
task = "Plant a Bomb";
}

@Override
    public void assignweapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {

        System.out.println("Player with weapon ::" + weapon + " Task is " + task);

        
    }
    
}
