package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTwoLetters {
    @Test
    void TestGetFirstTwoLetters() {
        List<String> words = Arrays.asList("alma", "körte", "szilva", "barack");
        TwoLetters TwoLetters = new TwoLetters();
        List<String> amendedList = TwoLetters.getFirstTwoLetters(words);
        assertEquals(4, amendedList.size());
        assertTrue(amendedList.size()==4);
        assertEquals("kö", amendedList.get(1));
    }
}
