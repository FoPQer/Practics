package Prac9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Draw1 extends JFrame {
    Random rand = new Random();
    Button button = new Button("Нажми меня");
    int sup;
    Draw1() {
        super("Нажмайка");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(20, 20, 1000, 800);
        button.setVisible(true);
        button.setBounds(880, 735, 100, 25);
        add(button);
        button.addActionListener(action);
    }

    final ActionListener action = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            sup = rand.nextInt(2);
            paint(Draw1.super.getGraphics());
        }
        public void paint(Graphics g) {
            switch(sup)
            {
                case 0:
                    Prac9.Rectangle rect = new Rectangle();
                    g.setColor(rect.getClr());
                    g.drawRect(rect.getPosition()[0], rect.getPosition()[1], rand.nextInt(100), rand.nextInt(100));
                    break;
                case 1:
                    Prac9.Circle circ = new Circle();
                    g.setColor(circ.getClr());
                    int radius = rand.nextInt(100);
                    g.drawOval(circ.getPosition()[0], circ.getPosition()[1], radius, radius);
                    break;
                default:
                    break;
            }
        }
    };

    public static void main(String[] args) {
        Draw1 draw = new Draw1();
        draw.setVisible(true);
    }
}
