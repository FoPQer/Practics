package Prac10.Number1;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {
        int k, s, sup = 0, sup2 = 0, helper;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите входные");
        k = sc.nextInt();
        System.out.println("еще");
        s = sc.nextInt();
        System.out.println("А тут хватит");
        for (double i = Math.pow(10.0, k-1); i < Math.pow(10.0, k); i++) {
            helper = (int)i;
            System.out.println(helper);
                while (helper != 0) {
                    sup += helper % 10;
                    helper /= 10;
                }
                if (sup == s) {
                    System.out.println("Подсчет ответа");
                    sup2++;
                }
                sup = 0;
        }
        System.out.println("Ответ: " + sup2);
    }
}