package Prac5.Number2;

import java.util.Scanner;

public class Square extends Shape
{
    private int stor;
    public void setStor(int stor)
    {
        this.stor = stor;
        setArea();
    }
    public int getStor()
    {
        return stor;
    }
    Square()
    {
        System.out.println("Введите сторону квадрата");
        Scanner sc = new Scanner(System.in);
        stor = sc.nextInt();
        setArea();
    }
    @Override
    public void setArea()
    {
        area = stor*stor;
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