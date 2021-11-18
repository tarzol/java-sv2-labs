package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int number1 = 0;
        int number2 = 0;

        try {
            System.out.println("Add meg az első számot: ");
            number1 = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Első értékként nem számot adtál meg!");
        }
        try {
            System.out.println("Add meg a második számot: ");
            number2 = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Második értékként nem számot adtál meg!");
        }

        System.out.println("Add meg, hogy milyen műveletet végezzek!");
        System.out.println("Összeadás: 1");
        System.out.println("Kivonás: 2");
        System.out.println("Szorzás: 3");
        System.out.println("Osztás: 4");
        int action = scanner.nextInt();
        try {
            switch (action) {
                case 1:
                    System.out.println("Az összeadás eredménye:" + calculator.sum(number1, number2));
                    break;
                case 2:
                    System.out.println("Az összeadás eredménye:" + calculator.subtract(number1, number2));
                    break;
                case 3:
                    System.out.println("Az összeadás eredménye:" + calculator.multiply(number1, number2));
                    break;
                case 4:
                    System.out.println("Az összeadás eredménye:" + calculator.devide(number1, number2));
                    break;
                default:
                    System.out.println("Rossz számot adtál meg a műveletre!");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Nullával osztás miatt hiba keletkezett!");
        }
    }
}
