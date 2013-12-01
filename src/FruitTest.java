/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author dns
 */
public class FruitTest extends TestCase {
    
    public FruitTest(String testName) {
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
     * Test of Fruit method, of class Fruit.
     */
    public void testFruit() {
        System.out.println("Fruit");
        int number = 3;
        Fruit instance = new Fruit();
        instance.Fruit(number);
        instance.setColor(instance.Red);
        assertEquals(3, instance.getNumber().get(0),0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Vegetable method, of class Fruit.
     */
    public void testVegetable() {
        System.out.println("Vegetable");
        int number = 5;
        Fruit instance = new Fruit();
        instance.Vegetable(number);
        instance.setColor(instance.Red);
        assertEquals(5, instance.getNumber().get(1),0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Fruit.
     */
    public void testSetGetColor() {
        System.out.println("Set Get-Color");
        Fruit instance = new Fruit();
        int aColor = instance.Red;
        assertEquals(true,instance.setColor(aColor));
        assertEquals(instance.Red,instance.getColor());   
        
        assertEquals(true,instance.setColor(instance.Yellow));
        assertEquals(instance.Yellow,instance.getColor());
        
        assertEquals(true,instance.setColor(instance.Green));
        assertEquals(instance.Yellow,instance.getColor());
        
        assertEquals(false,instance.setColor(30));
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
