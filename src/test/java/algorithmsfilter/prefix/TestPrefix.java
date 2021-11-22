package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestPrefix {
    @Test
    void TestgetWordsStartWith() {
        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("alma", "körte", "alpakka", "szilva");
        List<String> filteredWords = prefix.getWordsStartWith(words, "al");
        assertEquals(2, filteredWords.size());

        assertTrue(filteredWords.get(0).equals("alma"));
        assertTrue(filteredWords.get(1).equals("alpakka"));
        assertTrue(filteredWords.size()==2);

    }

}
