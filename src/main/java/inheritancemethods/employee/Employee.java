package inheritancemethods.employee;

public class Employee extends Person {
    private double basicSalary;

    public Employee(String name, String address, double basicSalary) {
        super(name, address);
        this.basicSalary = basicSalary;
    }

    public double getSalary() {
        return basicSalary;
    }
    public void raiseSalary(int percent) {
        basicSalary *=1.05;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}
