package aslist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a kedvenc színészedet: ");
        String favActor = scanner.nextLine();
        favouriteThings.add(favActor);

        System.out.println("Add meg a kedvenc filmedet: ");
        String favFilm = scanner.nextLine();
        favouriteThings.add(favFilm);

        System.out.println("Add meg a kedvenc állatodat: ");
        String favAnimal = scanner.nextLine();
        favouriteThings.add(favAnimal);

        System.out.println("A lista mérete: "+favouriteThings.size());
        System.out.println("A lista tartalma: "+favouriteThings);
    }
}
