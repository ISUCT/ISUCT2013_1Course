/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Calc {
 
    //              a             b
    // y = arcsin (x ) + arccos (x )
    
    
    int a = 2;
    int b = 3;
    float x;
    float xn = (float) 0.11;
    float dx = (float) 0.05;
    float xk = (float) 0.36;
    float y;

    public void taskA() {

        for (x = xn; x <= xk; x += dx) {

            y = (float) Math.asin(Math.pow(x, a)) + (float) Math.acos(Math.pow(x, b));

            System.out.println("x=" + x + ";" + "y=" + y);
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
