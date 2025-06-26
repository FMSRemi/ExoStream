//Exo 4.16 : Récupérer l'âge moyen des personnes d'une liste

public class Ex4_16 {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Diana", 28),
                new Person("Eve", 40),
                new Person("Frank", 22),
                new Person("Grace", 31),
                new Person("Hank", 29)
        };

        System.out.println("Liste initiale : ");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        int totalAgeWithoutStream = 0;
        for (Person person : people) {
            totalAgeWithoutStream += person.getAge();
        }
        double averageAgeWithoutStream = (double) totalAgeWithoutStream / people.length;
        System.out.println("Âge moyen : " + averageAgeWithoutStream);

        System.out.println();
        // Avec stream
        System.out.println("AVEC STREAM");
        double averageAgeWithStream = java.util.Arrays.stream(people)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println("Âge moyen : " + averageAgeWithStream);
    }
}
