//Exo 4.14 : Lister les noms de toutes les personnes majeures triées par nom

import java.util.ArrayList;
import java.util.List;

public class Ex4_14 {
    public static void main(String[] args) {

        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return "Person{name='" + name + "', age=" + age + '}';
            }
        }

        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 17),
                new Person("Charlie", 25),
                new Person("David", 15),
                new Person("Eve", 22));

        System.out.println();
        System.out.println("Liste initiale : ");
        for (Person person : people) {
            System.out.println(person);
        }
        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        List<String> adultNamesWithoutStream = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= 18) {
                adultNamesWithoutStream.add(person.getName());
            }
        }
        adultNamesWithoutStream.sort(String::compareTo);
        System.out.println(adultNamesWithoutStream);

        // Avec stream
        System.out.println();
        System.out.println("AVEC STREAM");
        List<String> adultNamesWithStream = people.stream()
                .filter(person -> person.getAge() >= 18)
                .map(Person::getName)
                .sorted()
                .toList();
        System.out.println(adultNamesWithStream);
    }
}
