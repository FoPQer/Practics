package Prac18.Number1;

import java.util.Scanner;

public class SimpleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("2 ");
        } else {
            for (int i = 3; i < num / 2; i += 2) {
                if (chekSimple(i) && (num % i == 0)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    static boolean chekSimple(int num){
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}