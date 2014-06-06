package myproject;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author stPC
 */
class MyDrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
public static void main(String[] args) {
MyDrawPanel my = new MyDrawPanel();

}
}