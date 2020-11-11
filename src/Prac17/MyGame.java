package Prac17;

import java.awt.*;

public class MyGame {
    public int lng;
    public int[] position = new int[2];
    private Color clr = Color.blue;

    public void setLng(int lng) {
        this.lng = lng;
    }

    public void setClr(Color clr) {
        this.clr = clr;
    }

    public Color getClr() {
        return clr;
    }

    public int getLng() {
        return lng;
    }

    void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }

    int getPositionX() {
        return position[0];
    }

    int getPositionY() {
        return position[1];
    }

    MyGame(int x, int y) {
        setLng(1);
        setPosition(x,y);
    }
}
