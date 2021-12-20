package aaa_exam2.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    List<Fish> fishList = new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish fish) {
        //System.out.println("Halak száma: "+fishList.size());

        if (fishList.size() < CAPACITY/5 ) {
            fishList.add(fish);
        } else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }

        //System.out.println("Halak száma: "+fishList.size());
    }


    public void feed() {
        for (Fish item : fishList) {
            item.feed();
        }
    }

    public void  removeFish(int maxWeight) {
        List<Fish> biggerFishes = new ArrayList<>();
        for (Fish item : fishList) {
            if (item.getWeight() > maxWeight) {
                biggerFishes.add(item);
            }
        }
        fishList.removeAll(biggerFishes);
    }

    public List<String> getStatus() {
        List<String> statusOfFishes = new ArrayList<>();
        for ( Fish item : fishList) {
            statusOfFishes.add(item.getStatus());
        }
        return statusOfFishes;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int fishWithoutMemory = 0;
        for (Fish item : fishList) {
            if ( item.hasMemoryLoss()) {
                fishWithoutMemory++;
            }
        }
        return fishWithoutMemory;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish item : fishList) {
            if (item.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        int smallestWeight = fishList.get(0).getWeight();
        Fish smallestFish = fishList.get(0);
        for (Fish item : fishList) {
            if (item.getWeight() < smallestWeight) {
                smallestFish = item;
            }
        }
        return smallestFish;
    }
}
