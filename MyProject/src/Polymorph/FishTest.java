/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorph;

import java.util.ArrayList;

/**
 *
 * @author Alena_Khruleva
 */

    public class FishTest {
    
      public static void main(String[] args){
       
        
       Carp aCarp = new Carp();
//        aCarp.makeNoize();
        
        Hake aHake = new Hake();
//        aHake.makeNoize();
        
        Shake aShake = new Shake();
//        aShake.makeNoize();
        
        
        ArrayList<Fish> fishList= new ArrayList<Fish>();
        fishList.add(aCarp);
        fishList.add(aHake);
        fishList.add(aShake);
        
        for (Fish fish : fishList){
            fish.makeNoize();
        }
        
        ArrayList<Pet> petList= new ArrayList<Pet>();
        petList.add(aCarp);
        petList.get(0).play();
        
        System.out.println(aCarp);
        System.out.println(aShake);
        
    }
    
}

