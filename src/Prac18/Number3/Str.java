package Prac18.Number3;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maxNum = sc.nextInt();
        num = sc.nextInt();
        while (num != 0){
            if(maxNum < num)
                maxNum = num;
            num = sc.nextInt();
        }
        System.out.println(maxNum);
    }
}