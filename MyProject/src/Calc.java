
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruler
 */
public class Calc {
    public void taskB() {
        int a = 2 ;
        double b = 4.1;
        
        float chisl;
        float znamen;
        
        float x1=(float)1.24;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x1,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x1,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x1+"; "+"y="+y);
        
        float x2 = (float)1.38;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x2,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x2,2))-(Math.pow(a,2))),(1/3.0));
        y = chisl/znamen;
        System.out.println("x="+x2+"; "+"y="+y);
        
        float x3 = (float)2.38;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x3,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x3,2))-(Math.pow(a,2))),(1/3.0));
        y = chisl/znamen;
        System.out.println("x="+x3+"; "+"y="+y);
        
        float x4 = (float)3.21;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x4,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x4,2))-(Math.pow(a,2))),(1/3.0));
        y = chisl/znamen;
        System.out.println("x="+x4+"; "+"y="+y);
        
        float x5 = (float)0.68;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x5,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x5,2))-(Math.pow(a,2))),(1/3.0));
        y = chisl/znamen;
        System.out.println("x="+x5+"; "+"y="+y);
        
        }
    public static void main (String[] args) {
        Calc my = new Calc ();
        my.taskB();
    }

    ArrayList<Float> taskB(double d, float f, float f0, float f1, float f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<Float> taskA(int i, float f, float f0, float f1, float f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }