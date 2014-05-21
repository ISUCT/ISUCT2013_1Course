
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Calculator {

    public float singleValue(int a, float x) {
        float chisl;
        float znamen;
        chisl = (float) Math.pow(Math.log10(a + x), 2);
        znamen = (float) Math.pow((a + x), 2);
        float y = chisl / znamen;
        return y;
    }

    public ArrayList<Float> taskB() {
        ArrayList<Float> y = new ArrayList<Float>();
        int a = 2;
        float x = (float) 1.16;
        y.add(singleValue(a, x));
        x = (float) 1.32;  
        y.add(singleValue(a, x));
        x = (float) 1.47;
        y.add(singleValue(a, x));
        x = (float) 1.65;
        y.add(singleValue(a, x));
        x = (float) 1.93; 
        y.add(singleValue(a, x));
        return y;
    }


    public ArrayList<Float> taskA(int a, float xn, float xk, float dx) {
        ArrayList<Float> y = new ArrayList<Float>();
        int i = 0;
        for (float x = xn; x <= xk; x = x + dx) {
            y.add(singleValue(a, x));
            System.out.println("x=" + x + ";" + "y=" + y.get(i));
            i++;
        }
        return y;
    }

    public static void main(String[] args) {
        Calculator my = new Calculator();
        ArrayList<Float> res = my.taskB();
        for (int i = 0; i < res.size(); i++) {
            System.out.println("result >" + res.get(i));

        }
        my.taskA(2, 1.2f, 4.2f, 0.6f);
        System.out.println("Another");
        my.taskA(2, 1.2f, 4.2f, 0.6f);

    }
}
