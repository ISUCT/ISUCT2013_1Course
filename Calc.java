
public class Calc {
 public void taskA() {
	 
	 int a=5;
	 float y;
	 
	 float x1=(float)1.28;
	 y = (float)(Math.pow(a,((Math.pow(x1,2)-1)))-Math.log10(Math.pow(x1,2)-1)+Math.pow(Math.pow(x1,2)-1,(1/3.0)));
	 System.out.println("x="+x1+"; "+"y="+y);
	 
	 float x2=(float)1.36;
	 y = (float)(Math.pow(a,((Math.pow(x2,2)-1)))-Math.log10(Math.pow(x2,2)-1)+Math.pow(Math.pow(x2,2)-1,(1/3.0)));
	 System.out.println("x="+x2+"; "+"y="+y);
	 
	 float x3=(float)2.47;
	 y = (float)(Math.pow(a,((Math.pow(x3,2)-1)))-Math.log10(Math.pow(x3,2)-1)+Math.pow(Math.pow(x3,2)-1,(1/3.0)));
	 System.out.println("x="+x3+"; "+"y="+y);
	 
	 float x4=(float)3.68;
	 y = (float)(Math.pow(a,((Math.pow(x4,2)-1)))-Math.log10(Math.pow(x4,2)-1)+Math.pow(Math.pow(x4,2)-1,(1/3.0)));
	 System.out.println("x="+x4+"; "+"y="+y);
	 
	 float x5=(float)4.56;
	 y = (float)(Math.pow(a,((Math.pow(x5,2)-1)))-Math.log10(Math.pow(x5,2)-1)+Math.pow(Math.pow(x5,2)-1,(1/3.0)));
	 System.out.println("x="+x5+"; "+"y="+y);
		}
 public static void main(String[] args){
     Calc my = new Calc();
     my.taskA();
 }

}
