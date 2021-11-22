package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    public int sumOfRevenue (List<Salesperson> salespersons) {
        int sum = 0;
        for (Salesperson salesGuy : salespersons) {
            sum += salesGuy.getAmount();

        }
        return sum;
    }

    public static void main(String[] args) {
        Salesperson salesperson1 = new Salesperson("Zoli", 50);
        Salesperson salesperson2 = new Salesperson("Laci", 60);
        Salesperson salesperson3 = new Salesperson("Peti", 70);
        List<Salesperson> salespersonList = new ArrayList<>();
        salespersonList.add(salesperson1);
        salespersonList.add(salesperson2);
        salespersonList.add(salesperson3);

        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();
        System.out.println("Összes eladás: "+salesAmountSumCalculator.sumOfRevenue(salespersonList));
    }
}
