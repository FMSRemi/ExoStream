//Exo 3.9 : Trier une liste de chaînes par ordre alphabétique

public class Ex3_9 {
    public static void main(String[] args) {
        String[] words = { "banana", "apple", "cherry", "date", "elderberry" };

        System.out.println("Liste initiale : " + java.util.Arrays.toString(words));

        // Sans stream
        System.out.println("\nSANS STREAM");
        java.util.Arrays.sort(words);
        System.out.println("Liste triée : " + java.util.Arrays.toString(words));

        // Avec stream
        System.out.println("\nAVEC STREAM");
        String[] sortedWords = java.util.Arrays.stream(words)
                .sorted()
                .toArray(String[]::new);
        System.out.println("Liste triée : " + java.util.Arrays.toString(sortedWords));
    }
}
