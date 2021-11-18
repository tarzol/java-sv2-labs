package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        PositiveNumber positiveNumber = new PositiveNumber();
        try {
            int number = positiveNumber.inputNumber();
            System.out.println("A szám? "+number);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy pozitív számot!");
        int number = Integer.parseInt(scanner.nextLine());
        if ( number < 0 ) {
            throw new IllegalArgumentException("A megadott szám nem pozitív!");
        }
        System.out.println("A megadott szám: "+number);
        return number;
    }
}
