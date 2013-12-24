package natwork;


import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

    public void testSingleValue() {
        System.out.println("SingleValue");
        float a = 5.0f;
        float x = 1.28F;
        Calc instance = new Calc();
        float expResult = 3.8499365f;
        float result = instance.SingleValue((int) a, x);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testTaskB() {
        System.out.println("taskB");
        Calc instance = new Calc();
        
        float expResult = 3.8499365f;
        expResult = 4.9429526f;
        expResult = 3677.0195f;
        expResult = 5.8446931E8f;
        expResult = 6.8412005E13f;
        ArrayList<Float> result = instance.taskB();
        assertEquals(3.8499365f, result.get(0), 0.0);
        assertEquals(4.9429526f, result.get(1), 0.0);
        assertEquals(3677.0195f, result.get(2), 0.0);
        assertEquals(5.8446931E8f,result.get(3), 0.0);
        assertEquals(6.8412005E13f,result.get(4), 0.0);
    }
    public void testTaskA(int a, float xn, float xk, float dx) {
        System.out.println("taskA");
        Calc instance = new Calc();
        
        ArrayList<Float> result = instance.taskA(5, 1.2f, 3.7f, 0.5f);
        assertEquals(3.8499365f, result.get(0), 0.0);
        assertEquals(4.9429526f, result.get(1), 0.0);
        assertEquals(3677.0195f, result.get(2), 0.0);
        assertEquals(5.8446931E8f, result.get(3), 0.0);
        assertEquals(6.8412005E13f, result.get(4), 0.0);
    }
    
}
