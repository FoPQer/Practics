package Prac6.Number3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MovableRectangle rectangle = new MovableRectangle();
        while (true)
        {
            System.out.println("Хотите двигать прямоугольник?");
            String sup = sc.nextLine();
            switch (sup) {
                case "1", "Да", "Yes", "yes", "да", "true":
                    rectangle.move();
                    break;
                case "0", "No", "no", "Нет", "нет", "false":
                    System.out.println("Моя программа больше ничего не делает( До свидания!");
                    return;
                default:
                    System.out.println("Вы ввели что-то не то, введите ещё раз");
                    break;
            }
        }
    }
}
