/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package newpackage;

import java.util.ArrayList;

/**
*
* @author Stud_17
*/
public class BirdsTest {
    public static void main(String[] args){
       
        
        Martlet aMartlet = new Martlet();
// aMartlet.makeNoize();
        
        Pigeon aPigeon = new Pigeon();
// aPigeon.makeNoize();
        
        Magpie aMagpie = new Magpie();
// aMagpie.makeNoize();
        
        
        ArrayList<Birds> birdsList= new ArrayList<Birds>();
        birdsList.add(aMartlet);
        birdsList.add(aPigeon);
        birdsList.add(aMagpie);
        
        for (Birds birds : birdsList){
            birds.makeNoize();
        }
        
        ArrayList<Parrot> parrotList= new ArrayList<Parrot>();
        parrotList.add(aPigeon);
        parrotList.get(0).play();
        
        System.out.println(aPigeon);
        System.out.println(aMagpie);
        
    }
    
}