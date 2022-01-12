package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void testSearchPike() {
        Mountain mountain = new Mountain();
        assertTrue(mountain.searchPike(new Pike("Mont Blanc", 4000)));
        assertFalse(mountain.searchPike(new Pike("Mont Blanc", 4500)));
    }
}
