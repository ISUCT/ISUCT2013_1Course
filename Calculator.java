public class Calculator {
    public void taskB () {
        float a = 2.5f;
        double b = 4.6f;
        float x = (float)1.2; 
        float chisl;
        float znamen;
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
       float y = chisl/znamen;
        System.out.println ("x="+ x +"; "+"y="+ y);
        
        x = (float)1.28; 
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
        y = chisl/znamen;
         System.out.println ("x="+x+"; "+"y="+y);
         
         
         x = (float)1.36; 
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
        y = chisl/znamen;
         System.out.println ("x="+x+"; "+"y="+y);
         
         
         x = (float)1.46; 
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
        y = chisl/znamen;
         System.out.println ("x="+x+"; "+"y="+y);
         
         x = (float)2.35; 
        chisl = (float)((Math.pow((a+b*x),2.5)));
        znamen = (float)(1+(Math.log10(a+b*x)));
        y = chisl/znamen;
         System.out.println ("x="+x+"; "+"y="+y);
         
         
    }
    public static void main (String [] args){
        Calculator my = new Calculator ();
        my.taskB();
    }
}



