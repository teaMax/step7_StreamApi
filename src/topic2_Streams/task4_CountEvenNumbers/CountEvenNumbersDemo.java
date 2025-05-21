package topic2_Streams.task4_CountEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        System.out.println("Количество четных чисел в массиве: " +
                intList +
                "\nЧетных вхождений: " +
                intList.stream().filter(i -> i % 2 == 0).count());
    }
}
