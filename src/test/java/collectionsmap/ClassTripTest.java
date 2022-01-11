package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip = new ClassTrip();

    @Test
    void testloadInPayments() {
        classTrip.loadInpayments(Paths.get("src/main/resources/inpayments.txt"));
        assertEquals(3, classTrip.getTripItems().size());
        assertTrue(classTrip.getTripItems().containsKey("Nagy Béla"));
        assertTrue(classTrip.getTripItems().containsValue(12500));
    }

    @Test
    void testloadInPaymentsNoFile() {
        Exception ex = assertThrows(IllegalStateException.class, () -> classTrip.loadInpayments(Paths.get("src/main/resources/inpayments_.txt")));
        assertEquals("File cannot be read!", ex.getMessage());
    }
}