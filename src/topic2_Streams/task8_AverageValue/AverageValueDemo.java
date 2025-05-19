package topic2_Streams.task8_AverageValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> intList =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        double average =
                intList.stream().mapToInt(x -> x).average().getAsDouble();

        System.out.println(average);
    }
}
