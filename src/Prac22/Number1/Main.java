package Prac22.Number1;

public class Main {
    public static void main(String[] args) {
        try {
            User me = new User();
            System.out.println(me.getFirstname() + " " + me.getFathername() + ", спасибо за покупку!");
        } catch (INNException e) {
            System.out.println(e.getMessage());
        }

    }
}
