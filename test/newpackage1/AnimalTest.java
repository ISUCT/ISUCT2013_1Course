/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.ArrayList;

/**
 *
 * @author 1
 */
public class AnimalTest   {
    public static void main(String[] args){
       
        
        Bear aBear = new Bear();
//        aBear.makeNoize();
        
        Cat aCat = new Cat();
//        aCat.makeNoize();
        
        Croc aCroc = new Croc();
//        aCroc.makeNoize();
        
        
        ArrayList<Animal> animalList= new ArrayList<Animal>();
        animalList.add(aBear);
        animalList.add(aCat);
        animalList.add(aCroc);
        
        for (Animal animal : animalList){
            animal.makeNoize();
        }
        
        ArrayList<Pet> petList= new ArrayList<Pet>();
        petList.add(aCat);
        petList.get(0).play();
        
        System.out.println(aCat);
        System.out.println(aCroc);
        
    }
    
}