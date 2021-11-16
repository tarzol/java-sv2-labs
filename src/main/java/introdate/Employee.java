package introdate;

import java.time.LocalDate;

public class Employee {

    private String name;
    int year;
    int month;
    int day;

    LocalDate dateOfBirth;
    LocalDate beginEmployment;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    /*LocalDate getDateOfBirth() {
        return
    }*/
}

