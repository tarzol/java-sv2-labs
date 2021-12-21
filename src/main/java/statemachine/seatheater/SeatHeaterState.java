package statemachine.seatheater;

public enum SeatHeaterState {

    ZERO {
        @Override
        SeatHeaterState change() {
            return SeatHeaterState.THREE;
        }
    },
    THREE {
        @Override
        SeatHeaterState change() {
            return SeatHeaterState.TWO;
        }
    }, TWO {
        @Override
        SeatHeaterState change() {
            return SeatHeaterState.ONE;
        }
    }, ONE {
        @Override
        SeatHeaterState change() {
            return SeatHeaterState.ZERO;
        }
    };

    abstract SeatHeaterState change();
}
