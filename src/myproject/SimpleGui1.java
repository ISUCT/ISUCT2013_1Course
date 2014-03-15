/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import javax.swing.*;
/**
 *
 * @author stud_5
 */
public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Open file");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
