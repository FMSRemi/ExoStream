//Exo 3.10 : Trier une liste d'objets (par exemple : liste de personne par âge)
public class Ex3_10 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Diana", 20)
        };
        System.out.println("Liste initiale : ");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        java.util.Arrays.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Liste triée par âge : ");
        for (Person person : people) {
            System.out.println(person);
        }

        // Avec stream
        System.out.println();
        System.out.println("AVEC STREAM");
        Person[] sortedPeople = java.util.Arrays.stream(people)
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .toArray(Person[]::new);
        System.out.println("Liste triée par âge : ");
        for (Person person : sortedPeople) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
