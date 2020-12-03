package Prac18.Number2;

import java.util.Scanner;

public class Tenet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Tenet ten = new Tenet(line);
    }
    void chekTen(String line, int i) {
        line = clearLine(line);
        if (line.charAt(i) == line.charAt(line.length() - (i+1)))
            if (line.length() / 2 >= i)
                chekTen(line, i+=1);
            else
                System.out.println("YES");
        else
            System.out.println("NO");
    }

    Tenet(String line) {
        chekTen(line, 0);
    }

    String clearLine(String line) {
        String[] lineMas = line.split(" ");
        line = "";
        line = String.join("", lineMas);
        return line;
    }
}
