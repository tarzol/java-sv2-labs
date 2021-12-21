package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testZeroToThree() {
        SeatHeaterState state = SeatHeaterState.ZERO;

        assertEquals(SeatHeaterState.THREE, state.change());
    }

    @Test
    void testThreeToTwo() {
        SeatHeaterState state = SeatHeaterState.THREE;

        assertEquals(SeatHeaterState.TWO, state.change());
    }

}