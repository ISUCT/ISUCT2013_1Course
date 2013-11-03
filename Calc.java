public class Calc {
	public void taskA(){
		
		double a = 7.2;
		double b = 4.2;
    	float chisl;
        float znamen;
    	
    	float x = (float)2.4;
    	chisl = (float)Math.sqrt(Math.abs(a-b*x));
    	znamen =(float)Math.sqrt(Math.pow(Math.log10(x),3));
    	
    	float y = chisl/znamen;
    	System.out.println("x=" + x + "; " + "y=" + y);
    	
    	x = (float)2.8;
    	chisl = (float)Math.sqrt(Math.abs(a-b*x));
    	znamen = (float)Math.sqrt(Math.log10(x));
    	y = chisl/znamen;
    	System.out.println("x=" + x + "; " + "y=" + y);
    	
    	x = (float)3.9;
    	chisl = (float)Math.sqrt(Math.abs(a-b*x));
    	znamen = (float)Math.sqrt(Math.log10(x));
    	y = chisl/znamen;
    	System.out.println("x=" + x + "; " + "y=" + y);
    	
    	x = (float)4.7;
    	chisl = (float)Math.sqrt(Math.abs(a-b*x));
    	znamen = (float)Math.sqrt(Math.log10(x));
    	y = chisl/znamen;
    	System.out.println("x=" + x + "; " + "y=" + y);
    	
    	x = (float)3.16;
    	chisl = (float)Math.sqrt(Math.abs(a-b*x));
    	znamen = (float)Math.sqrt(Math.log10(x));
    	y = chisl/znamen;
    	System.out.println("x=" + x + "; " + "y=" + y);
    
	}
	 public static void main(String[] args){
	        Calc my = new Calc();
	        my.taskA();
	    }
}    
