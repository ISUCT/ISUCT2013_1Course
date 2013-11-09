/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author User
*/
public class Calc {

public void taskA() {
float a = (float) 0.8;
float b = (float) 0.4;
float x;
float xn = (float) 1.23;
float dx = (float) 1.2;
float xk = (float) 7.23;
float chisl;
float znamen;
float y;

for (x = xn; x <= xk; x += dx) {
chisl = (float) Math.pow((Math.pow((x - a), b)), 1 / 3.0) + (float) Math.pow(Math.abs((x + b)), 1 / 5.0);
znamen = (float) Math.pow((Math.pow(x, 2) - Math.pow((x - b), b)), 1 / 9.0);
y = chisl / znamen;
System.out.println("x = " + x + "; y = " + y);
}

}

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
Calc myCalc = new Calc();
System.out.println("Task A");
myCalc.taskA();
}
}
