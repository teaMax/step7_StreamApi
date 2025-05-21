package topic2_Streams.task5_MinString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> strList =
                Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");

        Optional<String> minimalString =
                strList.stream().min((s1, s2) -> s1.length()-s2.length());

        if(minimalString.isPresent()) {
            System.out.println(minimalString.get());
        }
    }
}
