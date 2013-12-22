/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author Анастасия
 */

public class AnimalsTest {
    public static void main(String[] args){
       
        
        Cat aCat = new Cat();
//        aCat.makeNoize();
        
        Fox aFox = new Fox();
//        aFox.makeNoize();
        
        Tiger aTiger = new Tiger();
//        aTiger.makeNoize();
        
        
        ArrayList<Animal> animalList= new ArrayList<Animal>();
        animalList.add(aCat);
        animalList.add(aFox);
        animalList.add(aTiger);
        
        for (Animal animal : animalList){
            animal.makeNoize();
        }
        
        ArrayList<Pet> petList= new ArrayList<Pet>();
        petList.add(aFox);
        petList.add (aCat);
        petList.get(0).play();
        petList.get(1).play();
        
        System.out.println(aFox);
        System.out.println(aTiger);
        
    }
    
}

