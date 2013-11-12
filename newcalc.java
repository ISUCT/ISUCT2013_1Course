/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
   public class calc {
    


   public float singleValue ( float x){

     float chisl;

       float znamen;

    chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));

     znamen =(float)Math.pow(Math.acos(x),6);

     float y = chisl+znamen;

    return y;

     public  ArrayList<Float> taskB(){

            ArrayList<Float> y= new ArrayList<Float>();

 
      float chisl;

       float znamen;

      
      float x = (float)0.1;
     y.add(singleValue( x));
      
    chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

     float y = chisl+znamen;

    System.out.println("x=" + x + "; " + "y=" + y);
   }


     x = (float)0.35;
     y.add(singleValue( x));

     chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

     System.out.println("x=" + x + "; " + "y=" + y);


     x = (float)0.4;

    y.add(singleValue( x));

      chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

      System.out.println("x=" + x + "; " + "y=" + y);

    
      x = (float)0.55;

     y.add(singleValue( x));

      chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

     System.out.println("x=" + x + "; " + "y=" + y);

      
      x = (float)0.6;

    y.add(singleValue( x));

      chisl = (float)Math.sqrt(Math.pow(Math.asin(x),4));
     znamen =(float)Math.pow(Math.acos(x),6);

      y = chisl+znamen;

      System.out.println("x=" + x + "; " + "y=" + y);

     return y;
    

  }
     public ArrayList<Float> taskA(float xn, float xk, float xd) {

               ArrayList<Float> y= new ArrayList<Float>();

               float xn = (float) 1.81;

           float xk = (float) 5.31;

           float xd = (float) 0.7;

           int i=0;

            for (float x = xn; x<=xk; x = x + xd) {

           y.add(singleValue( x));

           System.out.println("x=" + x + ";" + "y=" + y.get(i));

           i=i+1;

            }

            return y;

        }


   public static void main(String[] args){
       
                 NewClass my = new NewClass(); 

                  ArrayList<Float> res=my.taskB();

                   for(int i=0; i<res.size(); i=i+1){

                   System.out.println("result >"+res.get(i));

                   }


                    ArrayList<Float> res1=my.taskA( 1.81f, 5.31f, 0.7f);

                    for (int i=0; i<res1.size(); i++){

                    System.out.println ("result >" + res1.get(i));

         
      }


}    
