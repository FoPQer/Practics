package Prac3.Number3;

import java.util.Scanner;

public class Book
{
    int year;
    Scanner sc = new Scanner(System.in);
    String author;
    String name;
    Book()
    {
        System.out.println("Введите автора книги");
        setAuthor();
        System.out.println("Введите название книги");
        setName();
        System.out.println("Введите год написания книги");
        setYear();
    }
    public void setName()
    {
        name = sc.nextLine();
    }
    public void setAuthor()
    {
        author = sc.nextLine();
    }
    public void setYear()
    {
        year = sc.nextInt();
    }
    public int getYear()
    {
        return year;
    }
    String getAuthor()
    {
        return author;
    }
    String getName()
    {
        return name;
    }
}