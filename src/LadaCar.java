/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dns
 */
   public class LadaCar extends Technology implements Car{
       
    @Override
    public void makeNoise() {
        System.out.println("LadaCar Signal");
    }

    @Override
    public void accelerate() {
        System.out.println("LadaCar Accelerate");
    }
}
