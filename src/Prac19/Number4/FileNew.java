package Prac19.Number4;

import java.io.*;
import java.util.Scanner;

public class FileNew {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Practics\\src\\Prac19\\Number4\\test.txt");
        FileWriter writer = new FileWriter(file, true);
        Scanner sc = new Scanner(System.in);
        writer.write(sc.nextLine());
        writer.close();
    }
}
