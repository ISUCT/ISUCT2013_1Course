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
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
   

    /**
     * Test of singleValue method, of class Calculator.
     */
    @Test
    public void testSingleValue() {
        System.out.println("singleValue");
        float a = 1.2F;
        float b = 0.48F;
        float x = 0.25F;
        Calculator instance = new Calculator();
        float expResult = 0.081675f;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.001);
       
    }

    /**
     * Test of taskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        Calculator instance = new Calculator();
         float a = 1.2f;
        float b = 0.48f;
//        float x = (float)0.25;
//        
//        
//        x = 0.36f;
//        x = 0.56f;
//        x = 0.94f;
//        x = 1.28f;
//        
       
        float expResult = 0.08167586f;
        expResult = 0.12197685f;
        expResult = 0.2289904f;
                expResult = 0.527368f;
                expResult = 0.92984855f;
        
        
        ArrayList result = instance.taskB();
        
        assertEquals(0.08167586f, result.get(0));
        assertEquals(0.12197685f, result.get(1));
        assertEquals(0.2289904f, result.get(2));
                assertEquals(0.527368f, result.get(3));
                assertEquals(0.92984855f, result.get(4));
        
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of taskA method, of class Calc.
     */
    @Test
    public void testTaskA() {
        System.out.println("taskA");
        float a = 1.2F;
        float b = 0.48F;
        float xn = 0.7f;
        float xk = 2.2f;
        float dx = 0.3f;
        Calculator instance = new Calculator();
//        ArrayList expResult = null;
        ArrayList <Float> result = instance.taskA(a, b, xn, xk, dx);
        assertEquals(0.32633254, result.get(0),0.01);
        assertEquals(0.5840669, result.get(1),0.01);
        assertEquals(0.9684596, result.get(2),0.01);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
       
//        ArrayList result = instance.taskB();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of taskA method, of class Calculator.
//     */
//    @Test
//    public void testTaskA() {
//        System.out.println("taskA");
//        float a = 0.0F;
//        float b = 0.0F;
//        float xn = 0.0F;
//        float xk = 0.0F;
//        float dx = 0.0F;
//        Calculator instance = new Calculator();
////        ArrayList expResult = null;
////        ArrayList result = instance.taskA(a, b, xn, xk, dx);
////        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class Calculator.
     */
  
    }

