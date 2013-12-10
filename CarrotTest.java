/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carrot;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 176
 */
public class CarrotTest {
    
    public CarrotTest() {
    }
    
    

    /**
     * Test of setDirection method, of class Carrot.
     */
    @Test
    public void testMoveFvd() {
        System.out.println("carrot move Bvd");
        int distance = 6;
        Carrot instance = new Carrot();
         instance.setDirection(instance.X_DIRECTION);
        instance.moveFvd(distance);
       assertEquals(6,instance.getCoords().get(0),0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test

    public void testMoveBvd() {

       System.out.println("Car moveBvd");
        int distance = 9;

        Carrot instance = new Carrot();

        instance.setDirection(instance.Y_DIRECTION);

        instance.moveBvd(distance);

        assertEquals(-9,instance.getCoords().get(1),0);

    }

    

   /**

     * Test of setDirection method, of class Vehicle.

     */

    @Test

    public void testSetGetDirection() {

       System.out.println("Carrot Set Get-Direction");

        

       Car instance = new Car();

        int aDirection = instance.X_DIRECTION;

        assertEquals(true,instance.setDirection(aDirection));

        assertEquals(instance.X_DIRECTION,instance.getDirection());

        

        
       assertEquals(true,instance.setDirection(instance.Y_DIRECTION));
        assertEquals(instance.Y_DIRECTION,instance.getDirection());

        

        assertEquals(false,instance.setDirection(250));
    }

}