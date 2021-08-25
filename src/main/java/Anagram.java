import java.util.*;
import java.util.stream.Collectors;

public class Anagram {
    public static List<List<String>> GetAnagrams(List<String> words) {
        var anagrams = new ArrayList<List<String>>();

        for(String wordA : words){
            boolean isAlreadyInTheList = anagrams
                    .stream()
                    .reduce(0, (subtotal, i) -> subtotal + (int) i
                            .stream()
                            .filter(f -> f.equals(wordA)).count(), Integer::sum) > 0;

            if(isAlreadyInTheList)
                continue;

            var groupOfAnagrams = new ArrayList<String>();

            words.stream().forEach((wordB) -> {

                if (Arrays.equals(Anagram.extractLetters(wordA), Anagram.extractLetters(wordB)))
                    groupOfAnagrams.add(wordB);
            });

            if (groupOfAnagrams.size() > 0) {
                Collections.sort(groupOfAnagrams, String.CASE_INSENSITIVE_ORDER);
                anagrams.add(groupOfAnagrams);
            }
        }

        Collections.sort(anagrams, Comparator.comparing((List<String> a) -> a.stream().collect(Collectors.joining(",")), String.CASE_INSENSITIVE_ORDER));

        return anagrams;
    }

    public static char[] extractLetters(String word) {
        var letters = word.replace(" ", "").toCharArray();
        Arrays.sort(letters);
        return letters;
    }

}
