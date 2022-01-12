package searching;

import java.util.Arrays;
import java.util.Collections;

public class Mountain {

    private int[] heights = {1000, 1500, 4000, 6000, 8000};

    public boolean searchPike(Pike pike) {
        int decisionNumber = Arrays.binarySearch(heights, pike.getHeight());
        if ( decisionNumber < 0 ) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        System.out.println(mountain.searchPike(new Pike("Mont Blanc", 4000)));
        System.out.println(mountain.searchPike(new Pike("Mont Blanc", 4500)));
    }
}
