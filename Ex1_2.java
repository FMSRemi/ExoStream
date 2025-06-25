
// Exo 1.2 : Compter le nombre d'éléments supérieurs à 10 dans une liste
import java.util.Arrays;
// import java.lang.reflect.Array;

public class Ex1_2 {
    public static void main(String[] args) {
        System.out.println();
        // Sans stream
        System.out.println("SANS STREAM");
        int[] numbers = { 5, 12, 3, 18, 7, 20, 9, 15, 2, 11 };
        System.out.println("Nombre d'éléments supérieurs à 10 : " +
                Arrays.stream(numbers).filter(n -> n > 10).count());

        System.out.println();
        // Avec une boucle for
        System.out.println("AVEC BOUCLE FOR");
        int count = 0;
        for (int n : numbers) {
            if (n > 10) {
                count++;
            }
        }
        System.out.println("Nombre d'éléments supérieurs à 10 : " + count);
        System.out.println();
    }
}
