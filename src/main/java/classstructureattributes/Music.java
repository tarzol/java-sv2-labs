package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        Song song =new Song();

        System.out.println("Kérem add meg kedvenc zeneszámod adatait!");
        System.out.println("Előadó: ");
        song.band = scanner.nextLine();

        System.out.println("Címe: ");
        song.title = scanner.nextLine();

        System.out.println("Hossza (percben): ");
        song.length = scanner.nextInt();

        System.out.println("Kedvenc zeneszámod adatai:" );
        System.out.println(song.band + "  " + song.title + "  " + song.length + "(perc)");

    }

}
