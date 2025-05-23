package laba7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Example4 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/laba7/Example1/input.txt");
        FileWriter writer = new FileWriter("src/laba7/Example1/output.txt");

        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }

        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}
