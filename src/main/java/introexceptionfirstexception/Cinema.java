package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String title;
        int noOfTickets;

        System.out.println("Kérem, add meg a neved: ");
        name = scanner.nextLine();
        System.out.println("Add meg a film címét: ");
        title = scanner.nextLine();
        System.out.println("Hány darabot szeretnél vásárolni? ");
        noOfTickets = scanner.nextInt();

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("Vásárló neve: "+name);
        System.out.println("Film címe: "+title);
        System.out.print("Lefoglalt helyek: ");
        for ( int i = 1; i <= noOfTickets; i++ ) {
            System.out.print("2.sor "+i+". szék, ");
        }
        System.out.println();
        System.out.println("Jó szórakozást!");
    }
}
