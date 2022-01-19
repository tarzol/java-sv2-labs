package streamsalgorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int birthYear;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Peti", 1961),
                new Employee("Laci" , 1965),
                new Employee("Máté", 1993),
                new Employee("Anna", 1999)
        ));

        //Összegezd az alkalmazottak születési éveit!
        Integer birthYears = employees.stream().
                mapToInt(employee -> employee.getBirthYear()).
                sum();

        System.out.println("Évszámok összeadva: "+birthYears);

        //Összegezd az alkalmazottak életkorát!
        Integer totalNumberofAges = employees.stream().
                map(employee -> 2002 - employee.getBirthYear()).
                mapToInt(age -> age).
                sum();
        System.out.println("Életkorok összesen:"+totalNumberofAges);

        //Add vissza streammel, hány alkalmazott van a listában!
        int numberOfEmployees = employees.stream().
                collect(Collectors.toList()).
                size();
        System.out.println("Alkalmazottak létszáma: "+numberOfEmployees);


        //Add vissza, hány alkalmazott született 1990-nél korábban!
        int numberOfEarlyBirth = employees.stream().
                filter(employee -> employee.birthYear < 1990).
                collect(Collectors.toList()).
                size();
        System.out.println("Born before 1990: "+numberOfEarlyBirth);

        //Add vissza a legkorábban született alkalmazott születési évét!
        OptionalInt oldestBirthYear = employees.stream().
                map(employee -> employee.getBirthYear()).
                mapToInt(year -> year).
                min();
        System.out.println("Legidősebb születési éve: "+oldestBirthYear);


        //Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
        String name = employees.stream().
                sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getBirthYear() - o2.getBirthYear();
                    }
                })
                .map(employee -> employee.getName())
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println("Legidősebb neve: "+name);

        //Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        boolean before = employees.stream().
                allMatch(employee -> employee.getBirthYear() < 1980);
        System.out.println("Mindenki 1980 előtt született: "+before);

        //Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        List<Employee> filteredEmployees = employees.stream().
                filter(employee -> employee.getBirthYear() < 1990).
                collect(Collectors.toList());
        System.out.println(filteredEmployees.get(0).getName()+filteredEmployees.size());


        //Add vissza egy listában az összes alkalmazott nevét!
        List<String> names = employees.stream().
                map(employee -> employee.getName()).
                collect(Collectors.toList());
        System.out.println(names);

        //Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
        List<String> namesBefore1990 = employees.stream().
                filter(employee -> employee.getBirthYear() <1990).
                map(employee -> employee.getName()).
                collect(Collectors.toList());
        System.out.println("1990 előtt születettek: "+namesBefore1990);
    }
}
