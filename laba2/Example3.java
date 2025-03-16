package laba2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n):");
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {
            String decryptedText = encrypt(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char shifted = (char) ((character - base + key + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
