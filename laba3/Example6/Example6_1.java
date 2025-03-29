package laba3.Example6;
import java.util.ArrayList;

public class Example6_1 {
    public static void main(String[] args) {
        int N = 10; // количество человек
        ArrayList<Integer> circle = new ArrayList<>();

        // Заполняем список номерами от 1 до N
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            // Удаляем каждого второго человека
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Последний оставшийся: " + circle.get(0));
    }
}
