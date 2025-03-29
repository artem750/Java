package laba3;

import java.util.HashMap;

public class Example5 {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Hello");
        map.put(1, "World");
        map.put(2, "Java");
        map.put(3, "Is");
        map.put(4, "Awesome");
        map.put(5, "Learn");
        map.put(6, "It");
        map.put(7, "With");
        map.put(8, "Fun");
        map.put(9, "Code");

        // Найти строки с ключом > 5
        System.out.println("Строки с ключом > 5:");
        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println("Ключ: " + key + ", Значение: " + map.get(key));
            }
        }

        // Вывести строки, где ключ = 0
        if (map.containsKey(0)) {
            System.out.println("Строки с ключом 0: " + map.get(0));
        }

        // Перемножить все ключи, где длина строки > 5
        int product = 1;
        boolean found = false;
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }
        if (found) {
            System.out.println("Произведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("Нет строк с длиной > 5.");
        }
    }
}
