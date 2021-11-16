package controladvanced.labels;

import java.util.Arrays;

public class Labels {
    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        outer: for (int i = 0; i < number; i++) {
            inner: for (int j = 0; j < number; j++) {
                if (j%2 == 0) {
                    continue;
                }
                table[i][j] = (i + 1) + (j + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Labels labels = new Labels();
        int[][] newTable = labels.getTableOfNumbers(4);
        for ( int i = 0; i<newTable.length; i++  ) {
            System.out.println(Arrays.toString(newTable[i]));
        }
    }
}
