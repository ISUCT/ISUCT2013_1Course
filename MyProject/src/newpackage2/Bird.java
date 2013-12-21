/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author метро
 */
public abstract class Bird {
    
    String picture;
    String food;
    int hunger;
    int[]boundaries;
    int[]location;
    public abstract void  makeNoize();
    
    public void eat(){
        System.out.println("Bird eat");
    }
    public void sleep(){
        System.out.println("Bird sleep");
    }
    public void roam(){
        System.out.println("Bird roam");
    }
    
}
