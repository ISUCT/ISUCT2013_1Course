/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorph;

/**
 *
 * @author Alena_Khruleva
 */
public abstract  class Fish {
     String picture;
    String food;
    int hunger;
    int[]boundaries;
    int[]location;
    public abstract void  makeNoize();
    
    public void eat(){
        System.out.println("Fish eat");
    }
    public void sleep(){
        System.out.println("Fish sleep");
    }
    public void roam(){
        System.out.println("Fish roam");
    }
    
}

