package lambdaintro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car("Volvo", "XC60", 11_000_000, 5);

    @Test
    void getBrand() {
        assertEquals("Volvo", car.getBrand() );
    }

    @Test
    void getType() {
        assertEquals("XC60", car.getType());

    }

    @Test
    void getPrice() {
        assertEquals(11_000_000, car.getPrice());

    }

    @Test
    void getLength() {
        assertEquals(5, car.getLength() );

    }
}