package topic2_Streams.task1_FilterPerson;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person[]{
                new Person("Vasya", 10),
                new Person("Kolya", 7),
                new Person("Grisha", 38),
                new Person("Ilya", 55),
                new Person("Oleg", 3),
        });

        List<Person> personAgedOverThrirty= personList.stream()
                .filter(person -> person.getAge() >= 30)
                .collect(Collectors.toList());

        System.out.println(personAgedOverThrirty);
    }
}
