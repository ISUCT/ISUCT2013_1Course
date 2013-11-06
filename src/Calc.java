/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author -
 */
public class Calc {
    public void taskA(){
        
        float a = 0.4f;
        double b = 0.8f;
        
        float chisl;
        float znamen;                
        
        float x =(float)4.48;
        chisl = (float)(Math.pow((a*b),1/3)*(Math.pow(a,x)-Math.pow(b,x)));
        znamen = (float) Math.log10(a/b);
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
 
        x =(float)3.56;
        chisl = (float)(Math.pow((a*b),1/3)*(Math.pow(a,x)-Math.pow(b,x)));
        znamen = (float) Math.log10(a/b);
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x =(float)2.78;
        chisl = (float)(Math.pow((a*b),1/3)*(Math.pow(a,x)-Math.pow(b,x)));
        znamen = (float) Math.log10(a/b);
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x =(float)5.28;
        chisl = (float)(Math.pow((a*b),1/3)*(Math.pow(a,x)-Math.pow(b,x)));
        znamen = (float) Math.log10(a/b);
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x =(float)3.21;
        chisl = (float)(Math.pow((a*b),1/3)*(Math.pow(a,x)-Math.pow(b,x)));
        znamen = (float) Math.log10(a/b);
        y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
    }
    public static void main (String[] args){
     Calc my = new Calc();
     my.taskA();
}
}