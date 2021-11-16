package division.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg, hogy a Fibonacci-sorozat hány elemét szeretnéd látni: ");
        int noOfFiboItems = scanner.nextInt();
        int fibOne = 0;
        int fibTwo = 1;
        int fibThree = 2;
        System.out.print(fibOne+", ");
        System.out.print(fibTwo+", ");
        for ( int i= 0; i < noOfFiboItems; i++) {
            System.out.print(fibThree+", ");
            fibOne = fibTwo;
            fibTwo = fibThree;
            fibThree = fibOne + fibTwo;
        }
    }
}
