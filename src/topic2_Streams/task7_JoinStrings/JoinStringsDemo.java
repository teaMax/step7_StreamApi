package topic2_Streams.task7_JoinStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> strList =
                new ArrayList<>(Arrays.asList("red", "green", "blue", "yellow"));

        String result = strList.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
