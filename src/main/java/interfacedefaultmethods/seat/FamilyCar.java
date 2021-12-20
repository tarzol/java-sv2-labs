package interfacedefaultmethods.seat;

public class FamilyCar implements Seat{

    @Override
    public int getNumberOfSeats() {
        return Seat.super.getNumberOfSeats();
    }
}
