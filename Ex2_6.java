//Exo 2.6 : Calculer la somme de tous les éléments d'une liste

public class Ex2_6 {
    public static void main(String[] args) {

        System.out.println();
        // Sans stream
        System.out.println("SANS STREAM");
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sumWithoutStream = 0;
        for (int n : numbers) {
            sumWithoutStream += n;
        }
        System.out.println("Somme des nombres : " + sumWithoutStream);

        System.out.println();
        // Avec stream
        System.out.println("AVEC STREAM");
        int sumWithStream = java.util.Arrays.stream(numbers).sum();
        System.out.println("Somme des nombres : " + sumWithStream);
    }
}
