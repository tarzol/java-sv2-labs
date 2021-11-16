package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg, hogy melyik számtól kezdjem a fersorolást: ");
        int initialNumber = scanner.nextInt();
        for ( int i = initialNumber; i < 1_000_000; i++ ) {
            if (i % 7 == 0) {
                System.out.print("x"+" ");
                continue;
            } else if ( Integer.toString(i).contains("7") ) {
                break;
            }
            System.out.print(i+" ");
        }
    }
}
