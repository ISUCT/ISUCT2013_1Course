
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calc {
    
    public float singleValue (float a, float b, float x){
        float chisl;
        float znamen;
        chisl = (float)(1+Math.pow((Math.log10(x/a)), 2));
        znamen = (float)(b-(Math.pow(Math.E , x/a )));
        float y = chisl/znamen;
        return y;
    }
        public  ArrayList<Float> taskB(){
            ArrayList<Float> y= new ArrayList<Float>();
          
           float a = 2;
           float b = 0.95f;
           float x = (float)2.2;
           y.add(singleValue(a, b, x));
           
           
         x = (float)3.78;
      y.add(singleValue(a, b, x));
      
      
             x = (float)4.51;    
           y.add(singleValue(a, b, x));
                 
            x = (float)6.58;
            y.add(singleValue(a, b, x));
            
            x = (float)1.2;
            y.add(singleValue(a, b, x));
            return y;       
        }
    
    
//    public void taskB(float a, float b, float[] X) {
////        float a = 2f ;
////        float b = 0.95f;
////        float x = (float)2.2;
//        System.out.println("taskB");
//        for (float x:X){
//            float result = singleValue(a,b,x);
//            System.out.println("x="+x+"; "+"y="+result);
       

//    }
    
    
    
    public ArrayList<Float> taskA(float a,float b,float xn, float xk, float dx) {
    ArrayList<Float> y= new ArrayList<Float>();


//        float xn = (float)1.25f;
//        float xk = (float)2.75f;
//        float dx = (float)0.3f;
//        System.out.println("taskA");
int i= 0;

        for(float x = xn;x<=xk;x=x+dx){
y.add(singleValue(a, b, x));

        System.out.println("x="+x+"; "+"y="+y.get(i));
i++;

        }
return y;

    }
        
       
   
           
    public static void main (String[] args) {
        Calc my = new Calc ();
ArrayList<Float> res=my.taskB();
        for(int i=0;i<res.size(); i++){
            System.out.println("result >"+res.get(i));
        }
        ArrayList<Float> res1=my.taskA(2,0.95f,1.25f,2.75f,0.3f);
for (int i=0; i<res1.size(); i++){
System.out.println ("result >" + res1.get(i));

//        my.taskA(1,1.95f,0,10,0.1f);
//        float[] myX={2.2f,3.78f,4.51f,6.58f,1.2f};
//        my.taskB(1,1.95f,myX);
    
       }
    }
}
