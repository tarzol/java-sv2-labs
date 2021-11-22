package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> filteredWords = new ArrayList<>();
        for ( String word : words) {
            if (word.startsWith(prefix)) {
                filteredWords.add(word);
            }
        }
        return filteredWords;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("alma", "körte", "alpakka", "szilva");
        String part = "al";
        Prefix prefix = new Prefix();
        List<String> filteredWords = prefix.getWordsStartWith(words, part);
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }
}
