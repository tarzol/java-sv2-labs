package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    public void convertInts(String ints) {
        List<Integer> intList = new ArrayList<>();

        Scanner scanner = new Scanner(ints).useDelimiter(";");
        while ( scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if ( i > 100) {
                System.out.println(i);
                intList.add(i);
            }
        }
        System.out.println(intList);
    }

    public static void main(String[] args) {
        IntScanner intScan = new IntScanner();
        intScan.convertInts("5;3;107;12;123;18;198");
        intScan.convertInts("5;3;12;18");
        intScan.convertInts("110;5;3;120;12;18;130");
        intScan.convertInts("");
    }
}
