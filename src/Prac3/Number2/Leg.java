package Prac3.Number2;

import java.util.Scanner;

public class Leg
{
    int quantity;
    int speed;
    Scanner sc = new Scanner(System.in);
    Leg()
    {
        System.out.println("Введите количество ног вашего персонажа");
        setQuantity();
        System.out.println("Введите скорость вашего персонажа в м/с");
        setSpeed();
    }
    public void setQuantity()
    {
        quantity = sc.nextInt();
    }

    public void setSpeed()
    {
        speed = sc.nextInt();
    }
    public int getQuantity()
    {
        return quantity;
    }
    public int getSpeed()
    {
        return speed;
    }
    void run()
    {
        System.out.println("Введите время бега вашего персонажа в секундах");
        int time = sc.nextInt();
        System.out.println("Ваш персонаж пробежал " + (time * speed) +" м");
    }
    void mutation()
    {
        quantity++;
        System.out.println("Ваш персонаж отрастил ещё одну ногу");
    }
}