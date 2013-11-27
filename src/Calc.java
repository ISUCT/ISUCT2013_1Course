
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
    public static void main(String[] args){
        Calc my = new Calc();
//        my.taskA();
        System.out.println(my.summ(5, 8)); //13
        System.out.println(my.summ(5, -8)); //-3
    }
}
