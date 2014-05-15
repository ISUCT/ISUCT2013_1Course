package javaapplication1;

import java.util.ArrayList;

public class Calc {
    
    public float singleValue (float a, float b, float x){
    	float chisl;
        float znamen;
        chisl = (float)Math.sqrt(Math.abs(a-b*x));
        znamen =(float)Math.sqrt(Math.pow(Math.log10(x),3)); 
        float y = chisl/znamen;
        return y;
    }
        public  ArrayList<Float> taskB(){
            ArrayList<Float> y= new ArrayList<Float>();
          
            float a = 5;
            float b = 8;

            
            float x = (float)1.7;
            y.add(singleValue(a, b, x));
            
            x = (float)2.4;
            y.add(singleValue(a, b, x));
            
            x = (float)3.5;
            y.add(singleValue(a, b, x));
            
            x = (float)5.7;
            y.add(singleValue(a, b, x));
            
            x = (float)4.8;
            y.add(singleValue(a, b, x));
            return y;       
        }
          	
        
        public ArrayList<Float> taskA( float a, float b,float xn, float xk, float xd) {
        	ArrayList<Float> y= new ArrayList<Float>();    
        	int i=0;
            for (float x = xn; x<=xk; x = x + xd) {
            y.add(singleValue(a, b, x));
            String myStr = String.format("результат вычислений для x=%,.4f равен y=%,.4f",x,y.get(i));
            System.out.println(myStr);
            i=i+1;
            }
            return y;
        }
           
    	public static void main (String[] args) {
    		Calc my = new Calc ();
    		ArrayList<Float> res=my.taskB();
    		for(int i=0; i<res.size(); i=i+1){
                String myStr = String.format("результат вычислений для x=%,.4f",res.get(i));
    		System.out.println(myStr);
    		}
    		
    		ArrayList<Float> res1=my.taskA(5f, 8f, 2.4f, 5.9f, 0.5f);
    		for (int i=0; i<res1.size(); i++){
                String myStr = String.format("результат вычислений для x=%,.4f",res1.get(i));
    		System.out.println (myStr);
    		}
    	}      

    ArrayList<Float> taskA(double A, double B, float f, float f0, float f1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
