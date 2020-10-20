package Prac10.Number2;

import java.util.Scanner;

public class OutZero
{
    public static int main(String[] args) {
        int a, b, zero[], ia, ib;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (b < 2) {
            System.out.println("Нет таких комбинаций");
            return 0;
        }
        zero = new int[a+b];
        if ((b - a) >= 2)
            System.out.println("Нет таких комбинаций");
        else {
            for (ia = 0; ia < a; ia++) {
                zero[ia] = 1;
            }
            for (ib = a; ib < a + b; ib++) {
                zero[ib] = 0;
            }

        }
        return a;
    }
}