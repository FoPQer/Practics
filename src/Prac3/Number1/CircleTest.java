package Prac3.Number1;

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        boolean chek;
        int sup;
        Scanner sc = new Scanner(System.in);
        System.out.println("Хотите посмотреть или изменить значения?(1.Да, 2.Нет");
        sup = sc.nextInt();
        if (sup == 1)
            chek = true;
        else
            chek = false;
        int chek3;
        while (chek)
        {
            System.out.println("Введите что конкретно хотите сделать:\n" +
                    "1. Изменить\n" +
                    "2. Посмотреть");
            int chek2 = sc.nextInt();
            switch (chek2)
            {
                case 1:
                    System.out.println("Введите что хотите изменить:\n" +
                            "1. Длину\n" +
                            "2. Радиус");
                    chek3 = sc.nextInt();
                    switch (chek3)
                    {
                        case 1:
                            System.out.println("Вводите длину");
                            circle.setLng();
                            break;
                        case 2:
                            System.out.println("Вводите радиус");
                            circle.setRad();
                            break;
                        default:
                            System.out.println("Введено неверное значение, программа закрывается");
                            return;
                    }
                    break;
                case 2:
                    System.out.println("Введите что хотите получить:\n" +
                            "1. Длину\n" +
                            "2. Радиус");
                    chek3 = sc.nextInt();
                    switch (chek3)
                    {
                        case 1:
                            System.out.println("Длина равна: " + circle.getLng());
                            break;
                        case 2:
                            System.out.println("Радиус равен: " + circle.getRad());
                            break;
                        default:
                            System.out.println("Введено неверное значение, программа закрывается");
                            return;
                    }
                    break;
                default:
                    System.out.println("Введено неверное значение, программа закрывается");
                    return;
            }
            System.out.println("Хотите ещё посмотреть или изменить значения?");
            sup = sc.nextInt();
            if (sup == 1)
                chek = true;
            else
                chek = false;
        }
        System.out.println("Приятно было с вами поработать, до свидания!");
    }
}