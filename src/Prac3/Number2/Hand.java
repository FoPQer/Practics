package Prac3.Number2;

import java.util.Scanner;

public class Hand
{
    int quantity;
    int pump;
    Scanner sc = new Scanner(System.in);
    Hand()
    {
        System.out.println("Введите количество рук вашего персонажа");
        setQuantity();
        System.out.println("Введите накаченность вашего персонажа в процентах");
        setPump();
    }
    void setQuantity()
    {
        quantity = sc.nextInt();
    }
    void setPump()
    {
        pump = sc.nextInt();
    }
    public int getPump()
    {
        return pump;
    }
    public int getQuantity()
    {
        return quantity;
    }
    void pumpUp()
    {
        pump++;
        System.out.println("Вы накачали своего персонажа на 1%");
    }
    void mutation()
    {
        quantity++;
        System.out.println("Ваш персонаж отрастил ещё одну руку");
    }
}