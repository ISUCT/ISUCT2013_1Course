/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calculator {
    public float singleValue (float a, double b, float x){
        float chisl;
        float znamen;
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
       float y = chisl/znamen;
       return y;
       
        
    }
    public void taskB () {
         float a = 2.5f;
         double b = 4.6f;
        float x = (float)1.2; 
        singleValue (a,b,x);
        x=(float)1.28;
        singleValue (a,b,x);
        x=(float)1.36;
        singleValue (a,b,x);
        x=(float)1.46;
        singleValue (a,b,x);
        x =(float)2.35;  
        singleValue (a,b,x);
    }
    
        
//        float chisl;
//        float znamen;
//        chisl = (float)((Math.pow((a+b*x),2.5)));
//        znamen = (float)(1+(Math.log10(a+b*x)));
//       float y = chisl/znamen;
//        System.out.println ("x="+ x +"; "+"y="+ y);
//        
//        x = (float)1.28; 
//        chisl = (float)((Math.pow((a+b*x),2.5)));
//        znamen = (float)(1+(Math.log10(a+b*x)));
//        y = chisl/znamen;
//         System.out.println ("x="+x+"; "+"y="+y);
//         
//         
//         x = (float)1.36; 
//        chisl = (float)((Math.pow((a+b*x),2.5)));
//        znamen = (float)(1+(Math.log10(a+b*x)));
//        y = chisl/znamen;
//         System.out.println ("x="+x+"; "+"y="+y);
//         
//         
//         x = (float)1.46; 
//        chisl = (float)((Math.pow((a+b*x),2.5)));
//        znamen = (float)(1+(Math.log10(a+b*x)));
//        y = chisl/znamen;
//         System.out.println ("x="+x+"; "+"y="+y);
//         
//         x = (float)2.35; 
//        chisl = (float)((Math.pow((a+b*x),2.5)));
//        znamen = (float)(1+(Math.log10(a+b*x)));
//        y = chisl/znamen;
    
//         System.out.println ("x="+x+"; "+"y="+y);
         
         public void taskA (float a,float b){
//             float a=2.5f;
//             float x = (float) 1.2;
                     float xn = (float)1.1;
                     float xk = 3.6f;
                     float dx = 0.5f;
                     for (float x=xn;x<=xk;x=x+dx){
                        float result = singleValue (a,b,x);
                        System.out.println("x="+x+"; "+"y="+result);
                     }
         }
    
    public static void main (String [] args){
        Calculator my = new Calculator ();
//        my.taskB();
    my.taskA(2.5f,4.6f);
    System.out.println("Another");
    my.taskA(2.5f,4.6f);
       }
}



