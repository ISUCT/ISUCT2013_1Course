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
    
    public float summ(float a,float b){
        return a+b;
    }
    public float singleValue(float a,float b,float x){
        float y=a*x+b;
        return y;
    }
    
    public ArrayList<Float> taskA(float a,float b,float xn,float xk,float dx){
       ArrayList<Float> Y = new ArrayList<Float>();
       
       for(float x=xn;x<=xk;x+=dx){
           float y = singleValue(a, b, x);
           Y.add(y);
       } 
       return Y;
    }
    
    public ArrayList<Float> taskB(){
        ArrayList<Float> y= new ArrayList<Float>();

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
    
    public static void main(String[] args){
        Calc my = new Calc();

//        my.taskA();
        System.out.println(my.summ(5, 8)); //13
        System.out.println(my.summ(5, -8)); //-3

        ArrayList<Float> res=my.taskB();
        for(int i=0;i<res.size();i++){
            System.out.println("result >"+res.get(i));
        }
        
    }
}
