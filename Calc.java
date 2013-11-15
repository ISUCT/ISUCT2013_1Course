public class Calc {
    public void taskB() {
        int a = 2 ;
        double b = 4.1;
        
        float chisl;
        float znamen;
        
        float x=(float)1.24;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x1,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x = (float)1.38;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x2,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x = (float)2.38;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x3,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x = (float)3.21;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x4,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
        
        x = (float)0.68;
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x5,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);}

    public static void main (String[] args) {
        Calc my = new Calc ();
        my.taskB();
    }
        
    }