package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Kérem, adja meg a nevét!");
        client.name = scanner.nextLine();

        System.out.println("Kérem, adja meg a születési évét!");
        client.year = scanner.nextInt();

        System.out.println("Kérem, adja meg a címét!");
        client.address = scanner.nextLine();

        System.out.println("Az Ön neve: "+client.name);
        System.out.println("Az Ön születési éve: "+client.year);
        System.out.println("Az Ön címe: "+client.address);

    }
}
