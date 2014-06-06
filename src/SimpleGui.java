/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author -
 */
public class SimpleGui {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Open file");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
}
