/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author stud_5
 */
public class SimpleGui1B implements ActionListener{
    JButton button;
    
    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me for open");
        
        button.addActionListener(this);
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        button.setText("It's joke");
    }
}
