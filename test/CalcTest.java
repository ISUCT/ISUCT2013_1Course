package test;

import java.util.ArrayList;
import junit.framework.TestCase;
import src.Calc;

public class CalcTest extends TestCase {
    
    public CalcTest(String testName) {
        super(testName);
    }

    public void testSingleValue() {
        System.out.println("singleValue");
        float a = 0.4F;
        double b = 0.8F;
        float x = 4.48F;
        Calc instance = new Calc();
        float expResult = 1.1676768F;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of taskB method, of class Calc.
     */
    public void testTaskB() {
        System.out.println("taskB");
        float a = 0.4F;
        double b = 0.8F;
//        float x = 4.48F;
//        x = 4.48;
//        x = 3.56;
//        x = 2.78;
//        x = 5.28;
//        x = 3.21;
        Calc instance = new Calc();
        float expResult = 1.1676768f;
        expResult = 1.3737649f;
        expResult = 1.5263209f;
        expResult = 0.99628013f;
        expResult = 1.4475756f;  
        
        ArrayList result = instance.taskB();
       
        assertEquals(1.1676768f,result.get(0));
        assertEquals(1.3737649f,result.get(1));
        assertEquals(1.5263209f,result.get(2));
        assertEquals(0.99628013f,result.get(3));
        assertEquals(1.4475756f,result.get(4));        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of taskA method, of class Calc.
     */
    public void testTaskA(float a, float b,float xn, float xk, float dx) {
        System.out.println("taskA");
//        float a = 0.4F;
//        double b = 0.8F;
//        float x = 4.48F;
//        float xn = 3.2f;
//        float xk = 6.2f;
//        float dx = 0.6f;
        Calc instance = new Calc();
//        ArrayList expResult = null;
        ArrayList result = instance.taskA(0.4f, 0.8f, 3.2f, 6.2f, 0.6f);
        assertEquals(1.4495866,result.get(0),0.01);
        assertEquals(1.3206165,result.get(1),0.01);
        assertEquals(1.185529,result.get(2),0.01);
        assertEquals(1.0545129,result.get(3),0.01);
        assertEquals(0.9324952,result.get(4),0.01);
        assertEquals(0.8214861,result.get(5),0.01);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calc.
     */
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Calc.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
