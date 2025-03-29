package laba3;

import java.util.*;

public class collection_comparison {

    public static void main(String[] args) {
        List<Long> arrayList = new ArrayList<>();
        Map<Long, Long> linkedHashMap = new LinkedHashMap<>();
        SortedSet<Long> treeSet = new TreeSet<>();

        // Инициализация коллекций
        long collectionSize = 16000000L;
        for (long i = 0; i < collectionSize; i++) {
            arrayList.add(i);
            linkedHashMap.put(i, i);
            treeSet.add(i);
        }

        // Добавление элемента в начало ArrayList
        System.out.println("Время добавления в начало arrayList = " + getAddTimeAtStart(arrayList) + " ms");

        // Добавление элемента в конец ArrayList
        System.out.println("Время добавления в конец arrayList = " + getAddTimeAtEnd(arrayList) + " ms");

        // Добавление элемента в середину ArrayList
        System.out.println("Время добавления в середину arrayList = " + getAddTimeAtMiddle(arrayList) + " ms");

        // Удаление элемента из начала ArrayList
        System.out.println("Время удаления из начала arrayList = " + getRemoveTimeAtStart(arrayList) + " ms");

        // Удаление элемента из конца ArrayList
        System.out.println("Время удаления из конца arrayList = " + getRemoveTimeAtEnd(arrayList) + " ms");

        // Удаление элемента из середины ArrayList
        System.out.println("Время удаления из середины arrayList = " + getRemoveTimeAtMiddle(arrayList) + " ms");

        // Получение элемента по индексу ArrayList
        System.out.println("Время получения по индексу arrayList = " + getGetTimeByIndex(arrayList) + " ms");

        // Добавление элемента в LinkedHashMap
        System.out.println("Время добавления в linkedHashMap = " + getAddTime(linkedHashMap) + " ms");

        // Удаление элемента из LinkedHashMap
        System.out.println("Время удаления из linkedHashMap = " + getRemoveTime(linkedHashMap) + " ms");

        // Добавление элемента в TreeSet
        System.out.println("Время добавления в treeSet = " + getAddTime(treeSet) + " ms");

        // Удаление элемента из TreeSet
        System.out.println("Время удаления из treeSet = " + getRemoveTime(treeSet) + " ms");
    }

    private static long getAddTimeAtStart(List<Long> list) {
        long start = System.currentTimeMillis();
        list.add(0, -1L);
        long end = System.currentTimeMillis();
        list.remove(0); // Удаляем добавленный элемент, чтобы вернуть коллекцию в исходное состояние
        return end - start;
    }

    private static long getAddTimeAtEnd(List<Long> list) {
        long start = System.currentTimeMillis();
        list.add(-1L);
        long end = System.currentTimeMillis();
        list.remove(list.size() - 1); // Удаляем добавленный элемент
        return end - start;
    }

    private static long getAddTimeAtMiddle(List<Long> list) {
        long start = System.currentTimeMillis();
        list.add(list.size() / 2, -1L);
        long end = System.currentTimeMillis();
        list.remove(list.size() / 2); // Удаляем добавленный элемент
        return end - start;
    }

    private static long getRemoveTimeAtStart(List<Long> list) {
        long start = System.currentTimeMillis();
        list.remove(0);
        long end = System.currentTimeMillis();
        list.add(0, 0L); // Возвращаем удаленный элемент
        return end - start;
    }

    private static long getRemoveTimeAtEnd(List<Long> list) {
        long start = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();
        list.add(list.size(), 0L); // Возвращаем удаленный элемент
        return end - start;
    }

    private static long getRemoveTimeAtMiddle(List<Long> list) {
        long start = System.currentTimeMillis();
        list.remove(list.size() / 2);
        long end = System.currentTimeMillis();
        list.add(list.size() / 2, 0L); // Возвращаем удаленный элемент
        return end - start;
    }

    private static long getGetTimeByIndex(List<Long> list) {
        long start = System.currentTimeMillis();
        long bigIndexLimit = 16000000000L;
        for (long i = 0; i < bigIndexLimit; i++) {
            list.get((int) (i % list.size()));
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getAddTime(Map<Long, Long> map) {
        long start = System.currentTimeMillis();
        map.put(-1L, -1L);
        long end = System.currentTimeMillis();
        map.remove(-1L); // Удаляем добавленный элемент
        return end - start;
    }

    private static long getRemoveTime(Map<Long, Long> map) {
        long start = System.currentTimeMillis();
        map.remove(0L);
        long end = System.currentTimeMillis();
        map.put(0L, 0L); // Возвращаем удаленный элемент
        return end - start;
    }

    private static long getAddTime(SortedSet<Long> set) {
        long start = System.currentTimeMillis();
        set.add(-1L);
        long end = System.currentTimeMillis();
        set.remove(-1L); // Удаляем добавленный элемент
        return end - start;
    }

    private static long getRemoveTime(SortedSet<Long> set) {
        long start = System.currentTimeMillis();
        set.remove(set.first());
        long end = System.currentTimeMillis();
        set.add(set.first()); // Возвращаем удаленный элемент
        return end - start;
    }
}




