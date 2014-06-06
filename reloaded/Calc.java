
import java.util.ArrayList;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author StPC
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
    
    public ArrayList<Float> taskB (float a, double b, float [] X) {
           ArrayList<Float> y=new ArrayList<Float> ();
           

        System.out.println ("taskB");
        int i=0;
        for (float x:X){
            y.add(singleValue (a,b,x));
            String res = String.format ("результат вычислений для x=%, 4f,x,y");
            System.out.println (res);
           
        }
        return y;
    }
    public ArrayList<Float> taskA(float a,float b,float xn, float xk, float dx) {
    ArrayList<Float> y= new ArrayList <Float>();
    System.out.println ("taskA");
        int i=0;
        for (float x=xn; x<=xk;x=x+dx){
            y.add(singleValue (a,b,x));
            String res = String.format ("результат вычислений для x=%, 4f,x,y");
            System.out.println (res);
            i++;
        }
        return y;
    }

    public static void main (String [] args){
        Calculator my = new Calculator ();
        ArrayList<Float> res=my.taskB(2, 3,new float[]{1,2,3});
        for (int i=0; i<res.size();i++){
                System.out.println("result >"+res.get(i));
        }
        ArrayList <Float> res1=my.taskA(2.5f, 4.6f, 1.1f, 3.6f, 0.5f);
        for(int i=0;i<res1.size(); i++){
            System.out.println("result>"+res1.get(i));
            

        }
       }
    
   
}



