package Prac11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainGame extends JFrame
{
    Random rand = new Random();
    TextField text;
    Button button = new Button("Ввести");
    String sup;
    int sup2;
    int sup3 = 3;
    int number = rand.nextInt(21);
    MainGame()
    {
        super("Игрушка");
        text = new TextField("Привет!");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(300,300, 400,250);
        text.setVisible(true);
        text.setBounds(100, 5, 200, 25);
        button.setBounds(175, 50, 45, 25);
        button.setVisible(true);
        add(text);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sup = text.getText();
                sup2 = ChangeToInt(sup);
                if(sup2 == number)
                    text.setText("Ура! Победа!");
                else {
                    sup3--;
                    text.setText("Неа, осталось попыток: " + sup3);
                    if(sup3 == 0)
                        text.setText("Осталось 0 попыток, вы проиграли");
                }
            }
        });
    }
    int ChangeToInt(String str)
    {
        int sup = 0;
        char ssup;
        for(int i = 0; i < str.length(); i++)
        {
            ssup = str.charAt(i);
            switch (ssup)
            {
                case '0':
                    sup += (int)(0 * Math.pow(10.0, (double)i));
                    break;
                case '1':
                    sup += (int)(1 * Math.pow(10.0, (double)i));
                    break;
                case '2':
                    sup += (int)(2 * Math.pow(10.0, (double)i));
                    break;
                case '3':
                    sup += (int)(3 * Math.pow(10.0, (double)i));
                    break;
                case '4':
                    sup += (int)(4 * Math.pow(10.0, (double)i));
                    break;
                case '5':
                    sup += (int)(5 * Math.pow(10.0, (double)i));
                    break;
                case '6':
                    sup += (int)(6 * Math.pow(10.0, (double)i));
                    break;
                case '7':
                    sup += (int)(7 * Math.pow(10.0, (double)i));
                    break;
                case '8':
                    sup += (int)(8 * Math.pow(10.0, (double)i));
                    break;
                case '9':
                    sup += (int)(9 * Math.pow(10.0, (double)i));
                    break;
                default:
                    break;
            }
        }
        return sup;
    }

    public static void main(String[] args) {
        MainGame game = new MainGame();
        game.setVisible(true);
    }
}