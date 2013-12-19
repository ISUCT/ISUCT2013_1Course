/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package newpackage;

/**
*
* @author Stud_17
*/
public class Pigeon extends Birds implements Pet{

    @Override
    public void makeNoize() {
        System.out.println("Pigeon Noize");
    }

    @Override
    public void play() {
        System.out.println("Pigeon Playing");
    }
    
}