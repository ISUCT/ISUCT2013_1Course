import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    
@Test
public void testSingletaskA() {
System.out.println("taskA");
float xn=1.23f;
float xk=7.23f;
float xd= 1.2f;
double a = 0.8f;
double b = 0.4f;
Calc instance = new Calc();
ArrayList<Float> result = instance.taskA(a, b, xn,xk,xd);
assertEquals(3.82055, result.get(0), 0.001);
assertEquals(6.201905, result.get(1), 0.001);
assertEquals(5.612957, result.get(2), 0.001);
assertEquals(5.164408, result.get(3), 0.001);
assertEquals(5.4691047, result.get(4), 0.001);
assertEquals(5.163909, result.get(5), 0.001);
}
@Test
public void testSinglTaskB1() {
System.out.println("singleValue");
double a = 0.8f;
double b = 0.4f;
float x = 1.88f;
Calc instance = new Calc();
float result = instance.singleValue(a, b, x);
assertEquals(5.458972, result, 0.001);
}
@Test
public void testSinglTaskB2() {
System.out.println("singleValue");
double a = 0.8f;
double b = 0.4f;
float x = 1.88f;
Calc instance = new Calc();
float result = instance.singleValue(a, b, x);
assertEquals(5.234022, result, 0.001);
}
@Test
public void testSinglTaskB3() {
System.out.println("singleValue");
double a = 0.8f;
double b = 0.4f;
float x = 1.88f;
Calc instance = new Calc();
float result = instance.singleValue(a, b, x);
assertEquals(4.330712, result, 0.001);
}
@Test
public void testSinglTaskB4() {
System.out.println("singleValue");
double a = 0.8f;
double b = 0.4f;
float x = 1.88f;
Calc instance = new Calc();
float result = instance.singleValue(a, b, x);
assertEquals(4.639642, result, 0.001);
}
@Test
public void testSinglTaskB5() {
System.out.println("singleValue");
double a = 0.8f;
double b = 0.4f;
float x = 1.88f;
Calc instance = new Calc();
float result = instance.singleValue(a, b, x);
assertEquals(4.892159, result, 0.001);
}

}



