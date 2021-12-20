package interfacerules;

public class Equator implements Name, Length {

    private String name = "Egyenlítő";
    private int length = 40_000;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name;
    }
}
