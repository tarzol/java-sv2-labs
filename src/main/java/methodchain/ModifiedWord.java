package methodchain;

import java.util.Locale;

public class ModifiedWord {
    public String modify(String word) {
        char c = word.toUpperCase().charAt(1);
        return word.toUpperCase().substring(0,3).replace(c, 'x').concat("y");
    }

    public static void main(String[] args) {
        ModifiedWord modifiedWord = new ModifiedWord();
        System.out.println(modifiedWord.modify("alma"));
    }
}

/*public class ModifiedWord {

    public String modify(String word) {
        char c = word.toUpperCase().charAt(1);
        return word.toUpperCase().substring(0, 3).replace(c, 'x').concat("y");
    }
}*/
