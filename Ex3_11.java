//Exo 3.11 : Créer une liste de mots uniques, triés par longueur croissante.
public class Ex3_11 {
    public static void main(String[] args) {
        String[] words = { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "banana" };

        System.out.println("Liste initiale : " + java.util.Arrays.toString(words));

        // Sans stream
        System.out.println("\nSANS STREAM");
        java.util.Set<String> uniqueWordsSet = new java.util.HashSet<>();
        for (String word : words) {
            uniqueWordsSet.add(word);
        }
        String[] uniqueWords = uniqueWordsSet.toArray(new String[0]);
        java.util.Arrays.sort(uniqueWords, (w1, w2) -> Integer.compare(w1.length(), w2.length()));
        System.out.println("Liste de mots uniques triés par longueur : " + java.util.Arrays.toString(uniqueWords));

        // Avec stream
        System.out.println("\nAVEC STREAM");
        String[] sortedUniqueWords = java.util.Arrays.stream(words)
                .distinct()
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .toArray(String[]::new);
        System.out
                .println("Liste de mots uniques triés par longueur : " + java.util.Arrays.toString(sortedUniqueWords));
    }
}
