public class Calc {
 public void taskA(){
	 
	 int a = 5;
	 int b = 8;
	 
	 float chisl;
	 float znam;
	 
	 float x=(float)0.1;
	 chisl = (float) ((float)Math.log(a)/Math.log(10)*(Math.abs(Math.pow(b,2))-(Math.pow(x,2))));
	 znam = (float) ((float)Math.pow((Math.abs((Math.pow(x,2))-((Math.pow(a,2))))),(1/5.0)));
	 float y1 = chisl/znam;
	 System.out.println("x="+x+"; "+"y="+y1);
	 
	 x=(float)0.3;
	 chisl = (float) ((float)Math.log(a)/Math.log(10)*(Math.abs(Math.pow(b,2))-(Math.pow(x,2))));
	 znam = (float) ((float)Math.pow((Math.abs((Math.pow(x,2))-((Math.pow(a,2))))),(1/5.0)));
	 float y2 = chisl/znam;
	 System.out.println("x="+x+"; "+"y="+y2);
	 
	 x=(float)0.4;
	 chisl = (float) ((float)Math.log(a)/Math.log(10)*(Math.abs(Math.pow(b,2))-(Math.pow(x,2))));
	 znam = (float) ((float)Math.pow((Math.abs((Math.pow(x,2))-((Math.pow(a,2))))),(1/5.0)));
	 float y3 = chisl/znam;
	 System.out.println("x="+x+"; "+"y="+y3);
	 
	 x=(float)0.45;
	 chisl = (float) ((float)Math.log(a)/Math.log(10)*(Math.abs(Math.pow(b,2))-(Math.pow(x,2))));
	 znam = (float) ((float)Math.pow((Math.abs((Math.pow(x,2))-((Math.pow(a,2))))),(1/5.0)));
	 float y4 = chisl/znam;
	 System.out.println("x="+x+"; "+"y="+y4);
	 
	 x=(float)0.65;
	 chisl = (float) ((float)Math.log(a)/Math.log(10)*(Math.abs(Math.pow(b,2))-(Math.pow(x,2))));
	 znam = (float) ((float)Math.pow((Math.abs((Math.pow(x,2))-((Math.pow(a,2))))),(1/5.0)));
	 float y5 = chisl/znam;
	 System.out.println("x="+x+"; "+"y="+y5);
	 // программа скорее всего не работает, т.к. у меня эклипс сломался :с
	 }
}
