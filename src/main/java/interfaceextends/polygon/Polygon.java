package interfaceextends.polygon;

public class Polygon implements Geometric{

    double lengthOfSide;
    int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public double getPerimeter() {
        return lengthOfSide * numberOfVertices;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return (getNumberOfDiagonalsFromOneVertex()*3)/2;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
