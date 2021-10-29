package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Németh Péter", "Lukács Tamás", "Bagi József");

        for ( String name : names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!", name);
            System.out.println();
        }
    }
}
