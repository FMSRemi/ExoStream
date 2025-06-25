//Exo 1.1 : Filtrer les nombres pairs d’une liste

import java.util.Arrays;

public class Ex1_1 {
    public static void main(String[] args) {
        System.out.println();
        // Sans stream
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("SANS STREAM");
        System.out.println("Nombres pairs :");
        Arrays.stream(numbers).filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println();
        // Avec une boucle for
        System.out.println("AVEC BOUCLE FOR");
        System.out.println("Nombres pairs :");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}