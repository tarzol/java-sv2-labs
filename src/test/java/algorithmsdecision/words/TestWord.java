package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestWord {

    @Test
    void containsLongerWord0() {
        Word word = new Word();
        List<String> words = Arrays.asList("körte", "szilva", "barack", "slusszkulcs");
        assertTrue(word.containsLongerWord(words, "kulcs"));
    }

    @Test
    void containsLongerWord1() {
        Word word = new Word();
        List<String> words = Arrays.asList("körte", "szilva", "barack", "kulcs");
        assertFalse(word.containsLongerWord(words, "kulcs"));
    }

    @Test
    void containsLongerWord2() {
        Word word = new Word();
        List<String> words = Arrays.asList("körte", "szilva", "barack", "kefe");
        assertFalse(word.containsLongerWord(words, "slusszkulcs"));
    }
}
