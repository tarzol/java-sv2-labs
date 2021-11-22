package algorithmsmax.hill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hill {
    public Integer getMax(List<Integer> mountainHeights) {
        Integer maxHeight = null;
        for (Integer mountain : mountainHeights) {
            if ( maxHeight == null || mountain > maxHeight) {
                maxHeight = mountain;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        Hill hill = new Hill();
        List<Integer> mountainHeights = Arrays.asList(2500, 3000, 6000, 8848);
        System.out.println("Legmagasabb csúcs: "+hill.getMax(mountainHeights));
    }
}
