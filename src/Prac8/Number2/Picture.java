package Prac8.Number2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Picture extends JFrame
{
    Picture()
    {
        JFrame frm = new JFrame("Картинка");
        frm.setBounds(300,300,400,400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);
        ImageIcon image = new ImageIcon("")
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        Picture pic = new Picture();
    }
}
