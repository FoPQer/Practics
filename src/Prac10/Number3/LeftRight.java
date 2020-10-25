package Prac10.Number3;

import java.util.Scanner;

public class LeftRight
{
    Scanner sc = new Scanner(System.in);
    int number;
    LeftRight()
    {
        System.out.println("Введите число");
        number = sc.nextInt();
        process(number);
    }
    void process(int num)
    {
        if(num != 0)
        {
            process(num/10);
            System.out.println(num%10);
        }
    }

    public static void main(String[] args) {
        LeftRight left = new LeftRight();
    }
}