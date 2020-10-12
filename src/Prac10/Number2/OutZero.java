package Prac10.Number2;

import java.util.Scanner;

public class OutZero
{
    public static void main(String[] args) {
        int a, b, zero[], ia = 0, ib = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        zero = new int[a+b];
        for(ia = 0; ia < a; ia++) {
            zero[ia] = 1;
        }
        for(ib = a; ib < a + b; ib++)
        {
            zero[ib] = 0;
        }

    }
}