package Prac8.Number2;

import javax.swing.*;
import java.awt.*;
public class Picture extends  JFrame {
    public static void main (String[] args) {
        Picture main = new Picture();
        main.go();
    }

    public void go () {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("D:\\Picture").getImage();
        g.drawImage(image, 3, 4, this);
    }
}