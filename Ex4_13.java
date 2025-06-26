//Exo 4.13 : Grouper les personnes par ville (Map<String, List<Person>>)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4_13 {

    public static void main(String[] args) {

        // Classe Person pour représenter une personne avec un nom et une ville
        class Person {
            private String name;
            private String city;

            public Person(String name, String city) {
                this.name = name;
                this.city = city;
            }

            public String getName() {
                return name;
            }

            public String getCity() {
                return city;
            }

            @Override
            public String toString() {
                return "Person{name='" + name + "', city='" + city + "'}";
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Alice", "New York"),
                new Person("Bob", "Los Angeles"),
                new Person("Charlie", "New York"),
                new Person("David", "Chicago"),
                new Person("Eve", "Los Angeles"));

        // Sans stream
        System.out.println("SANS STREAM");
        Map<String, List<Person>> groupedByCityWithoutStream = new HashMap<>();
        for (Person person : people) {
            groupedByCityWithoutStream
                    .computeIfAbsent(person.getCity(), k -> new ArrayList<>())
                    .add(person);
        }
        System.out.println(groupedByCityWithoutStream);

        // Avec stream
        System.out.println("AVEC STREAM");
        Map<String, List<Person>> groupedByCityWithStream = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println(groupedByCityWithStream);
    }
}
