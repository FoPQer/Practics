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
            if(second.equals(""))
                System.out.println("first " + turnSum);
            if(first.equals(""))
                System.out.println("second " + turnSum);
            isWinner = true;
        } else {
            turnSum++;
            if (chekNull()) {
                if (first.charAt(0) < second.charAt(0)) {
                    first += first.charAt(0);
                    first += second.charAt(0);
                } else {
                    second += first.charAt(0);
                    second += second.charAt(0);
                }
            } else {
                if (first.charAt(0) > second.charAt(0)) {
                    first += first.charAt(0);
                    first += second.charAt(0);
                } else {
                    second += first.charAt(0);
                    second += second.charAt(0);
                }
            }
            first = push(first);
            second = push(second);
        }
    }

    String push(String line)
    {
        StringBuilder supLine = new StringBuilder();
        for (int i = 1; i < line.length(); i++)
            supLine.append(line.charAt(i));
        return supLine.toString();
    }

    boolean chekNull() {
        return (first.charAt(0) == '0') || (second.charAt(0) == '0');
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