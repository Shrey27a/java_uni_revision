//import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class SimpleFrame{
 public static void main(String[] args){

    JFrame frame = new JFrame ("My First Frame");
    frame.setSize(300,200);
    frame.add(frame);

    frame.setLayout(null);
    frame.setLayout(new FlowLayout());

    JButton button  = new JButton("Click Me");
    button.setBounds(150,100,100,40);
    frame.add(button);

    JLabel label = new JLabel("Hello Swing!");
    label.setBounds(100,100,150,30);
    label.add(label);

    frame.setVisible(true);
 }
}
 
