package introexceptiontrace;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new Fish("keszeg", "szürke");
        Fish fish2 = new Fish("bohóchal", "piros");
        Fish fish3 = new Fish("csuka", "fekete");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        System.out.println(aquarium.getNumberOfFish());
    }
}
