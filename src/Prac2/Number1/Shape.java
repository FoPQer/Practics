package Prac2.Number1;

import java.util.Scanner;

public class Shape
{
    int stor;
    double volume;
    double square;
    Shape()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сторон");
        stor = sc.nextInt();
        System.out.println("Введите площадь поверхности");
        square = sc.nextDouble();
        System.out.println("Введите объем");
        volume = sc.nextDouble();
    }
}