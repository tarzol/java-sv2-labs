package controlselection.consonant;

public class ToConsonant {

    public char toCons(char ch) {
        String vowels = "aeiou";
        if ( vowels.indexOf(ch) > 0) {
            return (char)(ch+1);
        }
        return ch;
    }

    public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.toCons('a'));
        System.out.println(toConsonant.toCons('i'));
    }
}
