package Prac2.Number1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean more = true;
        int sup, i = 0;
        Shape[] shapes = new Shape[10];
        while (more)
        {
            Shape shape = new Shape();
            shapes[i] = shape;
            i++;
            System.out.println("Еще фигуру?(1 да, 0 нет)");
            sup = sc.nextInt();
            switch (sup) {
                case 0 -> more = false;
                case 1 -> more = true;
                default -> {
                    System.out.println("Введено не верное значение, будем считать, что мы закончили");
                    more = false;
                }
            }
        }
        for (int j = 0; j < i; j++)
        {
            shapes[j].out();
        }
    }
}