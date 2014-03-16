/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author -
 */
public class CalcEc {

    public float singleValue(float a, float b, float x) {
        float y;
        y = (float)(Math.pow((a * x + b), 1 / 3f));
//     System.out.println("x=" + x + ";" + "y=" + y);
        return y;
    }

    public void task() {
        float AAAA = 1.5f;
        float b = 2;

        float xn = 0;
        float xk = 30;
        float dx = 2;
        for (float x = xn; x <= xk; x = x + dx) {
            float result = singleValue(AAAA, b, x);
            System.out.println("x=" + x + ";" + "y=" + result);
        }
    }

    public static void main(String[] args) {
        CalcEc my = new CalcEc();
        my.task();
    }
}
