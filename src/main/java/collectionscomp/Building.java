package collectionscomp;

import java.util.Objects;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building another) {
        return Integer.valueOf(levels).compareTo(Integer.valueOf(another.levels));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public String toString() {
        return "Building{"+this.address +
                "  levels=" + levels +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    public static void main(String[] args) {
        Building building1 = new Building("Budapest", 100, 2);
        Building building2 = new Building("Pécs", 90, 1);
        Building building3 = new Building("Bécs", 200, 4);
        TreeSet<Building> buildings = new TreeSet<>();
        buildings.add(building1);
        buildings.add(building2);
        buildings.add(building3);
        System.out.println(buildings);

    }
}
