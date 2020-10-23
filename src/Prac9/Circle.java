package Prac9;

import java.awt.*;
import java.util.Random;

public class Circle extends Shape
{
    Circle()
    {
        Random rand = new Random();
        Color clr = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        int[] pos = new int[2];
        pos[0] = rand.nextInt(1000);
        pos[1] = rand.nextInt(800);
        setPosition(pos);
        setClr(clr);
    }
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
