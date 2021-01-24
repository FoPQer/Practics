package Prac22.Number1;

import java.util.Scanner;

public class User {
    private final int[] MAS_FOR_CHEK = {2, 4, 10, 3, 5, 9, 4, 6, 8};
    private String inn;
    private String firstname = "";
    private String lastname = "";
    private String fathername = "";

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFathername() {
        return this.fathername;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getInn() {
        return inn;
    }

    public String getLastname() {
        return this.lastname;
    }

    boolean chekINN() {
        int sum = 0, ost;
        if (chekSize()) {
            try {
                if (inn.length() == 12) {
                    for (int i = 0; i < 10; i++) {
                        if(i == 0)
                            sum += changeToInt(inn.charAt(i)) * 7;
                        else
                            sum += changeToInt(inn.charAt(i)) * MAS_FOR_CHEK[i-1];
                    }
                    ost = sum % 11;
                    if(ost == 10)
                        ost = 0;
                    if(ost != changeToInt(inn.charAt(10)))
                        return false;
                    sum = 0;
                    for (int i = 0; i < 11; i++) {
                        if (i == 0)
                            sum += changeToInt(inn.charAt(i)) * 3;
                        if (i == 1)
                            sum += changeToInt(inn.charAt(i)) * 7;
                        if(i != 1 && i != 0)
                            sum += changeToInt(inn.charAt(i)) * MAS_FOR_CHEK[i - 2];
                    }
                }
                else {
                    for (int i = 0; i < 9; i++)
                        sum += changeToInt(inn.charAt(i)) * MAS_FOR_CHEK[i];
                }
                ost = sum % 11;
                if(ost == 10)
                    ost = 0;
                return ost == changeToInt(inn.charAt(inn.length() - 1));
            } catch (SimbolException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getChr());
                return false;
            }
        } else
            return false;
    }

    boolean chekSize() {
        return inn.length() == 10 || inn.length() == 12;
    }

    int changeToInt(char a) throws SimbolException {
        return switch (a) {
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case '0' -> 0;
            default -> throw new SimbolException("Введена не цифра", a);
        };
    }

    User() throws INNException{
        Scanner sc = new Scanner(System.in);
        int sup = 0;
        System.out.println("Введите ФИО");
        String supStr = sc.nextLine();
        String supStr2;
        for (int i = 0; i < supStr.length(); i++) {
            if (supStr.charAt(i) != ' ') {
                switch (sup) {
                    case 0:
                        supStr2 = getLastname();
                        supStr2 += supStr.charAt(i);
                        setLastname(supStr2);
                        break;
                    case 1:
                        supStr2 = getFirstname();
                        supStr2 += supStr.charAt(i);
                        setFirstname(supStr2);
                        break;
                    case 2:
                        supStr2 = getFathername();
                        supStr2 += supStr.charAt(i);
                        setFathername(supStr2);
                        break;
                    default:
                        break;
                }
            } else
                sup++;
        }
        System.out.println("Введите ИНН");
        setInn(sc.nextLine());
        if(!chekINN()) throw new INNException("ИНН не прошёл проверку");
    }
}