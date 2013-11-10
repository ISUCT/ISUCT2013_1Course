/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stud_17
 */
public class Calculator {
    
    public float singleValue (float a, float b, float x){
        float chisl;
        float znamen;
    
//        double a = 1.2;
//        double b = 0.48;
//        float x = (float)0.25;
//        float chisl;
//        float znamen;
        chisl = (float) ((float)(Math.pow(b, 3))+(Math.pow(Math.sin(a*x), 2)));
        znamen = (float) ((float)(Math.acos(x*b*x))+(Math.pow(Math.E, -x/2)));
        float y = chisl/znamen;
        return y;
    }
        public void taskB (float a, float b, float[] X){
//        x = (float)0.36;
//        
         System.out.println("taskB");
        for (float x:X){
            float result = singleValue(a,b,x);
            System.out.println("x="+x+"; "+"y="+result);
        }
        }
        
            
//        x = (float)0.56;
//        
//        
//        x = (float)0.94;
//      
//        
//        x = (float)1.28;
//       
//        
             
        
        
        public void taskA(float a,float b,float xn, float xk, float dx) {
//            float xn = (float)0.7f;
//            float xk = (float)2.2f;
//            float dx = (float)0.3f;
            System.out.println("taskA");
        for(float x = xn;x<=xk;x=x+dx){
        
        float result = singleValue(a,b,x);
        System.out.println("x="+x+"; "+"y="+result);
        }
        }
        
        public static void main (String[] args) {
        
    Calculator my = new Calculator();
    my.taskA(1.2f,0.48f,0.7f,2.2f,0.3f) ;
    my.taskA(1,1.95f,0,10,0.1f);
    float[] myX={0.25f,0.36f,0.56f,0.94f,1.28f};
    my.taskB(1,1.95f,myX);
    
}

}

        
    
