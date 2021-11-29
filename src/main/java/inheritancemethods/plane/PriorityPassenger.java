package inheritancemethods.plane;

public class PriorityPassenger extends Passenger{

    final int percent;

    public PriorityPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket);
        this.percent = percent;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return priceOfPlaneTicket+percent*priceOfPlaneTicket/100;
    }
}
