package introdate;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(2000, 12, 20, "Németh Péter");

        System.out.println(employee1.getName());
        employee1.setName("Peti");
        System.out.println(employee1.getName());


    }
}
