package laba4.Example1_14;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            return 2;           // Возвращаем число
        } finally {
            System.out.println("1"); // Выполняется всегда, даже если в try был return
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

