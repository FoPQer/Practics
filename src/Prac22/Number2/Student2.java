package Prac22.Number2;

import java.util.Scanner;

public class Student2
{
    Scanner sc = new Scanner(System.in);
    int IDNumber = 0;
    Student2[] mas = new Student2[5];
    Student2 sup = new Student2();

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setMas(int i) {
        mas[i] = new Student2(sc.nextInt());
    }

    Student2(int sup2)
    {
        System.out.println("Введите IDNumber");
        setIDNumber(sup2);
    }

    Student2()
    {

    }

    void sort()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if(mas[i].IDNumber > mas[j].IDNumber) {
                    sup = mas[i];
                    mas[i] = mas[j];
                    mas[j] = sup;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(mas[i].IDNumber);
        }
    }

    public static void main(String[] args) {
        Student2 sup3 = new Student2();
        for(int i = 0; i < 5; i++)
        {
            sup3.setMas(i);
        }
        sup3.sort();
    }
}