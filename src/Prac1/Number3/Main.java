package Prac1.Number3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] mas = new int[7];
        int viv = 0;
        AddMemb memb = new AddMemb();
        System.out.println("Введите 7 чисел");
        for (int i = 0; i < mas.length; i++)
            mas[i] = memb.add();
        for (int i = 0; i < mas.length; i++)
            viv += mas[i];
        System.out.println(viv);
    }
}