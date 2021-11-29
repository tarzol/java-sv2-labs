package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        //Fruit fruit = new Fruit();
        objects.add(new Fruit());
        //Apple apple = new Apple();
        objects.add(new Apple());
        //Starking starking = new Starking();
        objects.add(new Starking());
        //Vegetable vegetable = new Vegetable();
        objects.add(new Vegetable());
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        LocalDate localDate = LocalDate.now();
        objects.add(LocalDate.now());
        int[] numbers = {1,3,5,};
        String[] words = {"one", "two", "three"};
        System.out.println(objects);
        for (Object object : objects) {
            System.out.println(object.toString());
        }
    }
}
