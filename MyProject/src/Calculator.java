/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Calculator {
    public float  singleValue(int a,float x){
     float chisl;
     float znamen;
     chisl = (float)Math.pow(Math.log10(a+x), 2);
     znamen = (float)Math.pow((a+x), 2);
     float y = chisl/znamen;
     return y;
    }
    
 public void  taskB(){
     int a=2;
     float x = (float)1.16;
     singleValue (a,x);
     x=(float)1.32;
     singleValue (a,x);
     x= (float) 1.47;
     singleValue (a,x);
     x =(float)1.65;     
     singleValue (a,x);
     x=(float)1.93;
     singleValue (a,x);
 }
           
             
//     float chisl;
//     float znamen;
//     chisl = (float)Math.pow(Math.log10(a+x), 2);
//     znamen = (float)Math.pow((a+x), 2);
//     float y = chisl/znamen;
//     System.out.println ("x="+x+";"+"y="+y); 
//     
     
//     x = (float)1.16;
// chisl = (float)Math.pow(Math.log10(a+x), 2);
// znamen = (float)Math.pow((a+x), 2);
// y = chisl/znamen;
// System.out.println ("x="+x+";"+"y="+y);   
// 
// 
// 
//   x = (float)1.32;
// chisl = (float)Math.pow(Math.log10(a+x), 2);
// znamen = (float)Math.pow((a+x), 2);
// y = chisl/znamen;
// System.out.println ("x="+x+";"+"y="+y);   
// 
// 
// 
//  x = (float)1.47;
// chisl = (float)Math.pow(Math.log10(a+x), 2);
// znamen = (float)Math.pow((a+x), 2);
// y = chisl/znamen;
// System.out.println ("x="+x+";"+"y="+y);   
// 
// 
//  x = (float)1.56;
// chisl = (float)Math.pow(Math.log10(a+x), 2);
// znamen = (float)Math.pow((a+x), 2);
// y = chisl/znamen;
// System.out.println ("x="+x+";"+"y="+y);
// 
// 
// 
//  x = (float)1.93;
// chisl = (float)Math.pow(Math.log10(a+x), 2);
// znamen = (float)Math.pow((a+x), 2);
// y = chisl/znamen;
// System.out.println ("x="+x+";"+"y="+y); 

 
 public void  taskA(int a){
//     int a=2;
//     float x = (float)1.16;
     float xn= (float)1.2;
     float xk= 4.2f;
     float dx= 0.6f;
     for (float x =xn;x<=xk;x=x+dx){
     float result = singleValue (a, x);
  System.out.println("x="+x+";"+"y="+result); 
     }
  
 }
     
     
             
 
 
 public static void main (String [] args){
     Calculator my = new Calculator();
//     my. taskB();
     my.taskA(2);
     System.out.println("Another");
     my.taskA(2);
     
 }
}
