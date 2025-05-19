package topic2_Streams.task6_UniqueValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> intList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1));

        List<Integer> listWithoutRepeat = intList.stream().distinct().toList();

        System.out.println(listWithoutRepeat);

    }
}
