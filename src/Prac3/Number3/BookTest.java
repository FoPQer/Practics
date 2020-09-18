package Prac3.Number3;

import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        boolean sup = true;
        System.out.println("Вы описали книгу с названием " + book.getName() + ", её автор " + book.getAuthor() + ", год написания " + book.getYear() + "\n");
        while (true)
        {
            System.out.println("Хотите в ней что то поменять?\n" +
                    "1.Да\n" +
                    "2.Нет");
            int chek = sc.nextInt();
            switch (chek) {
                case 1:
                    while (sup) {
                        System.out.println("Что именно\n" +
                                "1.Автора\n" +
                                "2.Название\n" +
                                "3.Год написания\n" +
                                "4.Все поменял, можно идти дальше");
                        int chek2 = sc.nextInt();
                        switch (chek2) {
                            case 1:
                                System.out.println("Введите нового автора");
                                book.setAuthor();
                                break;
                            case 2:
                                System.out.println("Введите новое название");
                                book.setName();
                                break;
                            case 3:
                                System.out.println("Введите новый год написания");
                                book.setYear();
                                break;
                            case 4:
                                System.out.println("Вы описали книгу с названием " + book.getName() + ", её автор " + book.getAuthor() + ", год написания " + book.getYear());
                                sup = false;
                                break;
                            default:
                                System.out.println("Не верные данные, повторите попытку");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Спасибо, ваша книга добавлена в список не нужных книг");
                    return;
                default:
                    System.out.println("Я не знаю такую команду, введите еще раз");
                    break;
            }
        }
    }
}