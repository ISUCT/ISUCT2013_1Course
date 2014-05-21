/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alena_Khruleva
 */
public class BunnyTest {
    
    public BunnyTest() {
    }
    

    /**
     * Test of moveFvd method, of class Bunny.
     */
    @Test
    public void testMoveFvd() {
        System.out.println("moveFvd");
        int distance = 10;
        Bunny instance = new Bunny();
         instance.setDirection(instance.X_DIRECTION);
       instance.moveFvd(distance);
        assertEquals(10,instance.getCoords().get(0),0);        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBvd method, of class Bunny.
     */
    @Test
    public void testMoveBvd() {
        System.out.println("moveBvd");
        int distance = 10;
        Bunny instance = new Bunny();
        instance.setDirection(instance.Y_DIRECTION);
       instance.moveBvd(distance);
         assertEquals(-10,instance.getCoords().get(1),0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class Bunny.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        Bunny instance = new Bunny();
        instance.turn();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoords method, of class Bunny.
     */
    @Test
    public void testGetCoords() {
        System.out.println("getCoords");
        Bunny instance = new Bunny();
        ArrayList expResult =null;
        ArrayList result = instance.getCoords();
        assertEquals(expResult,null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Bunny.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        
//        
        Bunny instance = new Bunny();
        int aDirection = instance.X_DIRECTION;
       assertEquals(true,instance.setDirection(aDirection));
         assertEquals(instance.X_DIRECTION,instance.getDirection());
         
         
         assertEquals(true,instance.setDirection(instance.Y_DIRECTION));
         assertEquals(instance.Y_DIRECTION,instance.getDirection());
         
    assertEquals(false,instance.setDirection(250));
    }

    /**
     * Test of getDirection method, of class Bunny.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Bunny instance = new Bunny();
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
