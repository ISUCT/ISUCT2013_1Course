/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.src;

import java.util.ArrayList;
import junit.framework.TestCase;
import src.Calc;

/**
 *
 * @author -
 */
public class CalcTest extends TestCase {
    
    public CalcTest(String testName) {
        super(testName);
    }
    
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    /**
     * Test of singleValue method, of class Calc.
     */
    public void testSingleValue() {
        System.out.println("singleValue");
        float a = 0.4F;
        double b = 0.8F;
        float x = 4.48F;
        Calc instance = new Calc();
        float expResult = 0.0F;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskB method, of class Calc.
     */
    public void testTaskB() {
        System.out.println("taskB");
        Calc instance = new Calc();
        ArrayList expResult = null;
        ArrayList result = instance.taskB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskA method, of class Calc.
     */
    public void testTaskA() {
        System.out.println("taskA");
        float a = 0.0F;
        float b = 0.0F;
        float xn = 0.0F;
        float xk = 0.0F;
        float dx = 0.0F;
        Calc instance = new Calc();
        ArrayList expResult = null;
        ArrayList result = instance.taskA(a, b, xn, xk, dx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calc.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calc.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
