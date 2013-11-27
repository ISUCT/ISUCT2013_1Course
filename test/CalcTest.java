/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
     * Test of summ method, of class Calc.
     */
    @Test
    public void testSumm() {
        System.out.println("summ");
        float a = 2.0F;
        float b = 2.0F;
        Calc instance = new Calc();
        float expResult = 4.0F;
        float result = instance.summ(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    
        @Test
    public void testSingleValue() {
        System.out.println("Single Value");
        Calc instance = new Calc();
        float result = instance.singleValue(1, 0,1);
        assertEquals(1, result, 0.0);
    }
        
    @Test
    public void testTaskA() {
        System.out.println("Task A");
        float xn=0;
        float xk=2;
        float dx=1;
        float a=2;
        float b=1;
        //x=0 y=2*0+1=1
        //x=1 y=2*1+1=3
        //x=2 y=2*2+1=5
        
        Calc instance = new Calc();
        ArrayList<Float> result = instance.taskA(a,b,xn,xk,dx);
        assertEquals(1, result.get(0), 0.0);
        assertEquals(3, result.get(1), 0.0);
        assertEquals(5, result.get(2), 0.0);
        assertEquals(3, result.size(), 0.0);
    }
}
