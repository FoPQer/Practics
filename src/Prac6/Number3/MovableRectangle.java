package Prac6.Number3;

import java.util.Scanner;

public class MovableRectangle implements Movable{
    int[] side = new int[2];
    private float x1, y1, x2, y2, sup;
    private String turn;
    Scanner sc = new Scanner(System.in);
    MovableRectangle()
    {
        System.out.println("Введите ширину и длину прямоугольника");
        for (int i = 0; i < 2; i++)
            side[i] = sc.nextInt();
        System.out.println("Введите координаты левого верхнего угла прямоугольника");
        System.out.print("x: ");
        setX1(sc.nextFloat());
        setX2(getX1()+side[0]);
        System.out.print("y: ");
        setY1(sc.nextFloat());
        setY2(getY1()+side[1]);
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }
    public void setY2(float y2) {
        this.y2 = y2;
    }
    public void setX1(float x1) {
        this.x1 = x1;
    }
    public void setY1(float y1) {
        this.y1 = y1;
    }
    public float getX1() {
        return x1;
    }
    public float getY1() {
        return y1;
    }
    public float getX2() {
        return x2;
    }
    public float getY2() {
        return y2;
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
                setX1(getX1()-getSup());
                setX2(getX1()+side[0]);
                System.out.println("Движение выполнено! Координаты левого угла: х " + getX1() + " y " + getY1() + ", координаты правого угла: х " + getX2() + " y " + getY2());
                return true;
            case "2", "Вниз", "Юг", "вниз", "юг", "down", "Down", "South", "south":
                setY1(getY1()-getSup());
                setY2(getY1()+side[1]);
                System.out.println("Движение выполнено! Координаты левого угла: х " + getX1() + " y " + getY1() + ", координаты правого угла: х " + getX2() + " y " + getY2());
                return true;
            case "3", "Вправо", "Восток", "вправо", "восток", "right", "Right", "East", "east":
                setX1(getX1()+getSup());
                setX2(getX1()+side[0]);
                System.out.println("Движение выполнено! Координаты левого угла: х " + getX1() + " y " + getY1() + ", координаты правого угла: х " + getX2() + " y " + getY2());
                return true;
            case "4", "Вверх", "Север", "вврех", "север", "up", "Up", "North", "north":
                setY1(getY1()+getSup());
                setY2(getY1()+side[1]);
                System.out.println("Движение выполнено! Координаты левого угла: х " + getX1() + " y " + getY1() + ", координаты правого угла: х " + getX2() + " y " + getY2());
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
