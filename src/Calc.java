/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class Calc {
    public void taskB (){
      double y;
        float x=(float)0.1;
        y=Math.pow((Math.pow(Math.asin(x),2) +Math.pow(Math.acos(x),4)),3); 
        System.out.println("x=" + x + ";" + "y=" + y);
        
        
        x=(float)0.35;
        y=Math.pow((Math.pow(Math.asin(x),2) +Math.pow(Math.acos(x),4)),3); 
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x=(float)0.4;
        y=Math.pow((Math.pow(Math.asin(x),2) +Math.pow(Math.acos(x),4)),3); 
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x=(float)0.55;
        y=Math.pow((Math.pow(Math.asin(x),2) +Math.pow(Math.acos(x),4)),3); 
        System.out.println("x=" + x + ";" + "y=" + y);
        
        x=(float)0.6;
        y=Math.pow((Math.pow(Math.asin(x),2) +Math.pow(Math.acos(x),4)),3); 
        System.out.println("x=" + x + ";" + "y=" + y);
        
        
         }

    
    public static void main(String[] args) {
        Calc myCalc = new Calc ();
        System.out.println("Task B");
        myCalc.taskB();
             
             
    }
    
}
