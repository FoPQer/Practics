package Prac8.Number2;

import java.awt.*;
import javax.swing.*;

public class Picture extends JPanel{
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setSize(1800, 800);
        fr.setVisible(true);
        fr.add(new Picture());
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        Image img = new ImageIcon("D:\\Picture.jpg").getImage();
        g.drawImage(img, 0, 0, null);
    }
}