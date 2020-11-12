package Prac17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GUIMyGame extends JFrame {
    int x = 255, y = 255;
    JButton moveUp = new JButton();
    Random rand = new Random();
    MyGame snake = new MyGame(255, 255);
    MyGame point = new MyGame(rand.nextInt(508) + 1, rand.nextInt(508) + 1);
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
                snake.setPosition(snake.getPositionX(), snake.getPositionY() - 2);
                repaint();
                if(catched())
                    point.setPosition(rand.nextInt(508) + 1, rand.nextInt(500) + 7);
            }
            if (KeyEvent.VK_DOWN == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX(), snake.getPositionY()+2);
                repaint();
                if(catched())
                    point.setPosition(rand.nextInt(508) + 1, rand.nextInt(500) + 7);
            }
            if (KeyEvent.VK_RIGHT == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX()+2, snake.getPositionY());
                repaint();
                if(catched())
                    point.setPosition(rand.nextInt(508) + 1, rand.nextInt(500) + 7);
            }
            if (KeyEvent.VK_LEFT == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX()-2, snake.getPositionY());
                repaint();
                if(catched())
                    point.setPosition(rand.nextInt(508) + 1, rand.nextInt(500) + 7);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    @Override
    public void paint(Graphics g) {
        if(changed()) {
            g.clearRect(x - 1, y - 1, 4, 4);
            x = snake.getPositionX();
            y = snake.getPositionY();
        }
        g.setColor(Color.BLUE);
        g.drawRect(snake.getPositionX(), snake.getPositionY(), 2,2);
        g.setColor(Color.RED);
        g.drawRect(point.getPositionX(), point.getPositionY(), 2,2);
    }

    boolean changed(){
        return snake.getPositionX() != x || snake.getPositionY() != y;
    }

    boolean catched(){
        return (((point.getPositionY() - snake.getPositionY()) <= Math.abs(1)) && ((point.getPositionX() - snake.getPositionX()) <= Math.abs(1)));
    }
}
