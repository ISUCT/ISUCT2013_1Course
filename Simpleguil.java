package simpleguil;
import javax.swing.*;

public class Simpleguil {
public static void main(String[] args) {
JFrame frame = new JFrame ();
JButton button = new JButton ("click me");
frame.setDefaultCloseOperation (JFrame.Exit_on_close);
frame.getContentPane().add(button);
frame.setSize(250,250);
frame.setVisible(true);
    }
}
