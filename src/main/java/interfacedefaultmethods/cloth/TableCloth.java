package interfacedefaultmethods.cloth;

public class TableCloth implements Square {

    private double side;

    public TableCloth(double side) {
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }

    public static void main(String[] args) {
        TableCloth tableCloth1 = new TableCloth(5);
        System.out.println(tableCloth1.getArea());
        System.out.println(tableCloth1.getLengthOfDiagonal());
    }
}
