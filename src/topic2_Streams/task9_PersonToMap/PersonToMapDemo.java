package topic2_Streams.task9_PersonToMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person[]{
                new Person("Vasya", 10),
                new Person("Kolya", 7),
                new Person("Grisha", 38),
                new Person("Ilya", 55),
                new Person("Oleg", 3),
        });

        Map<String, Integer> map = personList.stream().collect(Collectors.toMap(x -> x.getName(), y-> y.getAge()));
        System.out.println(map);
    }
}
