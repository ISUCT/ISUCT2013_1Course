/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

import junit.framework.TestCase;


/**

 *

 * @author 176

 */
public class CalcnewTest extends TestCase {
    private float nullf;

    

    public CalcnewTest(String testName) {

       super(testName);
    }   

    /**

     * Test of singleValue method, of class Calc.

     */

    public void testSingleValue() {

        

       

        float x = 0.1F;

        Calcnew instance = new Calcnew();

        float expResult = 10.126261F;

        float result = instance.singleValue( x);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

       

    }



    /**

     * Test of taskB method, of class Calc.

     */

    public void testTaskB() {

        System.out.println("taskB");

        float x = (float) 0.1;

        x =  (float) 0.35;

       x = (float) 0.4;

        x = (float) 0.55;

        x = (float) 0.6;

        Calcnew instance = new Calcnew();

        float expResult =10.126261f;
        expResult = 3.3168135f;
       expResult = 2.5966763f;
       expResult =1.2717172f;
 expResult = 1.0498754f;
        ArrayList<Float> result = instance.taskB();

        assertEquals(10.126261f, result.get(0));
        assertEquals(3.3168135f, result.get(1));
        
        assertEquals(2.5966763f, result.get(2));
        assertEquals(1.2717172f, result.get(3));
       assertEquals(1.0498754f, result.get(4));

        

        // TODO review the generated test code and remove the default call to fail.

//        fail("The test case is a prototype.");

    }
     
   public void testTaskA() {

           System.out.println("taskA");

       float xn = 0.28F;

        float xk = 0.55F;

        float dx = 0.4F;

        Calcnew instance = new Calcnew();
        //  float  expResult = null;
           
         ArrayList<Float> result = instance.taskA( xn, xk, dx);
         assertEquals(0.126261f, result.get(0),0.001);
         assertEquals(0.717172f, result.get(1),0.001);
         
           
        



////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");

//    }
        

        }

}

