/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calc {
    public void taskA(){
        //      корень кубический(sin(x)+log2(a+x))
        // y = -------------------------------------
        //       модуль((x+b))
        // a=5, b=8 x1 = pi, x2 = pi+0.5pi, x3 = pi+1pi, x4=pi+1.5pi 
        int a = 5;
        int b=8;
        
        float chisl;
        float znamen;
        
        float x=(float)Math.PI;
        chisl = (float)Math.pow((Math.sin(x)+(Math.log(a+x)/Math.log(2))),(1/3.0));
        znamen = (float) Math.abs((x+b)*Math.pow(10,-3));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x=(float)(Math.PI+0.5*Math.PI);
        chisl = (float)Math.pow((Math.sin(x)+(Math.log(a+x)/Math.log(2))),(1/3.0));
        znamen = (float) Math.abs((x+b)*Math.pow(10,-3));
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x=(float)(Math.PI+1*Math.PI);
        chisl = (float)Math.pow((Math.sin(x)+(Math.log(a+x)/Math.log(2))),(1/3.0));
        znamen = (float) Math.abs((x+b)*Math.pow(10,-3));
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x=(float)(Math.PI+1.5*Math.PI);
        chisl = (float)Math.pow((Math.sin(x)+(Math.log(a+x)/Math.log(2))),(1/3.0));
        znamen = (float) Math.abs((x+b)*Math.pow(10,-3));
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
    }
    public static void main(String[] args){
        Calc my = new Calc();
        my.taskA();
    }
}
