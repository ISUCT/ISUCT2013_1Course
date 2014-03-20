/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleguil;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Stud_5
 */
public class SimpleGuilB implements ActionListener {
    JButton button;
    
    public static void main (String[]args) {
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Нажми на меня");
        
        button.addActionListener(this);
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
}