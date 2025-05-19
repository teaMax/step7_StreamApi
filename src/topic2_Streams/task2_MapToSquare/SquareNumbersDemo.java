package topic2_Streams.task2_MapToSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> intList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> squaredList = intList.stream()
                .map(x -> x * x)
                .toList();

        System.out.println(squaredList);
    }
}
