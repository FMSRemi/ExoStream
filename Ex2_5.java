
//Exo 2.5 : Supprimer les doublons dans une liste
import java.util.Arrays;
import java.util.HashSet;

public class Ex2_5 {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 10, 8 };
        int[] doublonnumbers = { 1, 2, 3, 10, 8 };

        System.out.println();
        System.out.println("Liste initiale : " + Arrays.toString(numbers));
        System.out.println("Les doublons étants donc : " + Arrays.toString(doublonnumbers));
        System.out.println();

        // Sans stream
        System.out.println("SANS STREAM");
        HashSet<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        System.out.println("Nombres uniques : " + uniqueNumbers);

        System.out.println();

        // Avec stream
        System.out.println("AVEC STREAM");
        Integer[] uniqueStreamNumbers = Arrays.stream(numbers).distinct().toArray(Integer[]::new);
        System.out.println("Nombres uniques : " + Arrays.toString(uniqueStreamNumbers));
    }
}