/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author 1
 */

public class Croc extends Animal{

    
    @Override
    public String toString() {
        return "I am CROC";
    }
    
    @Override
    public void makeNoize() {
       System.out.println("Croc Noize");
    }
    
}