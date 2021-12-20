package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testBiCycle() {
        Vehicle v1 = Vehicle.of(2);
        assertEquals(Bicycle.class, v1.getClass());
    }

    @Test
    void testCar() {
        Vehicle v1 = Vehicle.of(4);
        assertEquals(Car.class, v1.getClass());
    }

    @Test
    void testWrongData() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Vehicle.of(3));
        assertEquals("A megadott kerékszám nem megfelelő!", ex.getMessage());
    }
}