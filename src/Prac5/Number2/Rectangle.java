package Prac5.Number2;

import java.util.Scanner;

public class Rectangle extends Shape
{
    private int[] stor = new int[2];
    public void setStor(int[] stor)
    {
        this.stor = stor;
        setArea();
    }
    public int[] getStor()
    {
        return stor;
    }
    Rectangle()
    {
        System.out.println("Введите стороны прямоугольника");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            stor[i] = sc.nextInt();
        }
        setArea();
    }
    @Override
    public void setArea()
    {
        area = stor[0]*stor[1];
    }
    @Override
    public void setQuantity()
    {
        quantity = 4;
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