package algorithmsdecision.words;

import java.util.Arrays;
import java.util.List;

public class Word {
    public Boolean containsLongerWord(List<String> words, String newWord) {
        for (String word : words) {
            if (word.length() > newWord.length() ){
                System.out.println(word);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("körte", "szilva", "barack", "slusszkulcs");
        Word word = new Word();
        String newWord = "kisfejsze";
        word.containsLongerWord(words, newWord);
    }
}
