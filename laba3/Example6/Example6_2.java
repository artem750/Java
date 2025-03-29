package laba3.Example6;

import java.util.LinkedList;

public class Example6_2 {
    public static void main(String[] args) {
        int N = 10; // количество человек
        LinkedList<Integer> circle = new LinkedList<>();

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

//Для небольших значений N: Разница в производительности может быть незначительной, так как операции удаления и доступа происходят быстро в обоих случаях.
//Для больших значений N: LinkedList может работать быстрее, так как удаление элементов из него не требует сдвига оставшихся элементов. Однако, если часто происходит доступ по индексу, ArrayList может быть предпочтительнее.
//Таким образом, в данной задаче, где часто происходит удаление элементов, LinkedList может быть более эффективным выбором, особенно для больших значений N.