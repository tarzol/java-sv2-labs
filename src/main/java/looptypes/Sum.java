package looptypes;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public void printSums(int[] numbers) {
        System.out.print("A két számok összege: ");
        for (int i=0; i<numbers.length-1; i++) {
            System.out.print((numbers[i]+numbers[i+1])+"  ");
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = new int[]{2, 6, 3, 5, 7, 9};
        sum.printSums(numbers);
    }
}
