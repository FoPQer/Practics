package Prac16;

import java.util.Scanner;

public class GamePian {
    String first;
    String second;
    int turnSum = 0;
    boolean isWinner = false;
    Scanner sc = new Scanner(System.in);

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    void turn()
    {
        if(second.equals("") || first.equals("")) {
            if(second.equals("")) {
                System.out.println("first" + turnSum);
                isWinner = true;
            }
            if(first.equals("")) {
                System.out.println("second" + turnSum);
                isWinner = true;
            }
        } else {
            turnSum++;
            if ((first.charAt(0) > second.charAt(0)) || first.charAt(0) == '0') {
                first += first.charAt(0);
                first += second.charAt(0);
                System.out.println("turn " + turnSum + " " + first + ", " + second);
            }
            if ((first.charAt(0) < second.charAt(0)) || second.charAt(0) == '0') {
                second += first.charAt(0);
                second += second.charAt(0);
                System.out.println("turn " + turnSum + " " + first + ", " + second);
            }
        }
    }

    void push(String line)
    {
        int size = line.length();
        String supLine = "";
        for (int i = 1; i < size; i++)
            supLine += line.charAt(i);
    }

    GamePian()
    {
        System.out.println("Введите карты");
        setFirst(sc.nextLine());
        setSecond(sc.nextLine());
    }

    public static void main(String[] args) {
        GamePian game = new GamePian();
        while (!game.isWinner) {
            if (game.turnSum == 106) {
                System.out.println("botva " + game.turnSum);
                return;
            }
            game.turn();
        }
    }
}