package Prac19.Number3;

import java.io.*;
import java.util.Scanner;

public class FileChange {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Practics\\src\\Prac19\\Number3\\test.txt");
        FileWriter writer = new FileWriter(file, false);
        Scanner sc = new Scanner(System.in);
        writer.write(sc.nextLine());
        writer.close();
    }
}
