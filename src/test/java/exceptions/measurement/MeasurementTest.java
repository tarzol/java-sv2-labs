package exceptions.measurement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement = new Measurement();
    List<String> faultyLines; // = new ArrayList<>();


    @Test
    void testOfExistingFile() {
        List<String> faultyLines = measurement.readFromFile(Paths.get("c:/training/training-solutions/src/main/resources/measurementdata.csv"));
        assertEquals(7, faultyLines.size());
        assertEquals(true, faultyLines.get(2).endsWith("JohnDoe"));
    }

    @Test
    void testOfNonExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class, ()->measurement.readFromFile(Paths.get("asd")));
        assertEquals("File cannot be read!", ex.getMessage());
    }
}