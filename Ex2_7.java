//Exo 2.7 : Convertir une liste de chaînes de caractères en liste de leur longueur respective

import java.util.Arrays;

public class Ex2_7 {
    public static void main(String[] args) {

        String[] words = { "apple", "banana", "cherry", "date", "elderberry" };
        System.out.println("Liste initiale : " + Arrays.toString(words));

        System.out.println();
        // Sans stream
        System.out.println("SANS STREAM");
        int[] lengthsWithoutStream = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            lengthsWithoutStream[i] = words[i].length();
        }
        System.out.println("Longueurs des mots : " + java.util.Arrays.toString(lengthsWithoutStream));

        System.out.println();
        // Avec stream
        System.out.println("AVEC STREAM");
        int[] lengthsWithStream = java.util.Arrays.stream(words)
                .mapToInt(String::length)
                .toArray();
        System.out.println("Longueurs des mots : " + java.util.Arrays.toString(lengthsWithStream));
    }
}
