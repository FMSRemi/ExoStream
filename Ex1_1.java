//Exo 1.1 : Filtrer les nombres pairs d’une liste

import java.util.Arrays;

public class Ex1_1 {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println();
        // Sans stream
        System.out.println("SANS STREAM");
        System.out.println("Nombres pairs :");
        System.out.println(Arrays.toString(numbers).replaceAll("\\[(.*?)\\]", "").replaceAll("[13579, ]", ""));

        System.out.println();
        // Avec stream
        System.out.println("AVEC STREAM");
        System.out.println("Nombres pairs :");
        Arrays.stream(numbers).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}