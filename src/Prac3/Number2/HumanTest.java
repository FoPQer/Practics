package Prac3.Number2;

import java.util.Scanner;

public class HumanTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Human myCharacter = new Human();
        Body myBody = new Body();
        Head myHead = new Head();
        Leg myLeg = new Leg();
        Hand myHand = new Hand();
        while (true) {
            System.out.println("Давайте решим что делать с персонажем:\n" +
                    "1.Изменим его параметры\n" +
                    "2.Изменим положение персонажа\n" +
                    "3.Поработаем с головой\n" +
                    "4.Заставим персонажа пробежаться\n" +
                    "5.Накачаем персонажа\n" +
                    "6.Отрастим ему конечности\n" +
                    "7.Посмотрим его параметры\n" +
                    "8.Закончим работу");
            int chek = sc.nextInt();
            switch (chek) {
                case 1:
                    System.out.println("Что конкретно хотите изменить?\n" +
                            "1.Имя\n" +
                            "2.Возраст\n" +
                            "3.Массу\n" +
                            "4.Рост");
                    int chek2 = sc.nextInt();
                    switch (chek2) {
                        case 1:
                            System.out.println("Введите новое имя персонажа");
                            myCharacter.setName();
                            System.out.println("Теперь персонажа зовут " + myCharacter.name);
                            break;
                        case 2:
                            System.out.println("Введите новый возраст персонажа");
                            myCharacter.setOld();
                            if (myCharacter.old % 10 == 1)
                                System.out.println("Теперь персонажу " + myCharacter.old + " годик");
                            if ((myCharacter.old % 10 >= 2) & (myCharacter.old % 10 <= 4))
                                System.out.println("Теперь персонажу " + myCharacter.old + " годика");
                            if (myCharacter.old % 10 >= 5 || myCharacter.old % 10 == 0)
                                System.out.println("Теперь персонажу " + myCharacter.old + " годиков");
                            break;
                        case 3:
                            System.out.println("Введите новую массу тела персонажа");
                            myBody.setMas();
                            System.out.println("Теперь масса персонажа " + myBody.mas + " кг");
                            break;
                        case 4:
                            System.out.println("Введите новый рост персонажа");
                            myBody.setLng();
                            System.out.println("Теперь рост персонажа " + " см");
                            break;
                        default:
                            System.out.println("Данные не верны, значит оставим как есть");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Что сделает ваш персонаж?\n" +
                            "1.Сядет\n" +
                            "2.Встанет\n" +
                            "3.Ляжет");
                    int chek3 = sc.nextInt();
                    switch (chek3) {
                        case 1:
                            myBody.sit();
                            break;
                        case 2:
                            myBody.stay();
                            break;
                        case 3:
                            myBody.lay();
                            break;
                        default:
                            System.out.println("Персонаж такого не умеет, он отказывается что либо делать");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Что мы сделаем с головой?\n" +
                            "1.Обучим её\n" +
                            "2.Заставим говорить");
                    int chek4 = sc.nextInt();
                    switch (chek4) {
                        case 1:
                            myHead.teach();
                            break;
                        case 2:
                            System.out.println("Что персонаж скажет?");
                            myHead.say();
                            break;
                        default:
                            System.out.println("Голова разболелась от такого количества информации");
                            break;
                    }
                    break;
                case 4:
                    myLeg.run();
                    break;
                case 5:
                    myHand.pumpUp();
                    break;
                case 6:
                    System.out.println("Что отращиваем?\n" +
                            "1.Руки\n" +
                            "2.Ноги");
                    int chek5 = sc.nextInt();
                    switch (chek5) {
                        case 1:
                            myHand.mutation();
                            break;
                        case 2:
                            myLeg.mutation();
                            break;
                        default:
                            System.out.println("Ухади, такое нельзя трогать");
                    }
                    break;
                case 7:
                    myCharacter.resume();
                    System.out.println("Я вешу " + myBody.mas + ", мой рост " + myBody.lng + ", мой iq " + myHead.iq + ", у меня " + myHand.quantity + " руки и " + myLeg.quantity + " ноги, я бегаю со скоростью " + myLeg.speed + " м/с, я накачан на " + myHand.pump + " процентов, это всё обо мне");
                    break;
                case 8:
                    System.out.println("Приятно было поработать с вами)");
                    return;
                default:
                    System.out.println("Закрою глаза на это и просто посчитаю что вы промахнулись по цифре 8, до свидания!");
                    return;
            }
        }
    }
}