/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calc {
    public void taskB() {
        int a = 2 ;
        double b = 0.95;
        float x = (float)2.2;
        float chisl;
        float znamen;
        chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        float y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        
      x = (float)3.78;
      chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
      
        x = (float)4.51;
        chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x = (float)6.58;
        chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x = (float)1.2;
                chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        y = chisl/znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
    }
    public static void main (String[] args) {
        Calc my = new Calc ();
        my.taskB();
    }
        
    }

