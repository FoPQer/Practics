package Prac3.Number2;

import java.util.Scanner;

public class Head
{
    int iq;
    Scanner sc = new Scanner(System.in);
    Head()
    {
        System.out.println("Введите iq головы персонажа");
        setIq();
    }
    public void setIq()
    {
        iq = sc.nextInt();
    }
    public int getIq()
    {
        return iq;
    }
    void teach()
    {
        iq++;
        System.out.println("Голова доучилась до " + iq + " iq");
    }
    void say()
    {
        System.out.println("Что персонаж скажет?");
        String phrase;
        phrase = sc.nextLine();
        System.out.println("Персонаж сказал: " + phrase);
    }
}