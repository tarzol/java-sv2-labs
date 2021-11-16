package division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number1 = scanner.nextInt();
        System.out.print("Hánnyal osztható számokat szeretne kapni?");
        int number2 = scanner.nextInt();

        /*for (int i = 1; number2 * i < number1; i++) {
            System.out.println(number2*i+", ");
        }*/

        int i = number2;
        while ( i < number1 ) {
            System.out.print(i+" ,");
            i = i + number2;
        }
    }
}
