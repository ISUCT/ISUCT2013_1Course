/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Calculator {
 public void  taskB(){
     int a=2;
     float x = (float)1.16;
     float chisl;
     float znamen;
     chisl = (float)Math.pow(Math.log10(a+x), 2);
     znamen = (float)Math.pow((a+x), 2);
     float y = chisl/znamen;
     System.out.println ("x="+x+";"+"y="+y); 
     
     
     x = (float)1.16;
 chisl = (float)Math.pow(Math.log10(a+x), 2);
 znamen = (float)Math.pow((a+x), 2);
 y = chisl/znamen;
 System.out.println ("x="+x+";"+"y="+y);   
 
 
 
   x = (float)1.32;
 chisl = (float)Math.pow(Math.log10(a+x), 2);
 znamen = (float)Math.pow((a+x), 2);
 y = chisl/znamen;
 System.out.println ("x="+x+";"+"y="+y);   
 
 
 
  x = (float)1.47;
 chisl = (float)Math.pow(Math.log10(a+x), 2);
 znamen = (float)Math.pow((a+x), 2);
 y = chisl/znamen;
 System.out.println ("x="+x+";"+"y="+y);   
 
 
  x = (float)1.56;
 chisl = (float)Math.pow(Math.log10(a+x), 2);
 znamen = (float)Math.pow((a+x), 2);
 y = chisl/znamen;
 System.out.println ("x="+x+";"+"y="+y);
 
 
 
  x = (float)1.93;
 chisl = (float)Math.pow(Math.log10(a+x), 2);
 znamen = (float)Math.pow((a+x), 2);
 y = chisl/znamen;
 System.out.println ("x="+x+";"+"y="+y);   
             
 
 }
 public static void main (String [] args){
     Calculator my = new Calculator();
     my. taskB();
 }
}
