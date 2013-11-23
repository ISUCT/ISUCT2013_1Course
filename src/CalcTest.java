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
 * @author Stud_17
 */
public class CalcTest {
    
    public CalcTest() {
    }
    
    

    /**
     * Test of singleValue method, of class Calc.
     */
    @Test
    public void testSingleValue() {
        System.out.println("singleValue");
        float a = 2.0F;
        float b = 0.95F;
        float x = 2.2F;
        Calc instance = new Calc();
        float expResult = -0.487649f;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.001);

    }

    /**
     * Test of taskB method, of class Calc.
     */
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        float a = 2.0f;
        float b = 0.95f;
//        float x = (float)2.2;
//        
//        
//        x = 3.78f;
//        x = 4.51f;
//        x = 6.58f;
//        x = 1.2f;
//        
        Calc instance = new Calc();
        float expResult = -0.48764965f;
        expResult = -0.1898679f;
        expResult = -0.13100453f;
                expResult = -0.048951387f;
                expResult = -1.2030663f;
        
        
        ArrayList result = instance.taskB();
        
        assertEquals(-0.48764965f, result.get(0));
        assertEquals(-0.1898679f, result.get(1));
        assertEquals(-0.13100453f, result.get(2));
                assertEquals(-0.048951387f, result.get(3));
                assertEquals(-1.2030663f, result.get(4));
        
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of taskA method, of class Calc.
     */
    @Test
    public void testTaskA() {
        System.out.println("taskA");
        float a = 2.0F;
        float b = 0.95F;
        float xn = 1.25f;
        float xk = 2.75f;
        float dx = 0.3f;
        Calc instance = new Calc();
//        ArrayList expResult = null;
        ArrayList <Float> result = instance.taskA(a, b, xn, xk, dx);
        assertEquals(-1.1344073, result.get(0),0.01);
        assertEquals(-0.82931, result.get(1),0.01);
        assertEquals(-0.63691, result.get(2),0.01);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calc.
     */
   
}
