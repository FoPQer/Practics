package Prac17;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GUIMyGame extends JFrame {
    JButton moveUp = new JButton();
    Random rand = new Random();
    MyGame snake = new MyGame(255, 255);
    MyGame point = new MyGame(rand.nextInt(510), rand.nextInt(510));
    GUIMyGame() {
        setBounds(200,200,510,510);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        this.addKeyListener(move);
    }

    KeyListener move = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (KeyEvent.VK_UP == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX(), snake.getPositionY() + 1);
                System.out.println(snake.getPositionX() + " " + snake.getPositionY());
            }
            if (KeyEvent.VK_DOWN == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX(), snake.getPositionY()-1);
                System.out.println(snake.getPositionX() + " " + snake.getPositionY());
            }
            if (KeyEvent.VK_RIGHT == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX()+1, snake.getPositionY());
                System.out.println(snake.getPositionX() + " " + snake.getPositionY());
            }
            if (KeyEvent.VK_LEFT == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX()-1, snake.getPositionY());
                System.out.println(snake.getPositionX() + " " + snake.getPositionY());
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    @Override
    public void paint(Graphics g) {
        g.drawRect(snake.getPositionX(), snake.getPositionY(), 2,2);
    }
}
