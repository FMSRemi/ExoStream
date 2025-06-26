// Exo 1.2 : Compter le nombre d'éléments supérieurs à 10 dans une liste

import java.util.Arrays;
// import java.lang.reflect.Array;

public class Ex1_2 {
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 3, 18, 7, 20, 9, 15, 2, 11 };

        System.out.println();
        // Sans stream
        Arrays.sort(numbers);

        int index = Arrays.binarySearch(numbers, 10);
        if (index < 0) {
            index = -index - 1;
        }

        int count = numbers.length - index;

        System.out.println("SANS STREAM");
        System.out.println("Nombre de nombres supérieurs à 10 : " + count);
        System.out.println();

        // Avec stream
        System.out.println("AVEC STREAM");
        System.out.println("Nombre d'éléments supérieurs à 10 : " +
                Arrays.stream(numbers).filter(n -> n > 10).count());
    }
}
