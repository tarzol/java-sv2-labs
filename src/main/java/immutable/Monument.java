package immutable;

import java.time.LocalDate;
import java.util.Scanner;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegister;
    private final String numberInRegister;

    public Monument(String name, String address, LocalDate dateOfRegister, String numberInRegister) {
        if (isEmpty(name) || isEmpty(address) || isEmpty(numberInRegister)) {
            throw new IllegalArgumentException ("Field cannot be empty!");
        }
        this.name = name;
        this.address = address;
        this.dateOfRegister = dateOfRegister;
        this.numberInRegister = numberInRegister;
    }

    private Boolean isEmpty(String text) {
        return (text== null || text.isBlank());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("Regisztráció címe: ");
        String numberOfRegister = scanner.nextLine();
        LocalDate localDate = LocalDate.now();
        Monument monument = new Monument(name, address,localDate, numberOfRegister);
    }


}
