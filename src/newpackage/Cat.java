/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/**
 *
 * @author Анастасия
 */
public class Cat extends Animal implements Pet{

    @Override
    public void makeNoize() {
        System.out.println("Cat Noize");
    }

    @Override
    public void play() {
        System.out.println("Cat Playing");
    
}
}
