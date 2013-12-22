/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorph;

/**
 *
 * @author Alena_Khruleva
 */
public class Carp extends Fish implements Pet  {
  @Override
    public void makeNoize() {
        System.out.println("Carp Noize");
    }

    @Override
    public void play() {
        System.out.println("Carp Playing");
    }
}   

