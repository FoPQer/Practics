package Prac2.Number1;

import java.util.Scanner;

public class Shape
{
    String name;
    int stor;
    double volume;
    double square;
    Shape()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название фигуры");
        name = sc.nextLine();
        System.out.println("Введите количество сторон");
        stor = sc.nextInt();
        System.out.println("Введите площадь поверхности");
        square = sc.nextDouble();
        System.out.println("Введите объём");
        volume = sc.nextDouble();
    }
    void out()
    {
        System.out.println("Название: " + name + " количество сторон: " + stor + " площадь поверхности: " + square + " объём " + volume);
    }
}