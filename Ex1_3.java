//Exo 1.3 : Multiplier chaque élément d'une liste par 2 et stocker le résultat dans une nouvelle liste

public class Ex1_3 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println();
        // Sans stream
        System.out.println("AVEC STREAM");
        int[] doubledStreamNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubledStreamNumbers[i] = numbers[i] * 2;
        }
        System.out.println("Nombres multipliés par 2 : " + java.util.Arrays.toString(doubledStreamNumbers));

        // Avec stream
        System.out.println("SANS STREAM");
        int[] doubledWithoutStreamNumbers = java.util.Arrays.stream(numbers)
                .map(n -> n * 2)
                .toArray();
        System.out.println("Nombres multipliés par 2 : " + java.util.Arrays.toString(doubledWithoutStreamNumbers));
        System.out.println();
    }
}