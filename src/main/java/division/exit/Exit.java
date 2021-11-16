package division.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isX = "x";
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            isX = scanner.nextLine();
        } while (!isX.equals("x"));
    }
}
