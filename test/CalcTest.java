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
        double a = 7.2f;
        double b = 4.2f;
        float x = 2.4f;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(7.238671, result, 0.001);
    }

        @Test
    public void testSingleTaskB2() {
        System.out.println("singleValue");
        double a = 7.2f;
        double b = 4.2f;
        float x = 2.8F;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(7.141524, result, 0.001);
    }

    @Test
    public void testSingleTaskB3() {
        System.out.println("singleValue");
        double a = 7.2f;
        double b = 4.2f;
        float x = 3.9F;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(6.66759, result, 0.001);
    }
    
        @Test
    public void testSingleTaskB4() {
        System.out.println("singleValue");
        double a = 7.2f;
        double b = 4.2f;
        float x = 4.7F;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(6.4268775, result, 0.001);
    }
    
    @Test
    public void testSingleTaskB5() {
        System.out.println("singleValue");
        double a = 7.2f;
        double b = 4.2f;
        float x = 3.16F;
        Calc instance = new Calc();
        float result = instance.singleValue(a, b, x);
        assertEquals(6.9761963, result, 0.001);
    }
    
     @Test
    public void testSingletaskA() {
        System.out.println("taskA");
        float xn=1.81f;
        float xk =5.31f;
        float xd=0.7f;
        double a = 7.2f;
        double b = 4.2f;
        Calc instance = new Calc();
        ArrayList<Float> result = instance.taskA(a, b, xn,xk,xd);
        assertEquals(4.84725, result.get(0), 0.001);
        assertEquals(7.235105, result.get(1), 0.001);
        assertEquals(6.953017, result.get(2), 0.001);
        assertEquals(6.664008, result.get(3), 0.001);
        assertEquals(6.4497647, result.get(4), 0.001);
        assertEquals(6.293979, result.get(5), 0.001);
    }
}
