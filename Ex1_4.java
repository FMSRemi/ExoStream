//Exo 1.4 : Trouver le maximum et le minimum d'une liste
public class Ex1_4 {
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 3, 18, 7, 50, 9, 15, 0, 11 };
        int max = numbers[0];
        int min = numbers[0];

        System.out.println();
        // Sans stream
        System.out.println("SANS STREAM");
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);

        System.out.println();
        // Avec stream
        System.out.println("AVEC STREAM");
        int maxStream = java.util.Arrays.stream(numbers).max().orElseThrow();
        int minStream = java.util.Arrays.stream(numbers).min().orElseThrow();
        System.out.println("Maximum : " + maxStream);
        System.out.println("Minimum : " + minStream);

    }
}