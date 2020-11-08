package Prac7;

public class FurnitureShop
{
    Closet[] closets = new Closet[12];
    Chair[] chairs = new Chair[9];
    Table[] tables = new Table[11];
    public void setChairs() {
        for (int i = 0; i < chairs.length; i++) {
            chairs[i] = new Chair();
        }
    }
    public void setTables() {
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table();
        }
    }
    public void setClosets() {
        for (int i = 0; i < closets.length; i++) {
            closets[i] = new Closet();
        }
    }
    FurnitureShop()
    {
        setChairs();
        setClosets();
        setTables();
    }
}