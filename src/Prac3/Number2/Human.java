package Prac3.Number2;

import java.util.Scanner;

public class Human
{
    String name;
    int old;
    Body myBody;
    Head myHead;
    Leg myLeg;
    Hand myHand;
    Human()
    {
        System.out.println("Введите имя персонажа");
        setName();
        System.out.println("Введите возраст персонажа");
        setOld();
        myBody = new Body();
        myHead = new Head();
        myLeg = new Leg();
        myHand = new Hand();
    }
    Scanner sc = new Scanner(System.in);
    public void setName()
    {
        name = sc.nextLine();
    }
    public void setOld()
    {
        old = sc.nextInt();
    }
    public int getOld()
    {
        return old;
    }
    public String getName()
    {
        return name;
    }
    void resume()
    {
        if (old % 10 == 1)
            System.out.println("Меня зовут " + name + ", мне " + old + " годик");
        if ((old % 10 >= 2) & (old % 10 <= 4))
            System.out.println("Меня зовут " + name + ", мне " + old + " годика");
        if (old % 10 >= 5 || old % 10 == 0)
            System.out.println("Меня зовут " + name + ", мне " + old + " годиков");
    }
}