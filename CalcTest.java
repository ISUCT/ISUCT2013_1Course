package calc;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

    public void testSingleValue() {
        System.out.println("singleValue");
        int a = 2;
        float b = 1.1f;
        float x = 0.1f;
        Calc instance = new Calc();
        float expResult = 0.27390277F;
        float result = instance.singleValue(a, b, x);
        assertEquals(expResult, result, 0.001);
    }
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        Calc instance = new Calc();
        
        int a = 2;
        float b = 1.1f;
        
         float expResult = 0.27390277f;
         expResult = 0.25668028f;
         expResult = 0.24150875f;
         expResult = 0.23224977f;
         expResult = 0.18371493f;
        
        ArrayList result = instance.taskB();
        
        assertEquals(0.27390277f, result.get(0));
        assertEquals(0.25668028f, result.get(1));
        assertEquals(0.24150875f, result.get(2));
        assertEquals(0.23224977f, result.get(3));
        assertEquals(0.18371493f, result.get(4));
      
    }

    /**
     *
     */
    @Test
   public void testTaskA() {
       
     System.out.println("taskA");
     
        int a = 2;
        float b = 1.1f;
        float xn = 0.08f;
        float xk = 1.08f;
        float dx = 0.2f;
        
        Calc instance = new Calc();
        ArrayList<Float> result = instance.taskA(a, b, xn, xk, dx);
        //error in the line above :c
        assertEquals(0.27390277, result.get(0),0.01);
        assertEquals(0.25668028, result.get(1),0.01);
        assertEquals(0.24150875, result.get(2),0.01);
        assertEquals(0.23224977, result.get(3),0.01);
        assertEquals(0.18371493, result.get(4),0.01);
    }
}
