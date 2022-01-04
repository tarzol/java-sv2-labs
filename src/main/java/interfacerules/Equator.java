package interfacerules;

public class Equator implements Name, Length {

    private String name = "Equator";
    private double length = 40_075.0;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name;
    }
}
