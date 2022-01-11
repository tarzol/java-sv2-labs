package collectionsqueue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    public PriorityQueue<Integer> getVaccinationOrder(List<Person> people) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for ( Person actual : people ) {
            if ( actual.getAge() >= 17 && actual.getAge() <= 65 ) {
                list.add(actual.getAge());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = new LinkedList<>();
        people.add(new Person("Kiss József", 76));
        people.add(new Person("Nagy Béla", 24));
        people.add(new Person("Szép Virág", 65));
        people.add(new Person("Pál Tamás", 12));
        people.add(new Person("Németh Gergely", 83));
        people.add(new Person("Szabó Fruzsina", 54));
        PriorityQueue<Integer> list = vaccination.getVaccinationOrder(people);
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
    }
}
