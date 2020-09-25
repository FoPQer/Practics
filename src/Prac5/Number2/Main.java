package Prac5.Number2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int sup;
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        while(true)
        {
            System.out.println("Что вы хотите сделать?\n" +
                    "1. Работать с кругом\n" +
                    "2. Работать с прямоугольником\n" +
                    "3. Работать с квадратом\n" +
                    "4. Выйти");
            Scanner sc = new Scanner(System.in);
            sup = sc.nextInt();
            switch (sup)
            {
                case 1:
                    System.out.println("Вы хотите создать или изменить круг\n" +
                            "1. Создать(предыдущий удалиться)\n" +
                            "2. Изменить радиус\n" +
                            "3. Посмотреть площадь");
                    int sup2 = sc.nextInt();
                    switch (sup2)
                    {
                        case 1:
                            circle = new Circle();
                            break;
                        case 2:
                            System.out.println("Введите новый радиус");
                            circle.setRad(sc.nextFloat());
                            break;
                        case 3:
                            System.out.println("Площадь равна " + circle.getArea());
                            break;
                        default:
                            System.out.println("Такого значения нет, выхожу отсюда");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Вы хотите создать или изменить прямоугольник\n" +
                            "1. Создать(предыдущий удалиться)\n" +
                            "2. Изменить стороны\n" +
                            "3. Посмотреть площадь");
                    int sup3 = sc.nextInt();
                    switch (sup3)
                    {
                        case 1:
                            rectangle = new Rectangle();
                            break;
                        case 2:
                            System.out.println("Введите новые стороны");
                            int[] str = new int[2];
                            for (int i = 0; i < 2; i++)
                                str[i] = sc.nextInt();
                            rectangle.setStor(str);
                            break;
                        case 3:
                            System.out.println("Площадь равна " + rectangle.getArea());
                            break;
                        default:
                            System.out.println("Такого значения нет, выхожу отсюда");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Вы хотите создать или изменить квадрат\n" +
                            "1. Создать(предыдущий удалиться)\n" +
                            "2. Изменить стороны\n" +
                            "3. Посмотреть площадь");
                    int sup4 = sc.nextInt();
                    switch (sup4)
                    {
                        case 1:
                            square = new Square();
                            break;
                        case 2:
                            System.out.println("Введите новую сторону");
                            square.setStor(sc.nextInt());
                            break;
                        case 3:
                            System.out.println("Площадь равна " + square.getArea());
                            break;
                        default:
                            System.out.println("Такого значения нет, выхожу отсюда");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("До свидания!");
                    return;
            }
        }
    }
}