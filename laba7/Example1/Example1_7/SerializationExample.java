package laba7.Example1.Example1_7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationExample {

    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);

        try (FileOutputStream fileOut = new FileOutputStream("src/laba7/Example1/Example1_7/Person.json");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}