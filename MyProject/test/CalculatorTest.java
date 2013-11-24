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
 * @author Alena_Khruleva
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
        int a = 0;
        float x = 10f;
        Calculator instance = new Calculator();
        float expResult = 0.01f;
        float result = instance.singleValue(a, x);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of taskB method, of class Calculator.
     */
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        Calculator instance = new Calculator();
        
        ArrayList<Float> result = instance.taskB();
        assertEquals(0.025004, result.get(0),0.001);
        assertEquals(0.025, result.get(1),0.001);
        assertEquals(0.024247, result.get(2),0.001);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of taskA method, of class Calculator.
     */
    @Test
    public void testTaskA() {
        System.out.println("taskA");
        int a = 1;
        float xn = 0.0F;
        float xk = 2.0F;
        float dx = 1.0F;
//        x=0 y = 100
//        x=1 y=2500
//        x=2 y = 111.111
        Calculator instance = new Calculator();

        ArrayList<Float> result = instance.taskA(a, xn, xk, dx);
        assertEquals(0,result.get(0), 0.0);
        assertEquals(0.022654,result.get (1), 0.001);
        assertEquals(0.025293,result.get (2), 0.001);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of main method, of class Calculator.
     */
  
}
