package exceptionresource;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hw = new HiddenWord();

    @Test
    void getHiddenWordRightPath() {
        assertEquals("ALMA KÖRTE", hw.getHiddenWord(Paths.get("src/test/resources/hiddenword.txt")));
    }

    @Test
    void getHiddenWordWrongPath() {
        Path path = Paths.get("src/test/resources/hiddenword_.txt");
        Exception ex = assertThrows(IllegalStateException.class, ()-> hw.getHiddenWord(path));
        assertEquals("File cannot be opened.", ex.getMessage());
    }
}
