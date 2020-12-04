package Prac19.Number1_and_2;

import java.io.*;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Practics\\src\\Prac19\\Number1_and_2\\test.txt");
        FileWriter writer = new FileWriter(file, false);
        Scanner sc = new Scanner(System.in);
        writer.write(sc.nextLine());
        writer.close();
        FileReader reader = new FileReader(file);
        char c = (char) reader.read();
        while (c != (char)-1){
            System.out.print(c);
            c = (char) reader.read();
        }
        reader.close();
    }
}
