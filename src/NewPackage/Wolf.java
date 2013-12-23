/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author l
 */
public class Wolf extends Animal{

    
    @Override
    public String toString() {
        return "I am wolf";
    }
    
    @Override
    public void makeNoize() {
       System.out.println("Wolf noize");
    }
    
}