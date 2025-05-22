
package laba7;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}

public class Example8 {

    public static void main(String[] args) {
        // Создание объекта
        Person person = new Person("Ivan Ivanov", 30, "ivan.ivanov@example.com");

        // Сериализация объекта в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/laba7/Example1/person.dat"))) {
            oos.writeObject(person);
            System.out.println("Объект сериализован в файл: person.dat");
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации объекта: " + e.getMessage());
        }

        // Десериализация объекта из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/laba7/Example1/person.dat"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Объект десериализован из файла: person.dat");
            System.out.println("Восстановленный объект: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации объекта: " + e.getMessage());
        }
    }
}
