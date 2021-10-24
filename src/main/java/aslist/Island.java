package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        Island island = new Island();
        Scanner scanner = new Scanner(System.in);
        List<String> importantThings = Arrays.asList("kés","öngyújtó","só");
        System.out.println("Mit vinnék egy lakatlan szigetre? "+importantThings);

        System.out.println("Hányadik elemet cserélnéd le? ");
        int index = scanner.nextInt() - 1;
        System.out.println("Mi legyen helyette? ");
        scanner.nextLine();
        String newTool = scanner.nextLine();
        System.out.println(newTool);
        importantThings.set(index, newTool);
        System.out.println("A szigetre a következő eszközöket viszed: "+importantThings);
    }
}
