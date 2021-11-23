package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> wordsFirstTwoLetters = new ArrayList<>();
        for (String word : words) {
            wordsFirstTwoLetters.add(word.substring(0, 2));
        }
        return wordsFirstTwoLetters;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("alma", "körte", "szilva", "barack");
        System.out.println(new TwoLetters().getFirstTwoLetters(words));
    }
}
