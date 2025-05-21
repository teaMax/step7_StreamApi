package topic2_Streams.task8_AverageValue;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> intList =
                Arrays.asList(10, 20, 30, 40, 50);

        OptionalDouble average =
                intList.stream().mapToInt(x -> x).average();

        if(average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }
}
