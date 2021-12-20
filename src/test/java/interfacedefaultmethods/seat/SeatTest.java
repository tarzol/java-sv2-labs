package interfacedefaultmethods.seat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testFamilyCar() {
        Seat seat = new FamilyCar();
        assertEquals(5, seat.getNumberOfSeats());
    }

    @Test
    void testSportsCar() {
        Seat seat = new SportsCar();
        assertEquals(2, seat.getNumberOfSeats());
    }

    @Test
    void testCar() {
        Seat seat = new Car("VW", 7);
        assertEquals(7, seat.getNumberOfSeats());
    }

}