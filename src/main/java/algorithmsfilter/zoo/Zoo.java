package algorithmsfilter.zoo;

import algorithmsfilter.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals;

    public Zoo(List<Animal> animal) {
        this.animals = animal;
    }

    public List<Animal> getAnimal() {
        return animals;
    }

    public void addAnimal(Animal newAnimal) {
        animals.add(newAnimal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> filteredAnimal = new ArrayList<>();
        for ( Animal item :  animals) {
            //System.out.println("Állatok és lábak: "+item.getName()+" "+item.getNumberOfLegs());
            if (item.getNumberOfLegs() == numberOfLegs) {
                filteredAnimal.add(item);
            }
        }
        return filteredAnimal;
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("elephant", 4);
        Animal csimpanz = new Animal("csimpánz", 4);
        Animal shark = new Animal("shark", 0);
        Animal bird = new Animal("bird", 2);
        List<Animal> animals = new ArrayList<>();
        animals.add(elephant);
        animals.add(csimpanz);
        animals.add(shark);
        animals.add(bird);

        Zoo zooBudapest = new Zoo(animals);
        List<Animal> filteredAnimail1 = zooBudapest.getAnimalsWithNumberOfLegsGiven(2);
        Animal emu = new Animal("Emu", 2);
        zooBudapest.addAnimal(emu);
        List<Animal> filteredAnimail2 = zooBudapest.getAnimalsWithNumberOfLegsGiven(2);

        System.out.println("Első legyűújtés: ");
        for (Animal item : filteredAnimail1) {
            System.out.println("Állat neve: "+item.getName()+" lábak: "+item.getNumberOfLegs());
        }
        System.out.println("\nMásodik legyűjtés: ");
        for (Animal item : filteredAnimail2) {
            System.out.println("Állat neve: "+item.getName()+" lábak: "+item.getNumberOfLegs());
        }
    }
}
