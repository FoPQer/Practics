package Prac1.Number4;
import java.util.Random;
public class Main
{
    static double[] mas = new double[10];
    public static void main(String[] args)
    {
        //Выбери один из способов рандома путем закомменчивания не нужного способа
        //rand1();           //Это Random
        rand2();           //Это Math.random()
        System.out.println("Вывод массива");
        out();
        sort();
        System.out.println("Вывод сортированного массива");
        out();
    }
    static void out()
    {
        for (int i = 0; i < mas.length; i++)
            System.out.println(mas[i]);
    }
    static void sort()
    {
        for (int i = 0; i < mas.length; i++)
        {
            for(int j = 0; j < mas.length; j++)
            {
                if(mas[i] > mas[j])
                {
                    double buff;
                    buff = mas[i];
                    mas[i] = mas[j];
                    mas[j] = buff;
                }
            }
        }
    }
    static void rand1()
    {
        Random random = new Random();
        for(int i = 0; i < mas.length; i++)
            mas[i] = random.nextInt(20);
    }
    static void rand2()
    {
        for(int i = 0; i < mas.length; i++)
            mas[i] = Math.random()*20;
    }
}