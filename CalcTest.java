/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

import java.util.ArrayList;
import junit.framework.TestCase;

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
       int b= (int) 2f;       
// float x = (float) 0.08;
// x = (float) 0.026;
// x = (float) 0.37;
// x = (float) 0.48;
// x = (float) 0.56;
        Calc instance = new Calc();
        float expResult = 0.7393338f;
        expResult = 0.5994382f;
        expResult = 0.3213951f;
        expResult = 0.72528476f;
        expResult = 0.2828461f;
        ArrayList<Float> result = instance.taskB();
        assertEquals(0.7393338f, result.get(0));
        assertEquals(0.5994382f, result.get(1));
        assertEquals( 0.3213951f, result.get(2));
        // TODO review the generated test code and remove the default call to fail.
// fail("The test case is a prototype.");
    }

// /**
// * Test of taskA method, of class Calc.
// */
// public void testTaskA() {
// System.out.println("taskA");
// int b= (int) = 3F;
// float xn = 0.11F;
// float xk = 0.05F;
// float dx = 0.36F;
// int i=0;
// Calc instance = new Calc();
// float expResult = 0.7393338f;
//
// }
// ArrayList<Float> result = instance.taskA();
// assertEquals(expResult, result);
//// // TODO review the generated test code and remove the default call to fail.
//// fail("The test case is a prototype.");
// }


}
