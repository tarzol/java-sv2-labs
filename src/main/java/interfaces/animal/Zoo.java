package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {

        int number = 0;
        for (Animal animal : animals) {
            number +=animal.getNumberOfLegs();
        }
        return number;
    }


    public String getName() {
        return null;
    }

    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal lion = new Lion();
        Animal worm = new Worm();

        List<Animal> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(duck);
        animals.add(lion);
        animals.add(lion);
        animals.add(worm);
        animals.add(worm);
        System.out.println(("Animals lista hossza: "+animals.size()));
        Zoo zoo = new Zoo(animals);
        System.out.println("Állatok létszáma: "+zoo.getNumberOfAnimals());
        System.out.println("Lábak száma"+zoo.getNumberOfAllLegs());
    }
}
