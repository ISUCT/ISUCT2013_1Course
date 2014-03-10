/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import java.util.ArrayList;
/**
 *
 * @author dns
 */

   public class Calc01 {
    public float singleValue (float b, float x) {
        float chisl;
        float znamen;
        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
        float y = chisl / znamen;
        String res = String.format("Результат для x=%,.4f равен y=%,.4f",x,y);
        System.out.println(res);
        return y;
    }
    
    public ArrayList<Float> taskB(){
      ArrayList<Float> y = new ArrayList<Float>();
      
        float b = 2.5f;
        float x = (float) 1.1;
        y.add(singleValue(b,x));
//        float chisl;
//        float znamen;
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        float y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//
        x = (float) 2.4;
        y.add(singleValue(b,x));
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//        
        x = (float) 3.6;
        y.add(singleValue(b,x));
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//        
        x = (float) 1.7;
        y.add(singleValue(b,x));
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//        
        x = (float) 3.9;
        y.add(singleValue(b,x));
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
        return y;
    }

    
    public ArrayList<Float> taskA (float b, float xn, float xk, float dx) {
        ArrayList<Float> y = new ArrayList<Float>();
//        float xn = (float) 1.28;
//        float xk = (float) 3.28;
//        float dx = (float) 0.4;
        int i=0;
        for (float x = xn; x<=xk; x = x + dx) {
            y.add(singleValue(b, x));
            String res = String.format("Результат для x=%,.4f равен y=%,.4f",x,y.get(i));
            System.out.println(res);
            i++;
        }
        return y;
    }
    
    public static void main(String[] args) {
        Calc01 my = new Calc01();
        ArrayList<Float> res=my.taskB();
        for(int i=0; i<res.size(); i++) {
        System.out.println ("result >" + res.get(i));
        }
        ArrayList<Float> res1=my.taskA(2.5f, 1.28f, 3.28f, 0.4f);
        for (int i=0; i<res1.size(); i++){
        System.out.println ("result >" + res1.get(i));
        }

//        my.taskA(3.5f, 1.28f, 3.28f, 0.4f);
//        System.out.println ("-----");
//        my.taskA(2.5f,1.28f, 3.28f, 0.4f);
    }
}

