package Prac1.Number5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое хотите возвести в факториал");
        long fact = sc.nextInt();
        long osn = 1;
        for(long i = 2; i < fact+1; i++)
            osn *= i;
        System.out.println("Ответ: " + osn);
    }
}