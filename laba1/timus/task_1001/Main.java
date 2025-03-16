package laba1.timus.task_1001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BigDecimal> numbers = new ArrayList<>();

        while (scanner.hasNextBigDecimal()) {
            numbers.add(scanner.nextBigDecimal());
        }
        scanner.close();

        Collections.reverse(numbers);

        for (BigDecimal number : numbers) {
            BigDecimal sqrt = BigDecimal.valueOf(Math.sqrt(number.doubleValue()))
                    .setScale(4, RoundingMode.HALF_UP);
            System.out.println(sqrt);
        }
    }
}
