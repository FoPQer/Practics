package Prac15;

import java.util.Scanner;

public class Ints
{
    int[] mas = new int[0];
    int[] supMas = new int[0];

    void add(int sup)
    {
        supMas = new int[mas.length + 1];
        System.arraycopy(mas, 0, supMas, 0, mas.length);
        mas = new int[supMas.length];
        System.arraycopy(supMas, 0, mas, 0, mas.length);
        mas[mas.length - 1] = sup;
        System.out.println("Успешно добавлено");
        for (int ma : mas) {
            System.out.println(ma);
        }
    }

    void del(int sup)
    {
        int supI = findInt(sup, 0), t;
        mas[supI] = 0;
        for (int i = supI + 1; i < mas.length; i++) {
            t = mas[i];
            mas[i] = mas[i - 1];
            mas[i - 1] = t;
        }
        supMas = new int[mas.length - 1];
        System.arraycopy(mas, 0, supMas, 0, supMas.length);
        mas = new int[supMas.length];
        System.arraycopy(supMas, 0, mas, 0, mas.length);
        System.out.println("Успешно удалено");
        for (int ma : mas) {
            System.out.println(ma);
        }
    }

    int findInt(int sup, int i)
    {
        if(mas[i] == sup)
            return i;
        else
            return findInt(sup, i+1);
    }

    int findIntI(int i, int j)
    {
        if(mas[i] == mas[j])
            return mas[i];
        else
            return findIntI(i, j+1);
    }

    int findMax()
    {
        int sup = mas[0];
        for(int i = 1; i < mas.length; i++)
        {
            if(sup < mas[i])
                sup = mas[i];
        }
        return sup;
    }

    int findMin()
    {
        int sup = mas[0];
        for(int i = 1; i < mas.length; i++)
        {
            if(sup > mas[i])
                sup = mas[i];
        }
        return sup;
    }

    double halfSum()
    {
        int sum = 0;
        for (int ma : mas) sum += ma;
        return (double)sum/mas.length;
    }

    public static void main(String[] args) {
        int sup;
        Ints list = new Ints();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер дейсвия:\n1. Добавить\n2. Удалить\n3. Найти по значению\n4. Найти по индексу\n5. Найти максимальный\n6. Найти минимальный\n7. Найти среднее арифметическое\n8. Выход");
            sup = sc.nextInt();
            switch (sup) {
                case 1 -> {
                    System.out.println("Введите значение элемента");
                    list.add(sc.nextInt());
                }
                case 2 -> {
                    System.out.println("Введите значение элемента");
                    list.del(sc.nextInt());
                }
                case 3 -> {
                    System.out.println("Введите значение элемента");
                    System.out.println("Индекс элемента: " + list.findInt(sc.nextInt(), 0));
                }
                case 4 -> {
                    System.out.println("Введите индекс");
                    System.out.println("Значение элемента: " + list.findIntI(sc.nextInt(), 0));
                }
                case 5 -> System.out.println("Максмальный: " + list.findMax());
                case 6 -> System.out.println("Минимальный: " + list.findMin());
                case 7 -> System.out.println("Среднее арифметическое: " + list.halfSum());
                case 8 -> {
                    System.out.println("Пока");
                    return;
                }
                default -> System.out.println("Нет такой операции");
            }
        }
    }
}