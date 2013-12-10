import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    
    @Test
    public void testSinglTaskB1() {
        System.out.println("singleValue");
        float a = 2f;
        float b = 4.1f;
        float x = 1.24f;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(NaN, result, 0.001);
    }

        @Test
    public void testSingleTaskB2() {
        System.out.println("singleValue");
        float a = 2f;
        float b = 4.1f;
        float x = 1.38f;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(NaN, result, 0.001);
    }

    @Test
    public void testSingleTaskB3() {
        System.out.println("singleValue");
        float a = 2f;
        float b = 4.1f;
        float x = 2.38f;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(2.0344763, result, 0.001);
    }
    
        @Test
    public void testSingleTaskB4() {
        System.out.println("singleValue");
        float a = 2f;
        float b = 4.1f;
        float x = 3.21f;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(1.0137464, result, 0.001);
    }
    
    @Test
    public void testSingleTaskB5() {
        System.out.println("singleValue");
        float a = 2f;
        float b = 4.1f;
        float x = 0.68f;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(NaN, result, 0.001);
    }
    
     @Test
    public void testSingletaskA() {
        System.out.println("taskA");
        float xn=0.77f;
        float xk =1.77f;
        float xd=0.2f;
        double a = 2f;
        double b = 4.1f;
        Calc instance = new Calc();
        ArrayList<Float> result = instance.taskA(a, b, xn,xk,xd);
        assertEquals(NaN, result.get(0), 0.001);
        assertEquals(NaN, result.get(1), 0.001);
        assertEquals(NaN, result.get(2), 0.001);
        assertEquals(NaN, result.get(3), 0.001);
        assertEquals(Nan, result.get(4), 0.001);
    }
}