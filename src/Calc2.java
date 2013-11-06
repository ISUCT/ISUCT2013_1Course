/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calc {
    
    public float singleValue (float a, float b, float x){
        float chisl;
        float znamen;
        chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        float y = chisl/znamen;
        return y;
        
    }
    
    public void taskB(float a, float b, float[] X) {
//        float a = 2f ;
//        float b = 0.95f;
//        float x = (float)2.2;
        System.out.println("taskB");
        for (float x:X){
            float result = singleValue(a,b,x);
            System.out.println("x="+x+"; "+"y="+result);
        }

    }
    
    
    
    public void taskA(float a,float b,float xn, float xk, float dx) {
//        float xn = (float)1.25f;
//        float xk = (float)2.75f;
//        float dx = (float)0.3f;
        System.out.println("taskA");
        for(float x = xn;x<=xk;x=x+dx){
        
        float result = singleValue(a,b,x);
        System.out.println("x="+x+"; "+"y="+result);
        }
    }
        
       
   
           
    public static void main (String[] args) {
        Calc my = new Calc ();
        my.taskA(2,0.95f,1.25f,2.75f,0.3f);
        my.taskA(1,1.95f,0,10,0.1f);
        float[] myX={2.2f,3.78f,4.51f,6.58f,1.2f};
        my.taskB(1,1.95f,myX);
    }
        
    }

