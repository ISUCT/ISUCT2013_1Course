/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class calc {
    


  public void taskA(){

 
      float chisl;

       float znamen;

      
      float x = (float)0.1;
      
    chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);
float y = chisl+znamen;

   System.out.println("x=" + x + "; " + "y=" + y);

     

     x = (float)0.35;

     chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

     System.out.println("x=" + x + "; " + "y=" + y);


     x = (float)0.4;

      chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

      System.out.println("x=" + x + "; " + "y=" + y);

    
      x = (float)0.55;
      chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

     System.out.println("x=" + x + "; " + "y=" + y);

      
      x = (float)0.6;

      chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

      System.out.println("x=" + x + "; " + "y=" + y);

    

  }

   public static void main(String[] args){
       
         NewClass my = new NewClass();

          my.taskA();

      }

}    
