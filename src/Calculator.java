/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calculator {
    public void taskB (){
        double a = 1.2;
        double b = 0.48;
        float x = (float)0.25;
        float chisl;
        float znamen;
        chisl = (float) ((float)(Math.pow(b, 3))+(Math.pow(Math.sin(a*x), 2)));
        znamen = (float) ((float)(Math.acos(x*b*x))+(Math.pow(Math.E, -x/2)));
        float y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x = (float)0.36;
         chisl = (float) ((float)(Math.pow(b, 3))+(Math.pow(Math.sin(a*x), 2)));
        znamen = (float) ((float)(Math.acos(x*b*x))+(Math.pow(Math.E, -x/2)));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x = (float)0.56;
        chisl = (float) ((float)(Math.pow(b, 3))+(Math.pow(Math.sin(a*x), 2)));
        znamen = (float) ((float)(Math.acos(x*b*x))+(Math.pow(Math.E, -x/2)));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x = (float)0.94;
        chisl = (float) ((float)(Math.pow(b, 3))+(Math.pow(Math.sin(a*x), 2)));
        znamen = (float) ((float)(Math.acos(x*b*x))+(Math.pow(Math.E, -x/2)));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x = (float)1.28;
        chisl = (float) ((float)(Math.pow(b, 3))+(Math.pow(Math.sin(a*x), 2)));
        znamen = (float) ((float)(Math.acos(x*b*x))+(Math.pow(Math.E, -x/2)));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
             
        
        
        
        
        
        
        
        
        
    }
public static void main(String[] args) {
    Calculator my = new Calculator();
    my.taskB() ;
    
}

}

        
    
