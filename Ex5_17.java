// Exo 5.17 :A partir d’une liste de phrases, extraire les mots de plus de 5 letres, triés et sans doublons

public class Ex5_17 {
    public static void main(String[] args) {
        String[] phrases = {
                "Java est un langage de programmation puissant",
                "Les streams en Java sont très utiles",
                "Exercice de filtrage et de tri de mots",
                "Apprendre à utiliser les streams est essentiel"
        };

        System.out.println();
        System.out.println("Liste de phrases :");
        for (String phrase : phrases) {
            System.out.println(phrase);
        }
        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        java.util.Set<String> uniqueWords = new java.util.HashSet<>();
        for (String phrase : phrases) {
            String[] words = phrase.split(" ");
            for (String word : words) {
                if (word.length() > 5) {
                    uniqueWords.add(word);
                }
            }
        }
        java.util.List<String> sortedWords = new java.util.ArrayList<>(uniqueWords);
        java.util.Collections.sort(sortedWords);
        System.out.println("Mots de plus de 5 lettres, triés et sans doublons : " + sortedWords);

        // Avec stream
        System.out.println();
        System.out.println("AVEC STREAM");
        java.util.List<String> result = java.util.Arrays.stream(phrases)
                .flatMap(phrase -> java.util.Arrays.stream(phrase.split(" ")))
                .filter(word -> word.length() > 5)
                .distinct()
                .sorted()
                .toList();
        System.out.println("Mots de plus de 5 lettres, triés et sans doublons : " + result);
    }
}
