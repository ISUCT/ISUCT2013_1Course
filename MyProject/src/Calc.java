import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruler
 */
public class Calc {
    public float singleValue(float a,float b,float x){
        float chisl;
        float znamen;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        return y;
    }
    
       public ArrayList<Float> taskB(){
          ArrayList<Float> y = new ArrayList<Float>();
        
        float a = 2;
        float b = 4.1f;
        float x = (float)1.24;
        y.add(singleValue(a, b, x));
        
        x=(float)1.38;
        y.add(singleValue(a, b, x));
        
        x=(float)2.38;
        y.add(singleValue(a, b, x));
        
        x=(float)3.21;
        y.add(singleValue(a, b, x));
        
        x=(float)0.68;
        y.add(singleValue(a, b, x));
        return y;
    }
      
      //    public void taskB(float a, float b, float[] X) {
////        float a = 2f ;
////        float b = 4.1f;
////        float x = (float)1.24;
//        System.out.println("taskB");
//        for (float x:X){
//            float result = singleValue(a,b,x);
//            System.out.println("x="+x+"; "+"y="+result);
       

//    }
    
    
    
    public ArrayList<Float> taskA(float a,float b,float xn, float xk, float dx) {
    ArrayList<Float> y= new ArrayList<Float>();


//        float xn = (float)0.77f;
//        float xk = (float)1.77f;
//        float dx = (float)0.2f;
//        System.out.println("taskA");
int i= 0;

        for(float x = xn;x<=xk;x=x+dx){
y.add(singleValue((int) a, b, x));

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
        ArrayList<Float> res1=my.taskA(2,4.1f,0.77f,1.77f,0.2f);
for (int i=0; i<res1.size(); i++){
System.out.println ("result >" + res1.get(i));
    
       }
    }
}