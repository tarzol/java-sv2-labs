package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kovács Z", "fogorvos", 1000000);

        System.out.println(employee1.toString());

        Employee employee2 = new Employee("Német P", "tanár", 300000);
        employee2.setProfession("taxis");
        employee2.setSalary(500000);
        System.out.println(employee2.toString());
    }


}
