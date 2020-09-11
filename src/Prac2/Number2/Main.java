package Prac2.Number2;

public class Main
{
    public static void main(String[] args)
    {
        Test pitomnik = new Test();
        Dog[] dogs = new Dog[4];
        for (int i = 0; i < dogs.length; i++)
        {
            dogs[i] = pitomnik.addDogs();
            System.out.println(dogs[i].toString());
        }
    }
}