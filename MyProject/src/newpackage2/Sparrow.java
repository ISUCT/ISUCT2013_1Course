/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author метро
 */
public class Sparrow extends Bird {
//    Sparrow - воробей
    

    
    @Override
    public String toString() {
        return "I am SPARROW";
    }
    
    @Override
    public void makeNoize() {
       System.out.println("Sparrow Noize");
    }
}
