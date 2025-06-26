//Exo 4.15 : Créer un Map<String, Integer> qui donne le nombre de personnes par ville

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4_15 {
    public static void main(String[] args) {

        // Classe Person pour représenter une personne avec un nom et une ville
        class Person {
            private String name;
            private String city;

            public Person(String name, String city) {
                this.name = name;
                this.city = city;
            }

            public String getCity() {
                return city;
            }

            @Override
            public String toString() {
                return "Person{name='" + name + "', city='" + city + "'}";
            }
        }

        List<Person> people = List.of(
                new Person("Alice", "New York"),
                new Person("Bob", "Los Angeles"),
                new Person("Charlie", "New York"),
                new Person("David", "Chicago"),
                new Person("Eve", "New York"),
                new Person("Marie", "New York"),
                new Person("Morganne", "Los Angeles"),
                new Person("Nioky", "Los Angeles"),
                new Person("Eve", "Los Angeles"));

        System.out.println("Liste initiale : ");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        Map<String, Integer> countByCityWithoutStream = new HashMap<>();
        for (Person person : people) {
            countByCityWithoutStream.merge(person.getCity(), 1, Integer::sum);
        }
        System.out.println(countByCityWithoutStream);

        // Avec stream
        System.out.println();
        System.out.println("AVEC STREAM");
        Map<String, Integer> countByCityWithStream = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.summingInt(p -> 1)));
        System.out.println(countByCityWithStream);
    }
}
