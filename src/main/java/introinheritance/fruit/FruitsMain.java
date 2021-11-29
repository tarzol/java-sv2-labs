package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Fruit fruit = new Fruit();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        Grape grape = new Grape();
        Starking starking = new Starking();

        apple.setPieces(5);
        apple.setName("Jonathan");
        apple.setWeight(20.5);

        goldenDelicious.setName("Golden Delicious");
        goldenDelicious.getColour();
        goldenDelicious.setWeight(23.2);
        goldenDelicious.setPieces(3);

        grape.setType("red");
        grape.setName("Othello");
        grape.setWeight(34.5);

        starking.setName("Starking");
        starking.setPieces(4);

        System.out.println("Apple:"+apple.getPieces()+" db "+"\nname: "+apple.getName()+"súly: "+apple.getPieces()* apple.getWeight()+ "dekagramm");
        System.out.println("Golden del: "+goldenDelicious.getName()+" szín: "+goldenDelicious.getColour()+" súly: "+goldenDelicious.getWeight()* goldenDelicious.getPieces()+" dekagramm");
        System.out.println("Szőlő típus "+grape.getType()+" name: "+grape.getName()+" súly"+grape.getWeight());
        System.out.println("Név: "+starking.getName()+" "+starking.getPieces()+" db");



    }
}
