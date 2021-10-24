package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplyTable = new int[size][size];
        String multiplyTableAsString;
        for ( int i=0; i<size; i++) {
            for ( int j=0; j<size; j++) {
                multiplyTable[i][j] = (i+1)*(j+1);
            }
        }
        multiplyTableAsString = Arrays.deepToString(multiplyTable);
        return multiplyTableAsString;
    }

    public static void main(String[] args) {
        ArraysMain arraysMain =new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println(arraysMain.multiplicationTableAsString(4));
    }
}
