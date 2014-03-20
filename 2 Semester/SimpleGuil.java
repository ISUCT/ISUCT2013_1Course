/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleguil;
import javax.swing.*;

/**
 *
 * @author Stud_5
 */
public class SimpleGuil {


    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        JButton button = new JButton ("click me");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}