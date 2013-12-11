/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Stud_17
 */
public abstract class Animal {
    String picture;
    String food;
    int hunger;
    int[]boundaries;
    int[]location;
    public abstract void  makeNoize();
    
    public void eat(){
        System.out.println("Animal eat");
    }
    public void sleep(){
        System.out.println("Animal sleep");
    }
    public void roam(){
        System.out.println("Animal roam");
    }
}
