package introexceptionmoreexceptions;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return getName()+getAge();
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person.toString());
        System.out.println(person.getName().toUpperCase());
    }


}
