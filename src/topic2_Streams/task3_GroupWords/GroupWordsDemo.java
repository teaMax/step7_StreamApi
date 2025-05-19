package topic2_Streams.task3_GroupWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {

    public static void main(String[] args) {
        List<String> strList =
                new ArrayList<>(Arrays.asList("apple", "ant", "banana", "berry", "cherry", "carrot"));

        Map<Character, List<String>> sortedByFirstChar = strList.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));

        System.out.println(sortedByFirstChar);
    }
}
