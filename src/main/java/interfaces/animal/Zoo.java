package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Animal{

    List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimal() {
        return animals.size();
    }

    public int getNumberOfLegs() {
        int number = 0;
        for (Animal animal : animals) {
            number +=animal.getNumberofLegs();
        }
        return number;
    }

    //Animal duck = new Duck();
    //Animal lion = new Lion();
    //Animal worm = new Worm();

    @Override
    public int getNumberofLegs() {
        return 0;
    }

    @Override
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
        System.out.println("Állatok létszáma: "+zoo.getNumberOfAnimal());
        System.out.println("Lábak száma"+zoo.getNumberOfLegs());
    }
}
