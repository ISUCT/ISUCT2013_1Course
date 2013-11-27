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
 * @author метро
 */
public class BarbaraTest {
    
    public BarbaraTest() {
    }
    
    

    @Test
    public void testMoveFvd() {
        System.out.println("Car moveFvd");
        int distance = 10;
        Barbara instance = new Barbara();
        instance.setDirection(instance.X_DIRECTION);
        instance.moveFvd(distance);
        assertEquals(10,instance.getCoords().get(0),0);
    }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
    
    @Test
    public void testMoveBvd() {
        System.out.println("Car moveBvd");
        int distance = 10;
        Barbara instance = new Barbara();
        instance.setDirection(instance.Y_DIRECTION);
        instance.moveBvd(distance);
        assertEquals(-10,instance.getCoords().get(1),0);
    }
    
    public void testSetGetDirection() {
        System.out.println("Car Set Get-Direction");
        
        Barbara instance = new Barbara();
        int aDirection = instance.X_DIRECTION;
        assertEquals(true,instance.setDirection(aDirection));
        assertEquals(instance.X_DIRECTION,instance.getDirection());
        
        
        assertEquals(true,instance.setDirection(instance.Y_DIRECTION));
        assertEquals(instance.Y_DIRECTION,instance.getDirection());
        
        assertEquals(false,instance.setDirection(250));
    }
    
    }

