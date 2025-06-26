//Exo 3.12 : Trouver les 3 plus grandes valeurs distinctes d'une liste

public class Ex3_12 {
    public static void main(String[] args) {
        int[] numbers = { 5, 12, 3, 18, 7, 20, 9, 15, 2, 11 };

        System.out.println("Liste initiale : " + java.util.Arrays.toString(numbers));

        // Sans stream
        System.out.println("SANS STREAM");
        java.util.Arrays.sort(numbers);
        int[] distinctNumbers = java.util.Arrays.stream(numbers).distinct().toArray();
        int[] top3WithoutStream = new int[Math.min(3, distinctNumbers.length)];
        for (int i = 0; i < top3WithoutStream.length; i++) {
            top3WithoutStream[i] = distinctNumbers[distinctNumbers.length - 1 - i];
        }
        System.out.println("3 plus grandes valeurs distinctes : " + java.util.Arrays.toString(top3WithoutStream));
        System.out.println();

        // Avec stream
        System.out.println("AVEC STREAM");
        int[] top3WithStream = java.util.Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(3)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("3 plus grandes valeurs distinctes : " + java.util.Arrays.toString(top3WithStream));
    }
}
