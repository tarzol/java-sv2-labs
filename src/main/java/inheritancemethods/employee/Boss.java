package inheritancemethods.employee;

public class Boss extends Employee {
    final static double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double basicSalary, int numberOfEmployees) {
        super(name, address, basicSalary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getSalary() {
        return (int)(getBasicSalary()+numberOfEmployees*LEADERSHIP_FACTOR*getBasicSalary());
    }
}


