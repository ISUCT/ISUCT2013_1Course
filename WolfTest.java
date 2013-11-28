/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class WolfTest {
    
    public WolfTest() {
    }
    
    
    
    
    /**
     * Test of moveFvd method, of class Animals.
     */
    @Test
    public void testMoveFvd() {
        System.out.println("moveFvd");
        int distance = 10;
        Animals instance = new Animals();
        instance.setDirection(instance.X_DIRECTION);
        instance.moveFvd(distance);
        assertEquals(10,instance.getCoords().get(0),0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBvd method, of class Animals.
     */
    @Test
    public void testMoveBvd() {
        System.out.println("moveBvd");
        int distance = 10;
        Animals instance = new Animals();
        instance.setDirection(instance.Y_DIRECTION);
        instance.moveBvd(distance);
        assertEquals(0,instance.getCoords().get(1),0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class Animals.
     */


    @Test
    public void testSetGetDirection() {
        System.out.println("Set Get-Direction");
        
        Animals instance = new Animals();
        int aDirection = instance.X_DIRECTION;
        
       
        assertEquals(true,instance.setDirection(aDirection));
        assertEquals(instance.X_DIRECTION,instance.getDirection());
        
        assertEquals(true,instance.setDirection(instance.Y_DIRECTION));
        assertEquals(instance.Y_DIRECTION,instance.getDirection());
        
        assertEquals(false,instance.setDirection(250));
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}