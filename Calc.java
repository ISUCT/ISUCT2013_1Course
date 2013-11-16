public class Calc {
 public float SingleValue(int a, float b, float x){
	
        float chisl;
        float znamen;
        
        chisl = (float) Math.log((Math.pow(b,2))-(Math.pow(x,2)));
        znamen = (float)Math.pow((Math.abs(Math.pow(x1,2))-(Math.pow(a,2))),(1/3.0));
        float y = chisl/znamen;
        System.out.println("x="+x+"; "+"y="+y);
	return y;

    public ArrayList<Float> taskB(){
        ArrayList<Float> y= new ArrayList<Float>();

        int a = 2 ;
        float b = 4.1;
        
        x =(float)1.24;
	y.add(singleValue(a, b, x));
        
        x = (float)1.38;
	y.add(singleValue(a, b, x));
        
        x = (float)2.38;
	y.add(singleValue(a, b, x));
        
        x = (float)3.21;
	y.add(singleValue(a, b, x));

        x = (float)0.68;
	y.add(singleValue(a, b, x));
	return y;
}
	public void taskA(int a, float b){
             float xn = (float)0.08;
             float xk = (float)1.08;
             float dx = (float)0.2;
             for (float x = xn;x<=xk;x=x+dx){
                 float result = singleValue(a, b, x);
                 System.out.println("x="+x+"; "+"y="+result);}


 public static void main(String[] args){
        Calc my = new Calc();
        ArrayList<Float> res=my.taskB();
        for(int i=0;i<res.size();i++){
            System.out.println("result >"+res.get(i));
    }
}
