package Prac7.Number1;

import java.util.Random;
import java.util.Scanner;

public class Chair extends Furniture
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
        names[0] = "Терье";
        names[1] = "Лобергет";
        names[2] = "Адде";
        names[3] = "Стефан";
        names[4] = "Мариус";
        names[5] = "Фанбюн";
        names[6] = "Сколберг";
        names[7] = "Гунде";
        names[8] = "Лейф-арне";
        names[9] = "Ингольф";
    }
    Chair(){
        Random rand = new Random();
        setNames();
        setColors();
        setName(names[rand.nextInt(10)]);
        setColor(colors[rand.nextInt(4)]);
        setCost(rand.nextDouble()*1500);
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