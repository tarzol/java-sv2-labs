package stringconcat.employee;

public class Employee {
    String name;
    String profession;
    int salary;

    public Employee(String name, String profession, int salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        String backString = null;
        backString = this.getName()+" - "+this.getProfession()+" - "+this.getSalary()+" - "+"Ft";
        return backString;
    }


}

