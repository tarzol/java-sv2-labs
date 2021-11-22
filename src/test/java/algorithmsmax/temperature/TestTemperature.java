package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestTemperature {
    @Test
    void TestTemperature () {
        Temperature temperature = new Temperature();
        List<Integer> TestTempValues = Arrays.asList(-2, 4, 6, 9, -1, -5);
        Integer mintemperature = temperature.getMin(TestTempValues);
        assertEquals(-5, mintemperature );
    }
}
