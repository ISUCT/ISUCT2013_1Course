package javaapplication1;
import javax.swing.*;

/**
 *
 * @author Stud_5
 */
public class SimpleGuil {


    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        JButton button = new JButton ("push me");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}