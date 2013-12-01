+
+import java.util.ArrayList;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author -
 */
public class Calc {
    public float singleValue (float a, double b, float x){
    float chisl;
    float znamen;
    chisl = (float)(Math.pow((a*b),1/3)*(Math.pow(a,x)-Math.pow(b,x)));
    znamen = (float) Math.log10(a/b);
    float y = chisl/znamen;
    return y;
    }
    
    public ArrayList<Float> taskB(){
        ArrayList<Float> y= new ArrayList<Float>();
        
        float a = 0.4f;
        double b = 0.8f;

        float x =(float)4.48;
        y.add(singleValue (a,b,x));
        
        x =(float)3.56;
        y.add(singleValue (a,b,x));
        
        x =(float)2.78;
        y.add(singleValue (a,b,x));
        
        x =(float)5.28;
        y.add(singleValue (a,b,x));
        
        x =(float)3.21;
        y.add(singleValue (a,b,x));
        return y;
    }         
        public void taskA(float a, float b,float xn, float xk, float dx){
//            float xn = (float)3.2;
//            float xk = 6.2f;
//            float dx = 0.6f;
            for (float x=xn;x<=xk;x=x+dx){
                float result =singleValue (a,b,x);
                System.out.println("x="+x+" ;"+"y="+result);
            }
        }
    public static void main (String[] args){
     Calc my = new Calc();
     ArrayList<Float> res=my.taskB();
     for (int i=0;i<res.size();i++){
         System.out.println("result >"+res.get(i));
     }
//     my.taskA();
//     my.taskA(0.4f,0.8f);
//     System.out.println("Another");
//     my.taskA(0.4f,0.8f);
        }
}