package Prac8.Number1;

import java.awt.*;

public abstract class Shape
{
    Color clr;
    int[] position = new int[2];
    public abstract void setClr(Color clr);
    public abstract void setPosition(int[] position);
    public abstract Color getClr();
    public abstract int[] getPosition();
}