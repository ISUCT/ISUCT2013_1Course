/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package newpackage;

/**
*
* @author Stud_17
*/
public abstract class Birds {
    String picture;
    String food;
    int hunger;
    int[]boundaries;
    int[]location;
    public abstract void makeNoize();
    
    public void eat(){
        System.out.println("Birds eat");
    }
    public void sleep(){
        System.out.println("Birds sleep");
    }
    public void fly(){
        System.out.println("Birds fly");
    }
}