package topic2_Streams.task5_MinString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> strList =
                new ArrayList<>(Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion"));

        String minimalString = strList.stream().min((s1, s2) -> s1.length()-s2.length()).get();
        System.out.println(minimalString);
    }
}
