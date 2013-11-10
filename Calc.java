/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.ArrayList;

/**
 *
 * @author Stud_17
 */
public class Calc {
    public float singleValue (float a, double b, float x){
        float chisl;
        float znamen;
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
       float y = chisl/znamen;
       return y;
       
        
    }
    
    public ArrayList<Float> taskB(){
        ArrayList<Float> y= new ArrayList<Float>();
        

         float a = 2.5f;
         double b = 4.6f;
        float x = (float)1.2; 
        y.add(singleValue(a, b, x));
        x=(float)1.28;
        y.add(singleValue(a, b, x));
        x=(float)1.36;
        y.add(singleValue(a, b, x));
        x=(float)1.46;
        y.add(singleValue(a, b, x));
       x =(float)2.35;  
        y.add(singleValue(a, b, x));
        
       return y;
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
         
         public ArrayList<Float> taskA (float a,float b){
             ArrayList<Float> y= new ArrayList<Float>();
//             float a=2.5f;
//             float x = (float) 1.2;
                     float xn = (float)1.1;
                     float xk = 3.6f;
                     float dx = 0.5f;
                     int i=0;
                     for (float x=xn;x<=xk;x=x+dx){
                        y.add(singleValue(a, b, x));
                        System.out.println("x="+x+"; "+"y="+y.get(i));
                        i++;
                     }
                     return y;
         }
    
    public static void main (String [] args){
        Calc my = new Calc ();
         ArrayList<Float> res=my.taskB();
        for(int i=0;i<res.size();i++){
            System.out.println("result >"+res.get(i));
        }
//        my.taskB();
    my.taskA(2.5f,4.6f);
    System.out.println("Another");
    my.taskA(2.5f,4.6f);
       }
}