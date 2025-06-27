// Exo 5.19 : Lister les 10 plus longues chaînes parmi plusieurs listes de chaînes

public class Ex5_19 {
    public static void main(String[] args) {
        String[] list1 = {
                "Java est un langage de programmation puissant",
                "Les streams en Java sont très utiles",
                "Exercice de filtrage et de tri de mots",
                "Apprendre à utiliser les streams est essentiel",
                "La programmation orientée objet est un paradigme important",
                "Les collections en Java facilitent la gestion des données",
                "Les exceptions en Java permettent de gérer les erreurs de manière appropriée",
                "La gestion de la concurrence en Java est importante pour les applications multi-threaded"
        };

        String[] list2 = {
                "Les chaînes de caractères sont importantes",
                "La programmation fonctionnelle est intéressante",
                "Les algorithmes de tri sont fondamentaux",
                "L'optimisation des performances est cruciale",
                "La gestion de la concurrence en Java est importante pour les applications multi-threaded",
                "La programmation orientée objet est un paradigme important",
                "Bravo c'est une bonne list"
        };

        System.out.println("Liste initiale : ");
        for (String str : list1) {
            System.out.println(str);
        }
        for (String str : list2) {
            System.out.println(str);
        }

        // Sans stream
        System.out.println();
        System.out.println("SANS STREAM");
        java.util.List<String> allStrings = new java.util.ArrayList<>();
        java.util.Collections.addAll(allStrings, list1);
        java.util.Collections.addAll(allStrings, list2);

        allStrings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        java.util.Set<String> uniqueStrings = new java.util.LinkedHashSet<>();
        java.util.List<String> longestStringsWithoutStream = new java.util.ArrayList<>();
        for (String str : allStrings) {
            if (uniqueStrings.add(str)) {
                longestStringsWithoutStream.add(str);
                if (longestStringsWithoutStream.size() == 10) {
                    break;
                }
            }
        }

        System.out.println("10 plus longues chaînes : " + longestStringsWithoutStream);

        // Avec stream
        System.out.println();
        System.out.println("AVEC STREAM");
        java.util.List<String> longestStringsWithStream = java.util.stream.Stream.concat(
                java.util.Arrays.stream(list1),
                java.util.Arrays.stream(list2))
                .distinct()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .limit(10)
                .toList();

        System.out.println("10 plus longues chaînes : " + longestStringsWithStream);
    }
}