/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;
import java.util.ArrayList;
/**
 *
 * @author метро
 */
public class BirdTest {
    

/**
 *
 * @author метро
 */

         public static void main(String[] args){
       
        
        Dove aDove = new Dove();
//        aDove.makeNoize();
        
        Forty aForty = new Forty();
//        aForty.makeNoize();
        
        Sparrow aSparrow = new Sparrow();
//        aSparrow.makeNoize();
        
        
        ArrayList<Bird> birdList= new ArrayList<Bird>();
        birdList.add(aDove);
        birdList.add(aForty);
        birdList.add(aSparrow);
        
        for (Bird bird : birdList){
            bird.makeNoize();
        }
        
        ArrayList<Pet> petList= new ArrayList<Pet>();
        petList.add(aDove);
        petList.get(0).play();
        
        System.out.println(aDove);
        System.out.println(aSparrow);
        
    }
    
}

