/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Stud_17
 */
public class Dog extends Animal implements Pet{

    @Override
    public void makeNoize() {
        System.out.println("Dog Noize");
    }

    @Override
    public void play() {
        System.out.println("Dog Playing");
    }
    
}
