/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;
import java.util.ArrayList;
/**
 *
 * @author l
 */
public class AnimalsTest {
    public static void main(String[] args){

        Lion aLion = new Lion();
//        aLion.makeNoize();
        
        Dog aDog = new Dog();
//        aDog.makeNoize();
        
        Wolf aWolf = new Wolf();
//        aWolf.makeNoize();
        
        ArrayList<Animal> animalList= new ArrayList<Animal>();
        animalList.add(aLion);
        animalList.add(aDog);
        animalList.add(aWolf);
        
        for (Animal animal : animalList){
            animal.makeNoize();
        }
        
        ArrayList<Pet> petList= new ArrayList<Pet>();
        petList.add(aDog);
        petList.get(0).play();
        System.out.println(aDog);
        System.out.println(aWolf);
    } 
}
