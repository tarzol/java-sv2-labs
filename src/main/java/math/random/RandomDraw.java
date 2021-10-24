package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("Németh Péter0");
        persons.add("Németh Péter1");
        persons.add("Németh Péter2");
        persons.add("Németh Péter3");
        persons.add("Németh Péter4");
        persons.add("Németh Péter5");
        persons.add("Németh Péter6");
        persons.add("Németh Péter7");
        persons.add("Németh Péter8");
        persons.add("Németh Péter9");

        Random random = new Random();
        int firstNumber = random.nextInt(5);
        int secondNumber = random.nextInt(5) + 5;

        System.out.println(persons.get(firstNumber));
        System.out.println(persons.get(secondNumber));
    }
}