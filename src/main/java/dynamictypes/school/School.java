package dynamictypes.school;

public class School {
    String name;
    int numberOfYears;

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String toString() {
        return getName()+"  "+getNumberOfYears();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
}
