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
 * @author Stud_17
 */
public class CarTest {
    
    public CarTest() {
    }
    
 /**
     * Test of moveFvd method, of class Vehicle.
     */
    @Test
    public void testMoveFvd() {
        System.out.println("Car moveFvd");
        int distance = 10;
        Car instance = new Car();
        instance.setDirection(instance.X_DIRECTION);
        instance.moveFvd(distance);
        assertEquals(10,instance.getCoords().get(0),0);
    }
    @Test
    public void testMoveBvd() {
        System.out.println("Car moveBvd");
        int distance = 10;
        Car instance = new Car();
        instance.setDirection(instance.Y_DIRECTION);
        instance.moveBvd(distance);
        assertEquals(-10,instance.getCoords().get(1),0);
    }
    
    /**
     * Test of setDirection method, of class Vehicle.
     */
    @Test
    public void testSetGetDirection() {
        System.out.println("Car Set Get-Direction");
        
        Car instance = new Car();
        int aDirection = instance.X_DIRECTION;
        assertEquals(true,instance.setDirection(aDirection));
        assertEquals(instance.X_DIRECTION,instance.getDirection());
        
        
        assertEquals(true,instance.setDirection(instance.Y_DIRECTION));
        assertEquals(instance.Y_DIRECTION,instance.getDirection());
        
        assertEquals(false,instance.setDirection(250));
    }
}
