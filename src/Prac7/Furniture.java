package Prac7;

public abstract class Furniture {
    String name;
    String color;
    double cost;
    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setColor(String color);
    public abstract String getColor();
    public abstract void setCost(double cost);
    public abstract double getCost();
}