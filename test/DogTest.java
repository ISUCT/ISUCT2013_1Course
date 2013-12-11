/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;/**
 *
 * @author dns
 */
public class DogTest {
    

    /**
     * Test of moveFvd method, of class Dog.
     */
    @org.junit.Test
    public void testMoveFvd() {
        System.out.println("moveFvd");
        int distance = 10;
        Dog instance = new Dog();
         instance.setDirection(instance.X_DIRECTION);
       instance.moveFvd(distance);
        assertEquals(10,instance.getCoords().get(0),0);        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBvd method, of class Dog.
     */
    @org.junit.Test
    public void testMoveBvd() {
        System.out.println("moveBvd");
        int distance = 10;
       Dog instance = new Dog();
        instance.setDirection(instance.Y_DIRECTION);
       instance.moveBvd(distance);
         assertEquals(-10,instance.getCoords().get(1),0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class Dog.
     */
    @org.junit.Test
    public void testTurn() {
        System.out.println("turn");
        Dog instance = new Dog();
        instance.turn();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoords method, of class Dog.
     */
    @org.junit.Test
    public void testGetCoords() {
        System.out.println("getCoords");
        Dog instance = new Dog();
        ArrayList expResult =null;
        ArrayList result = instance.getCoords();
        assertEquals(expResult,null);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Dog.
     */
    @org.junit.Test
    public void testSetDirection() {
        System.out.println("setDirection");
        
//        
        Dog instance = new Dog();
        int aDirection = instance.X_DIRECTION;
       assertEquals(true,instance.setDirection(aDirection));
         assertEquals(instance.X_DIRECTION,instance.getDirection());
         
         
         assertEquals(true,instance.setDirection(instance.Y_DIRECTION));
         assertEquals(instance.Y_DIRECTION,instance.getDirection());
         
    assertEquals(false,instance.setDirection(250));
    }

    /**
     * Test of getDirection method, of class Dog.
     */
    @org.junit.Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Dog instance = new Dog();
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
