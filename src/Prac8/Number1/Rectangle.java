package Prac8.Number1;

import java.awt.*;

public class Rectangle extends Shape
{

    @Override
    public void setClr(Color clr) {
        this.clr = clr;
    }
    @Override
    public void setPosition(int[] position) {
        this.position = position;
    }
    @Override
    public Color getClr() {
        return clr;
    }
    @Override
    public int[] getPosition() {
        return position;
    }
}
