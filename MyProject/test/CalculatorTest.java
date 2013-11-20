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
 * @author метро
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    

    /**
     * Test of singleValue method, of class Calculator.
     */
    @Test
    public void testSingleValue() {
        System.out.println("singleValue");
        float a = 0.0F;
        double b = 0.0;
        float x = 0.0F;
        Calculator instance = new Calculator();
        float expResult = 0.0F;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of taskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        float a = 2F;
        double b = 2.3;
        float[] X = {0};
        Calculator instance = new Calculator();
        float expResult = 4.347980f;
        ArrayList<Float> result = instance.taskB(a, b, X);
        assertEquals(expResult, result.get(0), 0.001);
//         TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of taskA method, of class Calculator.
     */
    @Test
    public void testTaskA() {
        System.out.println("taskA");
        float a = 1.0F;
        float b = 1.0F;
        float xn = 0.0F;
        float xk = 2.0F;
        float dx = 1.0F;
        
//        x=0 y=0.5
//        x=1 y=4.347980
//        x=2 y=0,015572
        
        Calculator instance = new Calculator();
//        ArrayList expResult = null;
        ArrayList <Float> result = instance.taskA(a, b, xn, xk, dx);
        assertEquals(1.0, result.get (0), 0.0);
        assertEquals(4.347980, result.get (1), 0.001);
        assertEquals(10.553268, result.get (2), 0.001);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
