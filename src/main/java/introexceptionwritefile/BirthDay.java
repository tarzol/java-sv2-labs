package introexceptionwritefile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthDay {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<String> familyNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg, hogy hány nevet szeretnél felvenni: ");
        int numberOfPersons = scanner.nextInt();
        scanner.nextLine();

        for ( int i = 0; i < numberOfPersons; i++) {
            System.out.println("A személy neve: ");
            String name = scanner.nextLine();
            System.out.println("A személy születési ideje: ");
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println(("Név"+name+" születési idő: "+yearOfBirth));
            people.add(new Person(name, yearOfBirth));
        }
        /*for ( int i=0; i<people.size(); i++) {
            System.out.println("A felvettek adatai: "+people.get(i).getName()+" "+people.get(i).getBirthDay());

        }*/

        Person familyMember3 = new Person("Máté", 1993);
        Person familyMember4 = new Person("Anna", 1999);
        people.add(new Person("Zoli", 1961));
        people.add(new Person("Judit", 1965));
        people.add(familyMember3);
        people.add(familyMember4);

        for ( Person onePerson : people) {
            familyNames.add(onePerson.getName()+" "+onePerson.getBirthDay());
        }

        try {
            Files.write(Paths.get("family_member_names.txt"), familyNames);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

