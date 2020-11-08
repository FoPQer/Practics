package Prac7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Person
{
    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();
        Furniture[] furnitures = new Furniture[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < furnitures.length; i++) {
            Random rand = new Random();
            int sup = rand.nextInt(3);
            switch (sup) {
                case 0 -> {
                    furnitures[i] = furnitureShop.chairs[rand.nextInt(9)];
                    System.out.println((i + 1) + ": Стул " + furnitures[i].name + ' ' + furnitures[i].color + ' ' + furnitures[i].cost);
                }
                case 1 -> {
                    furnitures[i] = furnitureShop.tables[rand.nextInt(11)];
                    System.out.println((i + 1) + ": Стол " + furnitures[i].name + ' ' + furnitures[i].color + ' ' + furnitures[i].cost);
                }
                case 2 -> {
                    furnitures[i] = furnitureShop.closets[rand.nextInt(12)];
                    System.out.println((i + 1) + ": Шкаф " + furnitures[i].name + ' ' + furnitures[i].color + ' ' + furnitures[i].cost);
                }
                default -> System.out.println("Не верное значение");
            }
        }
        Double[] chek = new Double[15];
        Arrays.fill(chek, 0.0);
        int sum = 0, sup2 = 0;
        while (true) {
            System.out.println("Выберите товар или введите 0, что бы перейти в корзину");
            int sup = sc.nextInt();
            switch (sup) {
                case 0 -> {
                    for (Double aDouble : chek) sum += aDouble;
                    System.out.println("Итог: " + sum + ". Спасибо за покупку! Деньги будут списаны с вашего счёта в течении минуты. Хорошего дня!");
                    return;
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    chek[sup2] = furnitures[sup - 1].cost;
                    sup2++;
                    System.out.println("Спасибо что выбрали " + furnitures[sup - 1].name + ", товар уже добавлен в корзину");
                }
                default -> System.out.println("Нет такого товара, давайте ещё раз");
            }
        }
    }
}