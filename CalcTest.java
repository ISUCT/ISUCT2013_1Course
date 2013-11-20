/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.Calc;
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
    


    /**
     * Test of singleValue method, of class Calc.
     */
    @Test
    public void testSingleValue() {
        System.out.println("singleValue");
        float a = 0.0F;
        double b = 0.0;
        float x = 0.0F;
        Calc instance = new Calc();
        float expResult = 0.0F;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

//    /**
//     * Test of taskB method, of class Calc.
//     */
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        float a = 2.5F;
        double b = 4.6F;
        Calc instance = new Calc();
        float expResult = 95.659744f;
        expResult = 105.92978f;
        expResult = 116.801056f;
        expResult = 131.24861f;
        expResult = 304.26654f;
        ArrayList result = instance.taskB();
        assertEquals(95.659744f, result.get(0));
        assertEquals(105.92978f, result.get(1));
        assertEquals(116.801056f, result.get(2));
        assertEquals(131.24861f, result.get(3));
        assertEquals(304.26654f, result.get(4));
//        // TODO review the generated test code and remove the default call to fail.
//       
    }
//
//    /**
//     * Test of taskA method, of class Calc.
//     */
    @Test
    public void testTaskA() {
        System.out.println("taskA");
        float a = 2.5F;
        float b = 1.2F;
        Calc instance = new Calc();
        ArrayList result = instance.taskA(a, b);
        assertEquals(18.027462f, result.get(0));
        // TODO review the generated test code and remove the default call to fail.
    }


}
