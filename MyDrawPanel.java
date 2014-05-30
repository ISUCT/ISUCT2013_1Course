/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author stud_5
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
