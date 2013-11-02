/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Calc {
    void taskB (){ 
        int a = 2;
        int b = 3;
        
        double y;
        
        float x = (float)0.08;
        y = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
        System.out.println("x=" + x + ";" + "y=" + y); 
        
        x = (float) 0.026; 
        y = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
        System.out.println("x=" + x + ";" + "y=" + y); 
        
        x = (float) 0.37; 
        y = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
        System.out.println("x=" + x + ";" + "y=" + y); 
        
        x = (float) 0.48;
        y = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
        System.out.println("x=" + x + ";" + "y=" + y); 
        
        x = (float) 0.56;
        y = Math.asin(Math.pow(x, a)) + Math.acos(Math.pow(x, b));
        System.out.println("x=" + x + ";" + "y=" + y); 
        
    }

    
    public static void main(String[] args) {
        Calc myCalc = new Calc ();
        System.out.println("Task B");
        myCalc.taskB();
    }
}
