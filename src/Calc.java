
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calc {
    
    public float singleValue(int a,float b,float x){
        float chisl;
        float znamen;
        chisl = (float)Math.pow((Math.sin(x)+(Math.log(a+x)/Math.log(2))),(1/3.0));
        znamen = (float) Math.abs((x+b)*Math.pow(10,-3));
        float y = chisl/znamen;
        return y;
    }
    
    public ArrayList<Float> taskB(){
        ArrayList<Float> y= new ArrayList<Float>();

        //      корень кубический(sin(x)+log2(a+x))
        // y = -------------------------------------
        //       модуль((x+b))
        // a=5, b=8 x1 = pi, x2 = pi+0.5pi, x3 = pi+1pi, x4=pi+1.5pi 
        int a = 5;
        float b=8.5f;
        
        float x=(float)Math.PI;
        y.add(singleValue(a, b, x));
        
        x=(float)(Math.PI+0.5*Math.PI);
        y.add(singleValue(a, b, x));
        
        x=(float)(Math.PI+1*Math.PI);
        y.add(singleValue(a, b, x));
        
        x=(float)(Math.PI+1.5*Math.PI);
        y.add(singleValue(a, b, x));
        return y;
    }
    
    public void taskA(int a,float b,float xn, float xk,float dx){
        
        for (float x = xn;x<=xk;x=x+dx){
            float result = singleValue(a, b, x);
            System.out.println("x="+x+"; "+"y="+result);
        } 
    }
    
    public static void main(String[] args){
        Calc my = new Calc();
        ArrayList<Float> res=my.taskB();
        for(int i=0;i<res.size();i++){
            System.out.println("result >"+res.get(i));
        }
        
//        my.taskA(5,8.5f,0,10,0.1f);
//        System.out.println("Another");
//        my.taskA(1,5);
        
    }
}
