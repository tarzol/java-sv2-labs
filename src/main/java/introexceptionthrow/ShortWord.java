package introexceptionthrow;

import introexceptiontrace.Change;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy legfeljebb 5 betűs szót: ");
        String word = scanner.nextLine();
        boolean capital = true;
        if ( word.length() > 5 ) {
            throw new IllegalArgumentException("A szó hosszabb 5 karakternél!");
        }
        for ( int i = 0; i<word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                capital = false;
                throw new IllegalArgumentException("A szó nem csak betűket tartalmaz!");
            }
        }
        if ( capital == true && word.length()<6)
        System.out.println("A megadott szó: "+word);
    }
}
