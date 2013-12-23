/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author l
 */
public class Dog extends Animal implements Pet{

    @Override
    public void makeNoize() {
        System.out.println("Dog noize");
    }

    @Override
    public void play() {
        System.out.println("Dog playing");
    }
    
}