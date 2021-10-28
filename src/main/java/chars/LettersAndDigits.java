package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        char[] textArray = text.toCharArray();
        for (char ch : textArray) {
            if ( Character.isAlphabetic(ch) ) {
                System.out.println("Betű: "+ch);
            } else if (Character.isDigit(ch)) {
                System.out.println("Számjegy: "+ch);
            } else {
                System.out.println("Egyéb karakter: "+ch);
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits letAndDigits = new LettersAndDigits();
        letAndDigits.printLetterOrDigit("bfa68fF;X");

        Words words = new Words();
        String newWord = words.pushWord("Hello");
        System.out.println("A módosított karakterlánc:  "+newWord);
    }
}
