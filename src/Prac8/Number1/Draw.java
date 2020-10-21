package Prac8.Number1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Draw extends JFrame {
    Random rand = new Random();
    Draw()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(20, 20, 1000, 800);
    }
    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 20; i++) {
            int sup = rand.nextInt(2);
            switch (sup) {
                case 0:
                    Rectangle rect = new Rectangle();
                    g.setColor(rect.getClr());
                    g.drawRect(rect.getPosition()[0], rect.getPosition()[1], rand.nextInt(100), rand.nextInt(100));
                    break;
                case 1:
                    Circle circ = new Circle();
                    g.setColor(circ.getClr());
                    int radius = rand.nextInt(100);
                    g.drawOval(circ.getPosition()[0], circ.getPosition()[1], radius, radius);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setVisible(true);
    }
}
