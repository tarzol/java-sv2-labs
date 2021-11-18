package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("Üdvözöljük rendszerünkben");
        System.out.println("Kérem, adja meg a nevét: ");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }

        System.out.println("Kérem, adja meg az életkorát: ");
        String ageString = scanner.nextLine();
        try {
            validation.validateAge(ageString);
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }

        System.out.println("A megadott adatok: ");
        System.out.println("Név: "+name+"  Életkor: "+ageString);
    }
}
