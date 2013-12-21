/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author метро
 */
public class Dove extends Bird implements Pet {
//    Dove - Голубь

    @Override
    public void makeNoize() {
        System.out.println("Dove Noize");
    }

    @Override
    public void play() {
        System.out.println("Dove Playing");
    }
}
