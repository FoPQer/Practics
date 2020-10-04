package Prac7.Number1;

import java.util.Scanner;

public class Table extends Furniture
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
        names[0] = "Маррен";
        names[1] = "Линнмон";
        names[2] = "Лакк";
        names[3] = "Микке";
        names[4] = "Ингу";
        names[5] = "Клингсбу";
        names[6] = "Мельторп";
        names[7] = "Каллакс";
        names[8] = "Бьюрста";
        names[9] = "Витшё";
    }
    Table(){
        Scanner sc = new Scanner(System.in);
        setNames();
        setColors();
        setName(names[(int)Math.random()]);
        setColor(colors[(int)Math.random()]);
        setCost(Math.random()*2000);
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