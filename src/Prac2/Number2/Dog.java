package Prac2.Number2;

import java.util.Scanner;

public class Dog
{
    String name;
    int old;
    Scanner sc = new Scanner(System.in);
    Dog()
    {
        System.out.println("Введите имя собаки");
        name = sc.nextLine();
        System.out.println("Введите возраст собаки");
        old = sc.nextInt();
    }
    int reold()
    {
        return old * 7;
    }

    @Override
    public String toString() {
        return "Собака " + name + ", возраст " + old + ", человеческий возраст " + reold();
    }
}