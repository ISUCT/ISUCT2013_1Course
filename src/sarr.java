/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author -
 */
public class sarr {
     public float singleValue (float a, float b, float x){
     float y;
     y=(float)(Math.pow((a*x+b),1/3));
     System.out.println("x=" + x + ";" + "y=" + y);
     return y;
     }
    public ArrayList<Float> task(float xn, float xk, float dx){
    ArrayList<Float> = new ArrayList<Float>();
    float a = 1.5f;
    float b = 2;
    for (float x = xn;x<=xk;x=x+dx){
            float result = singleValue(a, b, x);
            y.add(result);
            System.out.println("x="+x+"; "+"y="+result);
            return y;
    }
    
     
    public static void main (String[] args){
     sarr my = new sarr();
     }
}
