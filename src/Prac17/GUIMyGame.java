package Prac17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GUIMyGame extends JFrame {
    int x = 255, y = 255;
    int i = 0;
    Random rand = new Random();
    MyGame snake = new MyGame(255, 255);
    MyGame point = new MyGame(rand.nextInt(506) + 1, rand.nextInt(500) + 10);
    GUIMyGame() {
        super("ИграПоймай-ка");
        setBounds(200,200,510,510);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        this.addKeyListener(move);
        super.getGraphics().setColor(Color.BLUE);
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
                if(catched()) {
                    GUIMyGame.super.getGraphics().clearRect(0, 0, 510, 510);
                    point.setPosition(rand.nextInt(506) + 2, rand.nextInt(500) + 10);
                    repaint();
                }
            }
            if (KeyEvent.VK_DOWN == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX(), snake.getPositionY()+2);
                repaint();
                if(catched()) {
                    GUIMyGame.super.getGraphics().clearRect(0, 0, 510, 510);
                    point.setPosition(rand.nextInt(506) + 2, rand.nextInt(500) + 10);
                    repaint();
                }
            }
            if (KeyEvent.VK_RIGHT == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX()+2, snake.getPositionY());
                repaint();
                if(catched()) {
                    GUIMyGame.super.getGraphics().clearRect(0, 0, 510, 510);
                    point.setPosition(rand.nextInt(506) + 2, rand.nextInt(500) + 10);
                    repaint();
                }
            }
            if (KeyEvent.VK_LEFT == e.getKeyCode()) {
                snake.setPosition(snake.getPositionX()-2, snake.getPositionY());
                repaint();
                if(catched()) {
                    GUIMyGame.super.getGraphics().clearRect(0, 0, 510, 510);
                    point.setPosition(rand.nextInt(506) + 2, rand.nextInt(500) + 10);
                    repaint();
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    @Override
    public void paint(Graphics g) {
        if(changed()) {
            g.clearRect(point.getPositionX() - 3, point.getPositionY() - 3, 9, 9);
            g.clearRect(x - 1, y - 1, 6, 6);
            x = snake.getPositionX();
            y = snake.getPositionY();
        }
        g.setColor(Color.BLUE);
        g.drawRect(snake.getPositionX(), snake.getPositionY(), 4,4);
        g.setColor(Color.RED);
        g.drawRect(point.getPositionX(), point.getPositionY(), 4,4);
    }

    boolean changed(){
        return snake.getPositionX() != x || snake.getPositionY() != y;
    }

    boolean catched(){
        int sup = point.getPositionY() - snake.getPositionY(), sup2 = point.getPositionX()-snake.getPositionX();
        return ((sup <= 1) && (sup >= -1)) && ((sup2 <= 1) && (sup2 >= -1));
    }
}