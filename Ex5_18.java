// Exo 5.18 : Fusionner plusieurs listes de personnes et trier l’ensemble par date de naissance

public class Ex5_18 {
    public static void main(String[] args) {
        Person[] people1 = {
                new Person("Alice", 30, "1993-05-15"),
                new Person("Bob", 25, "1998-07-20"),
                new Person("Charlie", 35, "1988-02-10")
        };

        Person[] people2 = {
                new Person("Diana", 28, "1995-03-25"),
                new Person("Eve", 40, "1983-11-30"),
                new Person("Frank", 22, "2001-01-01")
        };

        System.out.println("Liste initiale : ");
        for (Person person : people1) {
            System.out.println(person);
        }
        for (Person person : people2) {
            System.out.println(person);
        }

        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        java.util.List<Person> mergedListWithoutStream = new java.util.ArrayList<>();
        java.util.Collections.addAll(mergedListWithoutStream, people1);
        java.util.Collections.addAll(mergedListWithoutStream, people2);

        mergedListWithoutStream.sort((p1, p2) -> p1.getBirthDate().compareTo(p2.getBirthDate()));

        System.out.println("Liste fusionnée et triée par date de naissance : ");
        for (Person person : mergedListWithoutStream) {
            System.out.println(person);
        }

        // Avec stream
        System.out.println();
        System.out.println("AVEC STREAM");
        java.util.List<Person> mergedListWithStream = java.util.stream.Stream.concat(
                java.util.Arrays.stream(people1),
                java.util.Arrays.stream(people2))
                .sorted((p1, p2) -> p1.getBirthDate().compareTo(p2.getBirthDate()))
                .toList();

        System.out.println("Liste fusionnée et triée par date de naissance : ");
        for (Person person : mergedListWithStream) {
            System.out.println(person);
        }
    }
}