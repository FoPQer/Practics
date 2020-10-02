package Prac7.Number1;

import java.util.Random;
import java.util.Scanner;

public class Closet extends Furniture
{
    String[] colors = new String[4];
    String[] names = new String[10];
    void setColors()
    {
        colors[0] = "White";
        colors[1] = "Black";
        colors[2] = "Yellow";
        colors[3] = "DarkWood";
    }
    void setNames()
    {
        names[0] = "Клеппсад";
        names[1] = "Бримнэс";
        names[2] = "Пакс";
        names[3] = "Опхус";
        names[4] = "Сонгесанд";
        names[5] = "Раккестад";
        names[6] = "Стува";
        names[7] = "Вуку";
        names[8] = "Сундвик";
        names[9] = "Хауга";
    }
    Closet(){
        Scanner sc = new Scanner(System.in);
        setName(names[(int)Math.random()]);
        setColor(colors[(int)Math.random()]);
        setCost(Math.random()*1000);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public double getCost() {
        return cost;
    }
}