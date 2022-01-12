package sorting;

import java.awt.image.IndexColorModel;
import java.util.Arrays;

public class Income {

    public int[] getIncomes() {
        return incomes;
    }

    private int[] incomes;

    public int getHighestIncome(int[] incomes) {
        int highest;
        Arrays.sort(incomes);
        return incomes[incomes.length-1];
    }

    public static void main(String[] args) {
        Income income = new Income();
        int[] numbers = {20, 40, 10, 1000, 50};
        System.out.println(income.getHighestIncome(numbers));
    }
}
