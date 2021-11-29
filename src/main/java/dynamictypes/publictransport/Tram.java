package dynamictypes.publictransport;

public class Tram extends PublicVehicle {

    int numberOfTramcars;

    public Tram(int lineNumber, double length, int numberOfTramcars) {
        super(lineNumber, length);
        this.numberOfTramcars = numberOfTramcars;
    }

    public int getNumberOfTramcars() {
        return numberOfTramcars;
    }
}
