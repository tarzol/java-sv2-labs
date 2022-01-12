package collectionsiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    List<ChristmasPresent> christmasPresents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> iterator = christmasPresents.iterator();
        while (iterator.hasNext()) {
            ChristmasPresent actualPresent = iterator.next();
            if ( actualPresent.getPrice() > maxPrice) {
                System.out.println("Leírás: "+actualPresent.getName()+" ár: "+actualPresent.getPrice());
                iterator.remove();
            }
        }
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return christmasPresents;
    }

    public static void main(String[] args) {
        List<ChristmasPresent> presents = new ArrayList<>(Arrays.asList(
           new ChristmasPresent("versenyautó", "Ferrari", 15_000),
                   new ChristmasPresent("kirakó", "Puzzle", 6_000)));
        ChristmasShopping shopping = new ChristmasShopping(presents);
        shopping.addNewPresent(new ChristmasPresent("csoki", "Lindt", 1_000));
        System.out.println("Ajándékok száma: "+shopping.getChristmasPresents().size());
        shopping.removeTooExpensivePresent(5000);
        System.out.println("Ajándékok száma: "+shopping.getChristmasPresents().size());
    }
}
