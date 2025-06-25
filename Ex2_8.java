//Exo 2.8 : Compter les occurences de chaque mot dans une phrase
public class Ex2_8 {
    public static void main(String[] args) {
        String sentence = "Moi qui n'ai jamais prié Dieu Que lorsque j'avais mal aux dents Moi qui n'ai jamais prié Dieu Que quand j'ai eu peur de Satan Moi qui n'ai prié Satan Que lorsque j'étais amoureux Moi qui n'ai prié Satan Que quand j'ai eu peur du Bon Dieu";
        System.out.println("La phrase est donc de jaques Brel : " + sentence);
        System.out.println();

        // Sans stream
        System.out.println("SANS STREAM");
        String[] words = sentence.split(" ");
        java.util.Map<String, Integer> wordCountMap = new java.util.HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        System.out.println("Occurrences des mots : " + wordCountMap);

        System.out.println();

        // Avec stream
        System.out.println("AVEC STREAM");
        java.util.Map<String, Long> wordCountStreamMap = java.util.Arrays.stream(words)
                .collect(java.util.stream.Collectors.groupingBy(word -> word, java.util.stream.Collectors.counting()));
        System.out.println("Occurrences des mots : " + wordCountStreamMap);
    }
}
