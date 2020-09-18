package Prac3.Number2;

import java.util.Scanner;

public class Body
{
    Scanner sc = new Scanner(System.in);
    int mas;
    int lng;
    Body()
    {
        System.out.println("Введите массу тела персонажа");
        setMas();
        System.out.println("Введите рост персонажа");
        setLng();
    }
    public void setMas()
    {
        mas = sc.nextInt();
    }
    public void setLng()
    {
        lng = sc.nextInt();
    }
    public int getLng()
    {
        return lng;
    }
    public int getMas()
    {
        return mas;
    }
    void sit()
    {
        System.out.println("Персонаж сидит");
    }
    void stay()
    {
        System.out.println("Персонаж стоит");
    }
    void lay()
    {
        System.out.println("Персонаж лежит");
    }
}