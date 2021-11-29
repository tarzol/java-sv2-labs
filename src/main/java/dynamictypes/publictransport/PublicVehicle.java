package dynamictypes.publictransport;

public class PublicVehicle {
    int lineNumber;
    double length;

    public PublicVehicle(int lineNumber, double length) {
        this.lineNumber = lineNumber;
        this.length = length;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLength() {
        return length;
    }
}
