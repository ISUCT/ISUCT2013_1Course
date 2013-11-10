import java.util.ArrayList;


public class Calc {
	public float SingleValue(int a, float x){
		 float y = (float)(Math.pow(a,((Math.pow(x,2)-1)))-Math.log10(Math.pow(x,2)-1)+Math.pow(Math.pow(x,2)-1,(1/3.0)));
		 System.out.println("x="+x+"; "+"y="+y);
		 return y;}
	
     public ArrayList<Float> taskB(){
     ArrayList<Float> y= new ArrayList<Float>();
	 
	 int a=5;
	 
	 float x =(float)1.28;
	 y.add(SingleValue(a, x));
	 
	 x =(float)1.36;
	 y.add(SingleValue(a, x));
	 
	 x=(float)2.47;
	 y.add(SingleValue(a, x));
	 
	 x=(float)3.68;
	 y.add(SingleValue(a, x));
	
	 x=(float)4.56;
	 y.add(SingleValue(a, x));
	 
	 return y;
	 
     }
 public void taskA(int a){
     float xn = (float)1.2;
     float xk = (float)3.7;
     float dx = (float)0.5;
     for (float x = xn;x<=xk;x=x+dx){
         float result = SingleValue(a, x);
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
