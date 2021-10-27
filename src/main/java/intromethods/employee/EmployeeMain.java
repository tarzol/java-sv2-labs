package intromethods.employee;

import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Horváth Tibor", 2008, 300000);
        System.out.println("Employee1 neve: "+employee1.getName());
        System.out.println("Munkábaállás időpontja: "+employee1.getHiringYear());
        System.out.println("Fizetés: "+employee1.getSalary());
        employee1.setName("Németh Tibor");
        System.out.println("Új név: "+employee1.getName());
        employee1.raiseSalary((50000));
        System.out.println("Az új fizetés: "+employee1.getSalary());

        System.out.println(employee1);

    }
}

