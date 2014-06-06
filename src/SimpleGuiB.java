/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author -
 */
public class SimpleGuiB implements ActionListener{
    JButton button;
    
    public static void main(String[] args) {
        SimpleGuiB gui = new SimpleGuiB();
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