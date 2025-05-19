package topic2_Streams.task10_PersonSort;

import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person[]{
                new Person("Vasya", 10),
                new Person("Kolya", 7),
                new Person("Grisha", 38),
                new Person("Valentin", 7),
                new Person("Ilya", 55),
                new Person("Oleg", 3),
        });

        List<Person> sortedPersonList =
                personList.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).toList();

        for(Person p : sortedPersonList) {
            System.out.println(p);
        }
    }
}
