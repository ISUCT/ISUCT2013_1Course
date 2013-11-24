import java.util.ArrayList;

public class Calc {
    
    public float singleValue (double a, double b, float x){
    	float chisl;
        float znamen;
        chisl = (float)Math.sqrt(Math.abs(a-b*x));
        znamen =(float)Math.sqrt(Math.pow(Math.log10(x),3)); 
        float y = chisl/znamen;
        return y;
    }
        public  ArrayList<Float> taskB(){
            ArrayList<Float> y= new ArrayList<Float>();
          
        	double a = 7.2;
            double b = 4.2;
            
            //float chisl;
            //float znamen;
            
            float x = (float)2.4;
            y.add(singleValue(a, b, x));
            //chisl = (float)Math.sqrt(Math.abs(a-b*x));
            //znamen =(float)Math.sqrt(Math.pow(Math.log10(x),3)); 
            //float y = chisl/znamen;
            //System.out.println("x=" + x + "; " + "y=" + y);
            
            x = (float)2.8;
            y.add(singleValue(a, b, x));
            //chisl = (float)Math.sqrt(Math.abs(a-b*x));
            //znamen = (float)Math.sqrt(Math.log10(x));
            //y = chisl/znamen;
            //System.out.println("x=" + x + "; " + "y=" + y);
            
            x = (float)3.9;
            y.add(singleValue(a, b, x));
            //chisl = (float)Math.sqrt(Math.abs(a-b*x));
            //znamen = (float)Math.sqrt(Math.log10(x));
            //y = chisl/znamen;
            //System.out.println("x=" + x + "; " + "y=" + y);
            
            x = (float)4.7;
            y.add(singleValue(a, b, x));
            //chisl = (float)Math.sqrt(Math.abs(a-b*x));
            //znamen = (float)Math.sqrt(Math.log10(x));
            //y = chisl/znamen;
            //System.out.println("x=" + x + "; " + "y=" + y);
            
            x = (float)3.16;
            y.add(singleValue(a, b, x));
            //chisl = (float)Math.sqrt(Math.abs(a-b*x));
            //znamen = (float)Math.sqrt(Math.log10(x));
            //y = chisl/znamen;
            //System.out.println("x=" + x + "; " + "y=" + y);
            return y;       
        }
          	
        
        public ArrayList<Float> taskA(double a,double b,float xn, float xk, float xd) {
        	ArrayList<Float> y= new ArrayList<Float>();
        	//float xn = (float) 1.81;
            //float xk = (float) 5.31;
            //float xd = (float) 0.7;
            //double a = 7.2;
            //double b = 4.2;    
        	int i=0;
            for (float x = xn; x<=xk; x = x + xd) {
            y.add(singleValue(a, b, x));
            System.out.println("x=" + x + ";" + "y=" + y.get(i));
            i=i+1;
            }
            return y;
        }
           
    	public static void main (String[] args) {
    		Calc my = new Calc ();
    		ArrayList<Float> res=my.taskB();
    		for(int i=0; i<res.size(); i=i+1){
    		System.out.println("result >"+res.get(i));
    		}
    		
    		ArrayList<Float> res1=my.taskA(7.2, 4.2, 1.81f, 5.31f, 0.7f);
    		for (int i=0; i<res1.size(); i++){
    		System.out.println ("result >" + res1.get(i));
    		}
    	}      
}