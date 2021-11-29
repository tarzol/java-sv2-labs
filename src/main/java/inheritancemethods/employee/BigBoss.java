package inheritancemethods.employee;

public class BigBoss extends Boss {

    private double bonus;

    public BigBoss(String name, String address, double basicSalary, int numberOfEmployees, double bonus) {
        super(name, address, basicSalary, numberOfEmployees);
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return (int)(getBasicSalary()+getNumberOfEmployees()*LEADERSHIP_FACTOR*getBasicSalary()+bonus);
    }

    public static void main(String[] args) {
        Person person = new Person("Zoli", "Budajenő");
        Employee employee = new Employee("Zoli", "Budajenő", 400000);
        Boss boss = new Boss("Zoli", "Budajenő", 400000, 10);
        BigBoss bigBoss = new BigBoss("Zoli", "BJ", 400000, 20, 100000);

        System.out.println("Employee: "+employee.getSalary());
        System.out.println("Boss: "+boss.getSalary());
        System.out.println("Bigboss: "+bigBoss.getSalary());
    }
}
