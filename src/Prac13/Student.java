package Prac13;

import java.util.Scanner;

public class Student
{
    Scanner sc = new Scanner(System.in);
    int IDNumber = 0;
    Student[] mas = new Student[5];
    Student sup = new Student();

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setMas(int i) {
        mas[i] = new Student(sc.nextInt());
    }

    Student(int sup2)
    {
        System.out.println("Введите IDNumber");
        setIDNumber(sup2);
    }

    Student()
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
        Student sup3 = new Student();
        for(int i = 0; i < 5; i++)
        {
            sup3.setMas(i);
        }
        sup3.sort();
    }
}