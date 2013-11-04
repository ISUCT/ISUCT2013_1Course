/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Den1
 */
public class Calc {

    public void taskB() {
        float a = (float) 0.8;
        float b = (float) 0.4;
        float x1 = (float)1.88;
        float x2 = (float) 2.26;
        float x3 = (float) 3.84;
        float x4 = (float) 4.55; 
        float x5 = (float) -6.21;
        float y;

        float x = x1;
        float chisl = (float) Math.pow((Math.pow((x - a), b)), 1 / 3.0) + (float) Math.pow(Math.abs((x + b)), 1 / 5.0);
        float znamen = (float) Math.pow((Math.pow(x, 2) - Math.pow((x - b), b)), 1 / 9.0);
        y = chisl / znamen;
        System.out.println("x = " + x + "; y = " + y);

        x = x2;
        chisl = (float) Math.pow((Math.pow((x - a), b)), 1 / 3.0) + (float) Math.pow(Math.abs((x + b)), 1 / 5.0);
        znamen = (float) Math.pow((Math.pow(x, 2) - Math.pow((x - b), b)), 1 / 9.0);
        y = chisl / znamen;
        System.out.println("x = " + x + "; y = " + y);

        x = x3;
        chisl = (float) Math.pow((Math.pow((x - a), b)), 1 / 3.0) + (float) Math.pow(Math.abs((x + b)), 1 / 5.0);
        znamen = (float) Math.pow((Math.pow(x, 2) - Math.pow((x - b), b)), 1 / 9.0);
        y = chisl / znamen;
        System.out.println("x = " + x + "; y = " + y);

        x = x4;
        chisl = (float) Math.pow((Math.pow((x - a), b)), 1 / 3.0) + (float) Math.pow(Math.abs((x + b)), 1 / 5.0);
        znamen = (float) Math.pow((Math.pow(x, 2) - Math.pow((x - b), b)), 1 / 9.0);
        y = chisl / znamen;
        System.out.println("x = " + x + "; y = " + y);

        x = x5;
        chisl = (float) Math.pow((Math.pow((x - a), b)), 1 / 3.0) + (float) Math.pow(Math.abs((x + b)), 1 / 5.0);
        znamen = (float) Math.pow((Math.pow(x, 2) - Math.pow((x - b), b)), 1 / 9.0);
        y = chisl / znamen;
        System.out.println("x = " + x + "; y = " + y);


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calc myCalc = new Calc ();
        myCalc.taskB();
    }
}
