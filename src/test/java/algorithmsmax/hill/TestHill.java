package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class TestHill {
    @Test
    void TestGetMax() {
        Hill hill = new Hill();
        List<Integer> mountainHeights = Arrays.asList(2500, 3000, 6000);
        Integer maxHeight = hill.getMax(mountainHeights);
        assertEquals(6000, maxHeight);
    }
}
