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
        float b = 0.8F;
        float x = 4.48F;
        Calc instance = new Calc();
        float expResult = 1.1676768F;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.0001);
        
    }

    public void testTaskB() {
        System.out.println("taskB");
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
        
        ArrayList<Float> result = instance.taskB();
       
        assertEquals(1.1676768f,result.get(0));
        assertEquals(1.3737649f,result.get(1));
        assertEquals(1.5263209f,result.get(2));
        assertEquals(0.99628013f,result.get(3));
        assertEquals(1.4475756f,result.get(4));        
       
    }

   
    public void testTaskA() {
        System.out.println("taskA");
        float xn = 3.2f;
        float xk = 6.2f;
        float dx = 0.6f;
        float a = 0.4F;
        float b = 0.8F;
        
        Calc instance = new Calc();
        ArrayList<Float> result = instance.ArrayListtaskA(a, b, xn, xk, dx);
        assertEquals(1.4495866, result.get(0),0.01);
        assertEquals(1.3206165, result.get(1),0.01);
        assertEquals(1.185529, result.get(2),0.01);
        assertEquals(1.0545129, result.get(3),0.01);
        assertEquals(0.9324952, result.get(4),0.01);
        assertEquals(0.8214861, result.get(5),0.01);
        
    }

}
