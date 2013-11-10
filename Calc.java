import java.util.ArrayList;

public class Calc{
    public float singleValue(int a,float b,float x){
        float chisl;
        float znam;
        chisl = (float) ((float)Math.log(a)/Math.log(10)*(Math.abs(Math.pow(b,2))-(Math.pow(x,2))));
         znam = (float) ((float)Math.pow((Math.abs((Math.pow(x,2))-((Math.pow(a,2))))),(1/5.0)));
         float y = chisl/znam;
         System.out.println("x="+x+"; "+"y="+y);
         return y;
    }
      public ArrayList<Float> taskB(){
        ArrayList<Float> y= new ArrayList<Float>();
         
         int a = 2;
         float b = 1.1f;
        
         float x=(float)0.1;
         y.add(singleValue(a, b, x));
         
         x=(float)0.3;
         y.add(singleValue(a, b, x));
         
         x=(float)0.4;
         y.add(singleValue(a, b, x));
         
         x=(float)0.45;
         y.add(singleValue(a, b, x));
         
         x=(float)0.65;
         y.add(singleValue(a, b, x));
         
         return y;
 }
         
         public void taskA(int a, float b){
             float xn = (float)0.08;
             float xk = (float)1.08;
             float dx = (float)0.2;
             for (float x = xn;x<=xk;x=x+dx){
                 float result = singleValue(a, b, x);
                 System.out.println("x="+x+"; "+"y="+result);
         }
         
 }
    public static void main(String[] args){
        Calc my = new Calc();
        ArrayList<Float> res=my.taskB();
        for(int i=0;i<res.size();i++){
            System.out.println("result >"+res.get(i));
    }
    }
}
