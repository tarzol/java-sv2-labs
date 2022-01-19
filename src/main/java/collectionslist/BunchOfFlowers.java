package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    List<String> flowers = new LinkedList<>();

    public void addFlowerInTheMiddle(String flower) {
        int numberOfFlowers = flowers.size();
        if ( flowers.size()%2 == 0 ) {
            flowers.add(flowers.size()/2, flower);

        } else {
            flowers.add(flowers.size()/2, flower);
            flowers.add(flowers.size()/2+1, flower);
        }
    }

    public static void main(String[] args) {
        BunchOfFlowers bunch = new BunchOfFlowers();
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
        bunch.flowers.add("virág");
        bunch.addFlowerInTheMiddle("spec virág");
        System.out.println(bunch.flowers);
    }
}
