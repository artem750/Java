package laba4.Example1_14;

public class Example12 {

    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println("Перехватили ошибку: " + e.getMessage());
        }
        System.out.println("Программа продолжается");
    }
}

