package Prac8.Number2;

import javax.swing.*;

public class Picture extends JFrame
{
    Picture()
    {
        JFrame frm = new JFrame("Картинка");
        frm.setBounds(300,300,400,400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Нажми");
        setVisible(true);
    }

    public static void main(String[] args) {
        Picture pic = new Picture();
    }
}
