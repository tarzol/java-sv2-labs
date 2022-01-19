package lambdaintro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarTest {

    UsedCar usedCar;

    @BeforeEach
    void setUp() {
        List<Car> cars = Arrays.asList(
                new Car("Ford", "S-Max", 2_400_000, 6),
                new Car("Opel", "Astra", 2_100_000, 4),
                new Car("Fiat", "Scudo", 3_000_000, 5),
                new Car("Opel", "Zafira", 2_500_000, 5),
                new Car("Fiat", "Punto", 1_500_000, 3)
                );
        usedCar = new UsedCar(cars);
    }

    @Test
    void listCarsByPrices() {
        List<Car> listOfCarsByPrice = usedCar.listCarsByPrices();
        assertEquals("Punto", listOfCarsByPrice.get(0).getType());
        assertEquals(3000000, listOfCarsByPrice.get(4).getPrice());
    }

    @Test
    void listCarsByLengthDesc() {
        List<Car> listCarsByLength =usedCar.listCarsByLengthDesc();
        assertEquals(6, listCarsByLength.get(0).getLength());
        assertEquals("Ford", listCarsByLength.get(0).getBrand());

    }

    @Test
    void listCarsOneBrandByType() {
        List<Car> listCarByBrandAndType = usedCar.listCarsOneBrandByType("Fiat");
        assertEquals("Punto", listCarByBrandAndType.get(0).getType());
    }
}