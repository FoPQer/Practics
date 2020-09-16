package Prac3.Number1;

import java.util.Scanner;

public class Circle
{
    double rad;
    double lng;
    Scanner sc = new Scanner(System.in);
    Circle()
    {
        System.out.println("Введите радиус окружности");
        rad = sc.nextDouble();
        System.out.println("Введите длину окружности");
        lng = sc.nextDouble();
    }
    void setRad()
    {
        rad = sc.nextDouble();
    }
    void setLng()
    {
        lng = sc.nextDouble();
    }
    public double getRad()
    {
        return rad;
    }
    public double getLng()
    {
        return lng;
    }
}