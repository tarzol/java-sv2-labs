package collectionsequalshash;

import java.util.Objects;
import java.util.SplittableRandom;

public class Person {

    private String name;
    private int age;
    private String TAJ;

    public Person(String name, int age, String TAJ) {
        this.name = name;
        this.age = age;
        this.TAJ = TAJ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(TAJ, person.TAJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Zoli", 40, "123456");
        Person person2 = new Person("Zolllli", 39, "123456");
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }

}

