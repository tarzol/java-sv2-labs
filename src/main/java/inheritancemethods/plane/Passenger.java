package inheritancemethods.plane;

public class Passenger {
    String name;
    int priceOfPlaneTicket;

    public Passenger(String name, int priceOfPlaneTicket) {
        this.name = name;
        this.priceOfPlaneTicket = priceOfPlaneTicket;
    }

    public String getName() {
        return name;
    }

    public int getPriceOfPlaneTicket() {
        return priceOfPlaneTicket;
    }
}
