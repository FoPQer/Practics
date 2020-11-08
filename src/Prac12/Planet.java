package Prac12;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;


public class Planet extends JFrame
{
    final double G = 6.6720*Math.pow(10.0, -11.0);
    JButton button = new JButton("Расчет веса");
    JTextField text = new JTextField("Введи сюда свою массу");
    JCheckBox ch1 = new JCheckBox("Меркурий");
    JCheckBox ch2 = new JCheckBox("Венера");
    JCheckBox ch3 = new JCheckBox("Земля");
    JCheckBox ch4 = new JCheckBox("Марс");
    JCheckBox ch5 = new JCheckBox("Юпитер");
    JCheckBox ch6 = new JCheckBox("Сатурн");
    JCheckBox ch7 = new JCheckBox("Уран");
    JCheckBox ch8 = new JCheckBox("Нептун");

    Planet()
    {
        super("Mas on planets");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setBounds(10,10,300,300);
        button.setBounds(120,100,160,25);
        text.setBounds(120,150,160,25);
        ch1.setBounds(10,10,100,25);
        ch2.setBounds(10,40,100,25);
        ch3.setBounds(10,70,100,25);
        ch4.setBounds(10,100,100,25);
        ch5.setBounds(10,130,100,25);
        ch6.setBounds(10,160,100,25);
        ch7.setBounds(10,190,100,25);
        ch8.setBounds(10,220,100,25);
        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
        add(ch5);
        add(ch6);
        add(ch7);
        add(ch8);
        button.addActionListener(Action);
        add(button);
        add(text);
    }

    ActionListener Action = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String tt;
            int masHuman;
            tt = text.getText();
            masHuman = transform(tt);
            chek(masHuman);
        }
    };

    void chek(int masHuman)
    {
        planet sup2 = planet.MERCURY;
        int sup = 0;
        if(ch1.isSelected()) {
            sup++;
            sup2 = planet.MERCURY;
        }
        if(ch2.isSelected()) {
            sup++;
            sup2 = planet.VENUS;
        }
        if(ch3.isSelected()) {
            sup++;
            sup2 = planet.EARTH;
        }
        if(ch4.isSelected()) {
            sup++;
            sup2 = planet.MARS;
        }
        if(ch5.isSelected()) {
            sup++;
            sup2 = planet.JUPITER;
        }
        if(ch6.isSelected()) {
            sup++;
            sup2 = planet.SATURN;
        }
        if(ch7.isSelected()) {
            sup++;
            sup2 = planet.URANUS;
        }
        if(ch8.isSelected()) {
            sup++;
            sup2 = planet.NEPTUNIUM;
        }
        if (sup == 0){
            text.setText("Не выбрана планета");
        } else {
            if(sup == 1)
                text.setText("Ваш вес: " + (G*masHuman*sup2.mass)/(sup2.radius*sup2.radius));
            else
                text.setText("Слишком много планет");
        }

    }

    int transform(String text) {
        int out = 0;
        for(int i = 0; i < text.length(); i++)
        {
            switch (text.charAt(i))
            {
                case '0':
                    out += (int)(0 * Math.pow(10.0, (double)i));
                    break;
                case '1':
                    out += (int)(1 * Math.pow(10.0, (double)i));
                    break;
                case '2':
                    out += (int)(2 * Math.pow(10.0, (double)i));
                    break;
                case '3':
                    out += (int)(3 * Math.pow(10.0, (double)i));
                    break;
                case '4':
                    out += (int)(4 * Math.pow(10.0, (double)i));
                    break;
                case '5':
                    out += (int)(5 * Math.pow(10.0, (double)i));
                    break;
                case '6':
                    out += (int)(6 * Math.pow(10.0, (double)i));
                    break;
                case '7':
                    out += (int)(7 * Math.pow(10.0, (double)i));
                    break;
                case '8':
                    out += (int)(8 * Math.pow(10.0, (double)i));
                    break;
                case '9':
                    out += (int)(9 * Math.pow(10.0, (double)i));
                    break;
                default:
                    break;
            }
        }
        return out;
    }

    public enum planet {
        EARTH(59.726, 6371.0),
        JUPITER(18980, 69911),
        MARS(6.4171, 3389.5),
        MERCURY(3.285, 2439.7),
        NEPTUNIUM(1024, 24622),
        SATURN(5683, 58232),
        URANUS(868.1, 25362),
        VENUS(48.67, 6051.8);

        planet(double mas, double rad) {
            mass = mas;
            radius = rad;
        }
        double mass;
        double radius;
    }

    public static void main(String[] args) {
       Planet mane = new Planet();
    }
}
