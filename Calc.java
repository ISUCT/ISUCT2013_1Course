/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class Calc {

    public void taskB() {
        float a = (float) 1.35;
        float b = (float) 0.98;
        float x;
        float chisl;
        float znam;
        float y;

        x = (float) 0.35;
        chisl = (float) Math.pow((a * x + b), 1 / 3.0);
        znam = (float) Math.pow(Math.log(x), 2);
        y = chisl/znam;
        System.out.println("x=" + x + " y=" + y);

        x = (float) 1.28;
        chisl = (float) Math.pow((a * x + b), 1 / 3.0);
        znam = (float) Math.pow(Math.log(x), 2);
        y = chisl/znam;
        System.out.println("x=" + x + " y=" + y);

        x = (float) 3.51;
        chisl = (float) Math.pow((a * x + b), 1 / 3.0);
        znam = (float) Math.pow(Math.log(x), 2);
        y = chisl/znam;
        System.out.println("x=" + x + " y=" + y);

        x = (float) 5.21;
        chisl = (float) Math.pow((a * x + b), 1 / 3.0);
        znam = (float) Math.pow(Math.log(x), 2);
        y = chisl/znam;
        System.out.println("x=" + x + " y=" + y);

        x = (float) 4.16;
        chisl = (float) Math.pow((a * x + b), 1 / 3.0);
        znam = (float) Math.pow(Math.log(x), 2);
        y = chisl/znam;
        System.out.println("x=" + x + " y=" + y);


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calc myCalc = new Calc();
        System.out.println("Задача В");
        myCalc.taskB();
    }
}
