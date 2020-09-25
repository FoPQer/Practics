package Prac5.Number2;

import java.util.Scanner;

public class Circle extends Shape
{
    private float rad;
    public void setRad(float rad)
    {
        this.rad = rad;
        setArea();
    }
    public float getRad()
    {
        return rad;
    }
    Circle()
    {
        System.out.println("Введите радиус окружности");
        Scanner sc = new Scanner(System.in);
        rad = sc.nextFloat();
        setArea();
    }
    @Override
    public void setArea()
    {
        area = Math.PI*(rad*rad);
    }
    @Override
    public void setQuantity()
    {
        quantity = 1;
    }
    @Override
    public double getArea()
    {
        return area;
    }
    @Override
    public int getQuantity()
    {
        return quantity;
    }
}