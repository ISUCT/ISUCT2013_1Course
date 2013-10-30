/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class Calc {
    void simple(double b,float x){
         float chisl;
        float znamen;
        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
        float y = chisl / znamen;
        System.out.println("x=" + x + ";" + "y=" + y);
    }

    public void taskA() {
        double b = 2.5;
        float x = (float) 1.1;
        simple(b,x);
//        float chisl;
//        float znamen;
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        float y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//
        x = (float) 2.4;
        simple(b,x);
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//        
        x = (float) 3.6;
        simple(b,x);
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//        
        x = (float) 1.7;
        simple(b,x);
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
//        
        x = (float) 3.9;
        simple(b,x);
//        chisl = (float) (1 + Math.pow(Math.sin(Math.pow(b, 3) + Math.pow(x, 3)), 2));
//        znamen = (float) (Math.pow((Math.pow(b, 3) + Math.pow(x, 3)), 1 / 3.0));
//        y = chisl / znamen;
//        System.out.println("x=" + x + ";" + "y=" + y);
    }

    public static void main(String[] args) {
        Calc my = new Calc();
        my.taskA();
    }
}