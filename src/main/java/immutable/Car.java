package immutable;

import algorithmssum.school.School;

import java.time.LocalDate;
import java.util.Scanner;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfManufacturing;

    public Car(String brand, String type, int yearOfManufacturing) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand name cannot be empty!");
        }
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type cannot be empty!");
        }
        if (yearOfManufacturing > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        }
        this.brand = brand;
        this.type = type;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az autó márkáját: ");
        String brand = scanner.nextLine();
        System.out.println("Add meg az autó típusát: ");
        String type = scanner.nextLine();
        System.out.println("Add meg az autó gyártási évét: ");
        int date = scanner.nextInt();
        scanner.nextLine();

        Car car1 = new Car(brand, type, date);
    }
}
