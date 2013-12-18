/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.src;

import java.util.ArrayList;
import junit.framework.TestCase;
import src.Toys;

/**
 *
 * @author -
 */
public class ToysTest extends TestCase {
    
    public ToysTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of moveFvd method, of class Toys.
     */
    public void testMoveFvd() {
        System.out.println("moveFvd");
        int distance = 0;
        Toys instance = new Toys();
        instance.moveFvd(distance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBvd method, of class Toys.
     */
    public void testMoveBvd() {
        System.out.println("moveBvd");
        int distance = 0;
        Toys instance = new Toys();
        instance.moveBvd(distance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class Toys.
     */
    public void testTurn() {
        System.out.println("turn");
        Toys instance = new Toys();
        instance.turn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoords method, of class Toys.
     */
    public void testGetCoords() {
        System.out.println("getCoords");
        Toys instance = new Toys();
        ArrayList expResult = null;
        ArrayList result = instance.getCoords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Toys.
     */
    public void testSetDirection() {
        System.out.println("setDirection");
        int aDirection = 0;
        Toys instance = new Toys();
        boolean expResult = false;
        boolean result = instance.setDirection(aDirection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class Toys.
     */
    public void testGetDirection() {
        System.out.println("getDirection");
        Toys instance = new Toys();
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
