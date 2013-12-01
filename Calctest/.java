/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author stud_17
 */
public class CalcTest extends TestCase {
    
    public CalcTest(String testName) {
        super(testName);
    }
    

    /**
     * Test of singleValue method, of class Calc.
     */
    public void testSingleValue() {
        System.out.println("singleValue");
        float b = 1.0F;
        float x = 1.0F;
        Calc instance = new Calc();
        float expResult = 1.4499494F;
        float result = instance.singleValue(b, x);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of taskB method, of class Calc.
     */
    public void testTaskB() {
        System.out.println("taskB");
        float b = 0.98f;
//        float x = (float) 0.35;
//        x = (float) 1.28;
//        x = (float) 3.51;
//        x = (float) 5.21;
//        x = (float) 4.16;
        Calc instance = new Calc();
        float expResult = 0.7393338f;
        expResult = 0.5994382f;
        expResult = 0.3213951f;
        expResult = 0.72528476f;
        expResult = 0.2828461f;
        ArrayList<Float> result = instance.taskB();
        assertEquals(0.7393338f, result.get(0), 0.0);
        assertEquals(0.5994382f, result.get(1), 0.0);
        assertEquals(0.3213951f, result.get(2), 0.0);
        assertEquals(0.72528476f,result.get(3), 0.0);
        assertEquals(0.2828461f,result.get(4), 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of taskA method, of class Calc.
//     */
    public void testTaskA(float b, float xn, float xk, float dx) {
        System.out.println("taskA");
//        float b = 0.4F;
//        float xn = 1.23F;
//        float xk = 7.23F;
//        float dx = 1.2F;
        Calc instance = new Calc();
        ArrayList<Float> result = instance.taskA(2.5f, 1.28f, 3.28f, 0.4f);
        assertEquals(0.6965185f, result.get(0), 0.0);
        assertEquals(0.7313025f, result.get(1), 0.0);
        assertEquals(0.4253013f, result.get(2), 0.0);
        assertEquals(0.40242705f, result.get(3), 0.0);
        assertEquals(0.57020336f, result.get(4), 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }


}
