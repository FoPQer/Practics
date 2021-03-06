package Prac7;

import java.util.Random;

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
        Random rand = new Random();
        setNames();
        setColors();
        setName(names[rand.nextInt(10)]);
        setColor(colors[rand.nextInt(4)]);
        setCost(rand.nextDouble()*1000);
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