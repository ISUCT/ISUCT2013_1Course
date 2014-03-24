package simpleguil;
import javax.swing.*;
import java.awt.event.*;

public class Simpleguil2 implements ActionListener {
JButton button;
    
public static void main (String[]args) {
Simpleguil2 gui = new Simpleguil2();
gui.go();
    }
public void go() {
JFrame frame = new JFrame();
button = new JButton("Нажмите на меня");
        
button.addActionListener(this);
frame.getContentPane().add(button);
frame.setDefaultCloseOperation(JFrame.Exit_on_close);
frame.setSize(250,250);
frame.setVisible(true);
    }
public void actionPerformed(ActionEvent event){
button.setText("I've been clicked!");
    }
}
