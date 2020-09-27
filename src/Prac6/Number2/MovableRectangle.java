package Prac6.Number2;

import java.util.Scanner;

public class MovableRectangle implements Movable
{
    private float x, y, sup;
    String turn;
    MovableRectangle()
    {
        System.out.println("Введите координаты центра прямоугольника");
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        setX(sc.nextFloat());
        System.out.print("y: ");
        setY(sc.nextFloat());
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setSup(float sup) {
        this.sup = sup;
    }
    public float getSup() {
        return sup;
    }
    public void setTurn(String turn) {
        this.turn = turn;
    }
    public String getTurn() {
        return turn;
    }
    private boolean process()
    {
        switch (getTurn())
        {
            case "1", "Влево", "Запад", "влево", "запад", "left", "Left", "West", "west":
                setX(getX()-getSup());
                System.out.println("Движение выполнено! Координаты: х " + getX() + " y " + getY());
                return true;
            case "2", "Вниз", "Юг", "вниз", "юг", "down", "Down", "South", "south":
                setY(getY()-getSup());
                System.out.println("Движение выполнено! Координаты: х " + getX() + " y " + getY());
                return true;
            case "3", "Вправо", "Восток", "вправо", "восток", "right", "Right", "East", "east":
                setX(getX()+getSup());
                System.out.println("Движение выполнено! Координаты: х " + getX() + " y " + getY());
                return true;
            case "4", "Вверх", "Север", "вврех", "север", "up", "Up", "North", "north":
                setY(getY()+getSup());
                System.out.println("Движение выполнено! Координаты: х " + getX() + " y " + getY());
                return true;
            default:
                System.out.println("Что-то не то, попробуй еще раз");
                return false;
        }
    }
    @Override
    public void move() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите на сколько хотите подвинуть");
        setSup(sc.nextFloat());
        System.out.println("Введите значение куда хотите подвнуть(4 направления)");
        setTurn(sc.nextLine());
        setTurn(sc.nextLine());
        while(!process())
            setTurn(sc.nextLine());
    }
}